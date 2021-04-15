package com.orange.sitesign_master;

/**
 * create by ths on 2020/10/21
 */
public class NativeSignManager {

    public static NativeSignManager sNativeSignManager;

    public static NativeSignManager getInstance(){
        if(sNativeSignManager == null){
            sNativeSignManager = new NativeSignManager();
        }
        return sNativeSignManager;
    }

    static {
        System.loadLibrary("native-lib");
    }

    public native String stringFromJNI();
}
