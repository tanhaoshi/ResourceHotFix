package com.orange.resourcehotfix.networkmodel;

import java.util.List;

/**
 * create by ths on 2020/7/31
 */
public class SalaryTeamModel {


    /**
     * code : 1000
     * message : 请求处理成功
     * result : {"current":1,"orders":[],"pages":1,"records":[{"id":"1453","status":0,"teamName":"市政一队"}],"searchCount":true,"size":500,"total":1}
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
         * pages : 1
         * records : [{"id":"1453","status":0,"teamName":"市政一队"}]
         * searchCount : true
         * size : 500
         * total : 1
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
             * id : 1453
             * status : 0
             * teamName : 市政一队
             */

            private String id;
            private int status;
            private String teamName;
            private String constructionName;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
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

            public String getConstructionName() {
                return constructionName;
            }

            public void setConstructionName(String constructionName) {
                this.constructionName = constructionName;
            }
        }
    }
}
