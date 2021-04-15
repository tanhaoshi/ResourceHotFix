package com.orange.resourcehotfix.network;

/**
 * create by ths on 2020/6/18
 */
public interface OKHttpClientRequest {

    void responseFailure(String errorMessage);

    void responseSuccess(String successMessage);
}
