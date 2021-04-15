package com.orange.resourcehotfix.network;


import com.orange.resourcehotfix.utils.Constant;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 */

public class NetWorkUtils {

    private static volatile NetWorkUtils sNetWorkUtils;

    private static volatile OkHttpClient sOkHttpClient;

    private Retrofit mRetrofit;

    private NetWorkUtils(){
                 mRetrofit = new Retrofit.Builder()
                .baseUrl(Constant.BASE_URL)
                .client(NetWorkUtils.getOkHttpClient())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    public static NetWorkUtils getInstance(){
        if(sNetWorkUtils == null){
            synchronized(NetWorkUtils.class){
                if(sNetWorkUtils == null){
                    sNetWorkUtils = new NetWorkUtils();
                }
            }
        }
        return sNetWorkUtils;
    }

    public static OkHttpClient getOkHttpClient(){
        if(sOkHttpClient == null){
            synchronized (NetWorkUtils.class){
                if(sOkHttpClient == null){
                    sOkHttpClient = OkHttpUtil.getInstance().getOkHttpClient();
                    sOkHttpClient.sslSocketFactory();
                }
            }
        }
        return sOkHttpClient;
    }

    @SuppressWarnings("unchecked") // Single-interface proxy creation guarded by parameter safety.
    public <T> T createService(final Class<T> service){
        return mRetrofit.create(service);
    }

}
