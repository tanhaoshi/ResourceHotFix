package com.orange.resourcehotfix.networkmodel;

import java.util.List;

/**
 * create by ths on 2020/6/18
 */
public class DictionariesModel {


    /**
     * code : 1000
     * message : 请求处理成功
     * result : [{"category":"WORK_TYPE","createDate":1595400296000,"groupTitle":"工种","hot":1,"id":"00c6b866cf50054d478b0a2bca0599b5","tag":"3CB93B6EC5AA93C1DE7E9BD9057B2013","title":"项目部/总经济师","type":2}]
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
         * category : WORK_TYPE
         * createDate : 1595400296000
         * groupTitle : 工种
         * hot : 1
         * id : 00c6b866cf50054d478b0a2bca0599b5
         * tag : 3CB93B6EC5AA93C1DE7E9BD9057B2013
         * title : 项目部/总经济师
         * type : 2
         */

        private String category;
        private long createDate;
        private String groupTitle;
        private int hot;
        private String id;
        private String tag;
        private String title;
        private int type;

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public long getCreateDate() {
            return createDate;
        }

        public void setCreateDate(long createDate) {
            this.createDate = createDate;
        }

        public String getGroupTitle() {
            return groupTitle;
        }

        public void setGroupTitle(String groupTitle) {
            this.groupTitle = groupTitle;
        }

        public int getHot() {
            return hot;
        }

        public void setHot(int hot) {
            this.hot = hot;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }
}
