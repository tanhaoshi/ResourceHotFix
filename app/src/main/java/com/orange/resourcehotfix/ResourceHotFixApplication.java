package com.orange.resourcehotfix;

import android.app.Application;
import android.content.Context;

/**
 * create by ths on 2021/3/31
 */
public class ResourceHotFixApplication extends Application {

    private static final String TAG = "ResourceHotFixApplication";

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
