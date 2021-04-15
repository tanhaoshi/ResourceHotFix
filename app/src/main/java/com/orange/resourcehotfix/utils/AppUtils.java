package com.orange.resourcehotfix.utils;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import com.blankj.utilcode.util.TimeUtils;
import com.orange.resourcehotfix.ResourceHotFixApplication;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;

/**
 * create by ths on 2020/6/19
 */
public class AppUtils {

    public static String getUUID(){
        String uuid = "";
        SharedPreferences mShare = ResourceHotFixApplication.getInstance().getSharedPreferences("uuid",ResourceHotFixApplication.getInstance().MODE_PRIVATE);
        if(mShare != null){
            uuid = mShare.getString("uuid", "");
        }
        if(TextUtils.isEmpty(uuid)){
            uuid = UUID.randomUUID().toString();
            mShare.edit().putString("uuid",uuid).commit();
        }
        return uuid;
    }

    public static String getRootDirPath(Context context) {
        if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())) {
            File file = ContextCompat.getExternalFilesDirs(context.getApplicationContext(),
                    null)[0];
            return file.getAbsolutePath();
        } else {
            return context.getApplicationContext().getFilesDir().getAbsolutePath();
        }
    }

    public static File getOutputFile(Context context, String dirName, String fileName) {
        File dirFile = new File(getDiskCacheDir(context, dirName));
        if (!dirFile.exists()) {
            if (!dirFile.mkdirs()) {
                return null;
            }
        }
        File file = new File(dirFile.getPath() + File.separator + fileName);
        return file;
    }

    public static String getDiskCacheDir(Context context, String dirName) {
        String cachePath = "";
        if ((Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())
                || !Environment.isExternalStorageRemovable())
                && context != null && context.getExternalCacheDir() != null) {
            cachePath = context.getExternalCacheDir().getPath();
        } else {
            if (context != null && context.getCacheDir() != null) {
                cachePath = context.getCacheDir().getPath();
            }
        }
        return cachePath + File.separator + dirName;
    }

    public static void deleteAllFiles(File root) {
        File files[] = root.listFiles();
        if (files != null)
            for (File f : files) {
                if (f.isDirectory()) { // 判断是否为文件夹
                    deleteAllFiles(f);
                    try {
                        f.delete();
                    } catch (Exception e) {
                    }
                } else {
                    if (f.exists()) { // 判断是否存在
                        deleteAllFiles(f);
                        try {
                            f.delete();
                        } catch (Exception e) {
                        }
                    }
                }
            }
    }

    public static void installApk(Context context, String installPath){
        File file = new File(installPath);
        if(file.exists()){
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            if (Build.VERSION.SDK_INT >= 24) {
                try{
                    intent.addCategory("android.intent.category.DEFAULT");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_GRANT_READ_URI_PERMISSION);
                    Uri contentUri = FileProvider.getUriForFile(context, "com.tomcat.ocr.idcard.fileProvider", file);
                    intent.setDataAndType(contentUri, "application/vnd.android.package-archive");
                }catch (Exception e){
                    e.printStackTrace();
                }
            }else{
                intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            }
            context.startActivity(intent);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static String decimalDouble(double latItude){
        DecimalFormat df = new DecimalFormat("##0.0000");
        String handleValue = df.format(latItude);
        return handleValue;
    }

    /**
     * 将 yyyy年MM月dd日 格式的字符串转换为 yyyy-mm-dd格式
     * @param strDate
     * @return
     */
    public static String dateTransformOfString(String strDate){

        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = null;
        try {
            date = format.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String formatDate = TimeUtils.date2String(date,"yyyy-MM-dd");
        return formatDate;
    }


    /**
     * 手机号正则表达式
     **/
    public final static String MOBLIE_PHONE_PATTERN = "^((13[0-9])|(15[0-9])|(18[0-9])|(14[7])|(17[0|3|6|7|8]))\\d{8}$";

    /**
     * 通过正则验证是否是合法手机号码
     *
     * @param phoneNumber
     * @return
     */
    public static boolean isMobile(String phoneNumber) {
        Pattern p = Pattern.compile(MOBLIE_PHONE_PATTERN);
        Matcher m = p.matcher(phoneNumber);
        return m.matches();
    }

    public static void onInactive(Context context, EditText et) {

        if (et == null)
            return;

        et.clearFocus();
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(et.getWindowToken(), 0);
    }

    public static void onActive(Context context, EditText et) {
        if (et == null)
            return;

        et.requestFocus();
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(et, 0);

    }

    private final static String RSA = "RSA";

    private final static String MD5_WITH_RSA = "MD5withRSA";

    /**
     * 执行签名
     *
     * @param rsaPrivateKey 私钥
     * @param toSignStr     参数内容
     * @return 签名后的内容，base64后的字符串
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeySpecException
     * @throws InvalidKeyException
     * @throws SignatureException
     */
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String executeSignature(String rsaPrivateKey, String toSignStr) throws Exception {
        // base64解码私钥
//        byte[] decodePrivateKey = Base64.getDecoder().decode(rsaPrivateKey.replace("\r\n", ""));
        byte[] decodePrivateKey = Base64Util.decode(rsaPrivateKey.replace("\r\n", ""));
        PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(decodePrivateKey);
        KeyFactory keyFactory = KeyFactory.getInstance(RSA);
        PrivateKey privateKey = keyFactory.generatePrivate(pkcs8EncodedKeySpec);
        Signature signature = Signature.getInstance(MD5_WITH_RSA);
        signature.initSign(privateKey);
        signature.update(toSignStr.getBytes());

        // 生成签名
        byte[] result = signature.sign();

        // base64编码签名为字符串
//        Base64.getEncoder().encodeToString(result)
        return Base64Util.encode(result);
    }

    public static String createSignature(String reg){
        String sign = null;
        String urlEncodeSign = null;
        try {
            sign = AppUtils.executeSignature(ResourceHotFixApplication.getSign(), reg);
        }catch (Exception e) {
            e.printStackTrace();
        }

        try {
            urlEncodeSign = URLEncoder.encode(sign, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return urlEncodeSign;
    }

    /**
     判断当前设备是手机还是平板，代码来自 Google I/O App for Android
     @param context
     @return 平板返回 True，手机返回 False
     */
    public static boolean isPad(Context context) {
        return (context.getResources().getConfiguration().screenLayout
                & Configuration.SCREENLAYOUT_SIZE_MASK)
                >= Configuration.SCREENLAYOUT_SIZE_LARGE;
    }
}
