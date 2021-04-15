package com.orange.resourcehotfix.networkmodel;

import java.util.List;

/**
 * create by ths on 2020/8/26
 */
public class WorkPostModel {

    /**
     * code : 1000
     * message : 请求处理成功
     * result : [{"category":"JOB_TYPENAME_SZZJJ","createDate":1595400166000,"groupTitle":"深圳住建局工种/岗位","id":"0e6ebff5815375622ffe846c0f37a1fb","tag":"1","title":"一般作业工种"},{"category":"JOB_TYPENAME_SZZJJ","createDate":1595400166000,"groupTitle":"深圳住建局工种/岗位","id":"3fbeeadb3a955dc88fe8ed525a6f8d91","tag":"3","title":"项目管理岗位"},{"category":"JOB_TYPENAME_SZZJJ","createDate":1595400166000,"groupTitle":"深圳住建局工种/岗位","id":"58c53fc8f104031e13e6004ab1b39000","tag":"4","title":"其它工种"},{"category":"JOB_TYPENAME_SZZJJ","createDate":1595400166000,"groupTitle":"深圳住建局工种/岗位","id":"9f1ad1e567b75e3b163c69c045e2892b","tag":"2","title":"特种作业工种"}]
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
         * category : JOB_TYPENAME_SZZJJ
         * createDate : 1595400166000
         * groupTitle : 深圳住建局工种/岗位
         * id : 0e6ebff5815375622ffe846c0f37a1fb
         * tag : 1
         * title : 一般作业工种
         */

        private String category;
        private long createDate;
        private String groupTitle;
        private String id;
        private String tag;
        private String title;

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
    }
}
