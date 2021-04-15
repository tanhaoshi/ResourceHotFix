package com.orange.resourcehotfix;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.orange.resourcehotfix.utils.HotfixHelper;
import com.orange.sitesign_master.NativeSignManager;


/**
 * create by ths on 2021/3/31
 */
public class ResourceHotFixApplication extends Application {

    private static final String TAG = "ResourceHotFixApplication";

    public static ResourceHotFixApplication sResourceHotFixApplication;

    private static NativeSignManager sSignManager;

    public static ResourceHotFixApplication getInstance(){
        return sResourceHotFixApplication;
    }

    public static String getSign(){
        if(sSignManager == null){
            sSignManager = new NativeSignManager();
        }
        return sSignManager.stringFromJNI();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        HotfixHelper.fix(this,"patch.dex","hack.dex");

        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sResourceHotFixApplication = this;
    }
}
