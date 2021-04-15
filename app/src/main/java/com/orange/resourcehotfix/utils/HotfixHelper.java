package com.orange.resourcehotfix.utils;

import android.content.Context;
import android.os.Build;
import android.util.Log;

import com.master.hotfix.codefix.ClassLoaderCore;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 热修复核心类
 */
public class HotfixHelper {

    public static void fix(Context myApp, final String fixPath, final String hackPath) {
        //批量更新class是没有任何问题的  ...
        try {
            String fixAbsPath = AssetsFileUtil.copyAssetToCache(myApp, fixPath);
            String hackAbsPath = AssetsFileUtil.copyAssetToCache(myApp, hackPath);

            Log.d("hoxFixHelperTag", "hackPath:" + hackAbsPath);
            Log.d("hoxFixHelperTag", "fixPath:" + fixAbsPath + ";hackPath:" + hackAbsPath);
            File fixFile = new File(fixAbsPath);
            File hackFile = new File(hackAbsPath);
            List<File> fileList = new ArrayList<>();
            fileList.add(hackFile);
            fileList.add(fixFile);

            if (Build.VERSION.SDK_INT >= 23) {
                ClassLoaderCore.hookV23(myApp.getClassLoader(), fileList, myApp.getCacheDir());
            } else if (Build.VERSION.SDK_INT >= 19) {
                ClassLoaderCore.hookV19(myApp.getClassLoader(), fileList, myApp.getCacheDir());
            } else if (Build.VERSION.SDK_INT >= 14) {
                ClassLoaderCore.hookV14(myApp.getClassLoader(), fileList, myApp.getCacheDir());
            }
        } catch (Exception e) {
            Log.d("hoxFixHelperTag", e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}
