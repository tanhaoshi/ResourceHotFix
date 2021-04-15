package com.orange.resourcehotfix.networkmodel;

import java.util.List;

/**
 * create by ths on 2020/8/26
 */
public class PeopleTypeModel {


    /**
     * code : 1000
     * message : 请求处理成功
     * result : [{"category":"EMP_TYPR_SZZJJ","createDate":1595400014000,"groupTitle":"深圳住建局人员类型","id":"982b94fd75f1fcb84500234a5c9afa7f","tag":"05","title":"其他参建单位管理人员"},{"category":"EMP_TYPR_SZZJJ","createDate":1595400014000,"groupTitle":"深圳住建局人员类型","id":"aa58fdabd371716c7222147a09e62787","tag":"02","title":"监理单位管理人员"},{"category":"EMP_TYPR_SZZJJ","createDate":1595400014000,"groupTitle":"深圳住建局人员类型","id":"c4bd70585ec93b9074590ecc5d864406","tag":"01","title":"建设单位管理人员"},{"category":"EMP_TYPR_SZZJJ","createDate":1595400014000,"groupTitle":"深圳住建局人员类型","id":"c95ffd25d73726629826f5256d734163","tag":"03","title":"施工单位管理人员"},{"category":"EMP_TYPR_SZZJJ","createDate":1595400014000,"groupTitle":"深圳住建局人员类型","id":"e908f3c683515338c33787e058311f47","tag":"00","title":"劳务工人"}]
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
         * category : EMP_TYPR_SZZJJ
         * createDate : 1595400014000
         * groupTitle : 深圳住建局人员类型
         * id : 982b94fd75f1fcb84500234a5c9afa7f
         * tag : 05
         * title : 其他参建单位管理人员
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
