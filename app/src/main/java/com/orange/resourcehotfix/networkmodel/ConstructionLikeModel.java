package com.orange.resourcehotfix.networkmodel;

import java.util.List;

/**
 * create by ths on 2020/12/15
 */
public class ConstructionLikeModel {


    /**
     * code : 1000
     * message : 请求处理成功
     * result : [{"constructionName":"中建八局","id":"4a59f12eedc0d907995b0d2dc609fd8c"},{"constructionName":"中建三局集团有限公司深圳分公司","id":"ad5c24101dfb6e40b83c4751c5cab976"}]
     */

    private int code;
    private String message;
    private List<ResultBean> result;

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

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * constructionName : 中建八局
         * id : 4a59f12eedc0d907995b0d2dc609fd8c
         */

        private String constructionName;
        private String id;

        public String getConstructionName() {
            return constructionName;
        }

        public void setConstructionName(String constructionName) {
            this.constructionName = constructionName;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}
