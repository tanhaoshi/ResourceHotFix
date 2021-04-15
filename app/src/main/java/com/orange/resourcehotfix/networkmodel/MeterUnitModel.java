package com.orange.resourcehotfix.networkmodel;

import java.util.List;

/**
 * create by ths on 2020/8/26
 */
public class MeterUnitModel {


    /**
     * code : 1000
     * message : 请求处理成功
     * result : [{"group_title":"计量单位","id":"12d327843d4b23143d396498aaa76f8f","tag":"42a7ef98ee4d4fbc95e980f8f5fd86c3","category":"UNIT","title":"米","hot":0,"create_date":1598326203000},{"group_title":"计量单位","id":"2d0dafaf344e54b3785c588cdaed7702","tag":"018b900f502d443e9acc30b997506fc3","category":"UNIT","title":"立方","hot":0,"create_date":1598326180000},{"group_title":"计量单位","id":"4da3c088bc871c31c77cc819fa7b4fc6","tag":"7a570f16c45a455d9f75a4e716af1c86","category":"UNIT","title":"平方","hot":0,"create_date":1597893641000},{"group_title":"计量单位","id":"5df82059b60804c76b5b7262a12aa974","tag":"1038417f212e4df699b57a2541e53fc5","category":"UNIT","title":"千米","hot":0,"create_date":1598326209000},{"group_title":"计量单位","id":"a2d7bbd89f71799d365ec95fbe3eb2d0","tag":"0961b17c1c9a4fc98cba5daa089a2b7d","category":"UNIT","title":"升","hot":0,"create_date":1598326171000},{"group_title":"计量单位","id":"b8482cdd9956b1c4a53ba7c7b535b69d","tag":"ee9a3a4dcf534e3bb4bcc50b181b5df4","category":"UNIT","title":"吨","hot":0,"create_date":1597893656000}]
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
         * group_title : 计量单位
         * id : 12d327843d4b23143d396498aaa76f8f
         * tag : 42a7ef98ee4d4fbc95e980f8f5fd86c3
         * category : UNIT
         * title : 米
         * hot : 0
         * create_date : 1598326203000
         */

        private String group_title;
        private String id;
        private String tag;
        private String category;
        private String title;
        private int hot;
        private long create_date;

        public String getGroup_title() {
            return group_title;
        }

        public void setGroup_title(String group_title) {
            this.group_title = group_title;
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

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getHot() {
            return hot;
        }

        public void setHot(int hot) {
            this.hot = hot;
        }

        public long getCreate_date() {
            return create_date;
        }

        public void setCreate_date(long create_date) {
            this.create_date = create_date;
        }
    }
}
