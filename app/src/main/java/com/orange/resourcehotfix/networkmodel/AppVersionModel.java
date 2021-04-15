package com.orange.resourcehotfix.networkmodel;

/**
 * create by ths on 2020/6/20
 */
public class AppVersionModel {


    /**
     * code : 1000
     * message : 请求处理成功
     * result : {"content":"","createTime":1534121862000,"deviceType":1,"downloadUrl":"test","id":"f2975f2881aa4c539e632f7ad155e4a5","isDel":0,"isPart":0,"isUpdate":1,"version":"V1.0.0"}
     */

    private int code;
    private String message;
    private ResultBean result;

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

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * content :
         * createTime : 1534121862000
         * deviceType : 1
         * downloadUrl : test
         * id : f2975f2881aa4c539e632f7ad155e4a5
         * isDel : 0
         * isPart : 0
         * isUpdate : 1
         * version : V1.0.0
         */

        private String content;
        private long createTime;
        private int deviceType;
        private String downloadUrl;
        private String id;
        private int isDel;
        private int isPart;
        private int isUpdate;
        private String version;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public int getDeviceType() {
            return deviceType;
        }

        public void setDeviceType(int deviceType) {
            this.deviceType = deviceType;
        }

        public String getDownloadUrl() {
            return downloadUrl;
        }

        public void setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getIsDel() {
            return isDel;
        }

        public void setIsDel(int isDel) {
            this.isDel = isDel;
        }

        public int getIsPart() {
            return isPart;
        }

        public void setIsPart(int isPart) {
            this.isPart = isPart;
        }

        public int getIsUpdate() {
            return isUpdate;
        }

        public void setIsUpdate(int isUpdate) {
            this.isUpdate = isUpdate;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }
    }
}
