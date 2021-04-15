package com.orange.resourcehotfix.network;

/**
 * create by ths on 2020/11/9
 */
public interface UploadOKHttpResponse extends OKHttpClientRequest{

    void onProgress(long totalBytes, long remainingBytes, boolean done);
}
