package com.orange.resourcehotfix.networkmodel;

/**
 * create by ths on 2020/6/18
 */
public class RegisterInfoModel {


    /**
     * code : 1000
     * message : 请求处理成功
     */

    private int code;
    private String message;
    private int result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
