package com.orange.resourcehotfix.networkmodel;

import java.util.List;

/**
 * create by ths on 2021/3/10
 */
public class WorkersTeamModel {


    /**
     * code : 1000
     * message : 请求处理成功
     * result : [{"constructionId":"4a59f12eedc0d907995b0d2dc609fd8c","createDate":1596697680000,"id":"25c3e9fd5259038eb4b56bb009991a68","inTime":1606469606000,"projectId":"47768b8681aa5be8390c73377a16745d","remark":"","showStatus":0,"status":0,"teamName":"分包管理人员","teamType":"018","updateDate":1606469606000}]
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
         * constructionId : 4a59f12eedc0d907995b0d2dc609fd8c
         * createDate : 1596697680000
         * id : 25c3e9fd5259038eb4b56bb009991a68
         * inTime : 1606469606000
         * projectId : 47768b8681aa5be8390c73377a16745d
         * remark :
         * showStatus : 0
         * status : 0
         * teamName : 分包管理人员
         * teamType : 018
         * updateDate : 1606469606000
         */

        private String constructionId;
        private long createDate;
        private String id;
        private long inTime;
        private String projectId;
        private String remark;
        private int showStatus;
        private int status;
        private String teamName;
        private String teamType;
        private long updateDate;

        public String getConstructionId() {
            return constructionId;
        }

        public void setConstructionId(String constructionId) {
            this.constructionId = constructionId;
        }

        public long getCreateDate() {
            return createDate;
        }

        public void setCreateDate(long createDate) {
            this.createDate = createDate;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public long getInTime() {
            return inTime;
        }

        public void setInTime(long inTime) {
            this.inTime = inTime;
        }

        public String getProjectId() {
            return projectId;
        }

        public void setProjectId(String projectId) {
            this.projectId = projectId;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public int getShowStatus() {
            return showStatus;
        }

        public void setShowStatus(int showStatus) {
            this.showStatus = showStatus;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getTeamName() {
            return teamName;
        }

        public void setTeamName(String teamName) {
            this.teamName = teamName;
        }

        public String getTeamType() {
            return teamType;
        }

        public void setTeamType(String teamType) {
            this.teamType = teamType;
        }

        public long getUpdateDate() {
            return updateDate;
        }

        public void setUpdateDate(long updateDate) {
            this.updateDate = updateDate;
        }
    }
}
