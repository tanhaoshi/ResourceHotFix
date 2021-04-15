package com.orange.resourcehotfix.networkmodel;

import java.util.List;

/**
 * create by ths on 2020/7/28
 */
public class MouthAttendanceModel {
    /**
     * code : 1000
     * message : 请求处理成功
     * result : {"current":1,"orders":[],"pages":1,"records":[{"attendanceManualId":"27","empId":"1001022","empName":"曹隆鑫","recordContent":"33.3","tag":"材料员","teamId":"1453","teamName":"市政一队"},{"attendanceManualId":"22","empId":"2","empName":"曾哲","recordContent":"66","tag":"安全员","teamId":"1453"}],"searchCount":true,"size":500,"total":2}
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
         * records : [{"attendanceManualId":"27","empId":"1001022","empName":"曹隆鑫","recordContent":"33.3","tag":"材料员","teamId":"1453","teamName":"市政一队"},{"attendanceManualId":"22","empId":"2","empName":"曾哲","recordContent":"66","tag":"安全员","teamId":"1453"}]
         * searchCount : true
         * size : 500
         * total : 2
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
             * attendanceManualId : 27
             * empId : 1001022
             * empName : 曹隆鑫
             * recordContent : 33.3
             * tag : 材料员
             * teamId : 1453
             * teamName : 市政一队
             */

            private String attendanceManualId;
            private String empId;
            private String empName;
            private String recordContent;
            private String tag;
            private String teamId;
            private String teamName;
            private String monthWorkLoad;
            private String unit;

            public String getAttendanceManualId() {
                return attendanceManualId;
            }

            public void setAttendanceManualId(String attendanceManualId) {
                this.attendanceManualId = attendanceManualId;
            }

            public String getEmpId() {
                return empId;
            }

            public void setEmpId(String empId) {
                this.empId = empId;
            }

            public String getEmpName() {
                return empName;
            }

            public void setEmpName(String empName) {
                this.empName = empName;
            }

            public String getRecordContent() {
                return recordContent;
            }

            public void setRecordContent(String recordContent) {
                this.recordContent = recordContent;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getTeamId() {
                return teamId;
            }

            public void setTeamId(String teamId) {
                this.teamId = teamId;
            }

            public String getTeamName() {
                return teamName;
            }

            public void setTeamName(String teamName) {
                this.teamName = teamName;
            }

            public String getMonthWorkLoad() {
                return monthWorkLoad;
            }

            public void setMonthWorkLoad(String monthWorkLoad) {
                this.monthWorkLoad = monthWorkLoad;
            }

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }
        }
    }
}
