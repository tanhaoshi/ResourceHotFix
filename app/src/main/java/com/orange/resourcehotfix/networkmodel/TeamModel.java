package com.orange.resourcehotfix.networkmodel;

import java.util.List;

/**
 * create by ths on 2020/6/18
 */
public class TeamModel {


    /**
     * code : 1000
     * message : 请求处理成功
     * result : {"current":1,"orders":[],"pages":3,"records":[{"constructionId":"551","createDate":1562585266000,"id":"1010","projectId":"319","remark":"41CEFE58-D70B-49FD-A741-2F3E9AA6E6A7","showStatus":0,"status":0,"teamName":"安装空调"},{"constructionId":"551","createDate":1562585267000,"id":"1013","projectId":"319","remark":"28562277-A6F8-4D83-A497-20534CBD1F6C","showStatus":0,"status":0,"teamName":"太英通讯"}],"searchCount":true,"size":2,"total":5}
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
         * current : 1
         * orders : []
         * pages : 3
         * records : [{"constructionId":"551","createDate":1562585266000,"id":"1010","projectId":"319","remark":"41CEFE58-D70B-49FD-A741-2F3E9AA6E6A7","showStatus":0,"status":0,"teamName":"安装空调"},{"constructionId":"551","createDate":1562585267000,"id":"1013","projectId":"319","remark":"28562277-A6F8-4D83-A497-20534CBD1F6C","showStatus":0,"status":0,"teamName":"太英通讯"}]
         * searchCount : true
         * size : 2
         * total : 5
         */

        private int current;
        private int pages;
        private boolean searchCount;
        private int size;
        private int total;
        private List<?> orders;
        private List<RecordsBean> records;

        public int getCurrent() {
            return current;
        }

        public void setCurrent(int current) {
            this.current = current;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }

        public boolean isSearchCount() {
            return searchCount;
        }

        public void setSearchCount(boolean searchCount) {
            this.searchCount = searchCount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<?> getOrders() {
            return orders;
        }

        public void setOrders(List<?> orders) {
            this.orders = orders;
        }

        public List<RecordsBean> getRecords() {
            return records;
        }

        public void setRecords(List<RecordsBean> records) {
            this.records = records;
        }

        public static class RecordsBean {
            /**
             * constructionId : 551
             * createDate : 1562585266000
             * id : 1010
             * projectId : 319
             * remark : 41CEFE58-D70B-49FD-A741-2F3E9AA6E6A7
             * showStatus : 0
             * status : 0
             * teamName : 安装空调
             */

            private String constructionId;
            private long createDate;
            private String id;
            private String projectId;
            private String remark;
            private int showStatus;
            private int status;
            private String teamName;

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
        }
    }
}
