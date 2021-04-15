package com.orange.resourcehotfix.networkmodel;

/**
 * create by ths on 2021/4/9
 */
public class ResponseBodyModel {


    /**
     * code : 1000
     * message : 请求处理成功
     * result : 18573733796
     */

    private int code;
    private String message;
    private String result;

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

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
