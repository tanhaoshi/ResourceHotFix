package com.orange.resourcehotfix.networkmodel;

/**
 * create by ths on 2020/6/19
 */
public class ResponseModel {


    /**
     * code : 1000
     * message : 请求处理成功
     */

    private int code;
    private String message;

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

}
