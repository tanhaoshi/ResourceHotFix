package com.orange.resourcehotfix.networkmodel;

import java.util.List;

/**
 * create by ths on 2020/7/31
 */
public class WorkersInfoModel {


    /**
     * code : 1000
     * message : 请求处理成功
     * result : {"current":1,"orders":[],"pages":1,"records":[{"empId":"1","empName":"许俊杰","isAmClock":0,"isClock":"0","tag":"电瓶车司机","teamId":"1453","teamName":"市政一队"}],"searchCount":true,"size":500,"total":1}
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
         * records : [{"empId":"1","empName":"许俊杰","isAmClock":0,"isClock":"0","tag":"电瓶车司机","teamId":"1453","teamName":"市政一队"}]
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
             * empId : 1
             * empName : 许俊杰
             * isAmClock : 0
             * isClock : 0
             * tag : 电瓶车司机
             * teamId : 1453
             * teamName : 市政一队
             * clockNum : 考勤天数
             * amClockNum : 上报天数
             * constructionName:参建单位名称
             * enterAndRetreatCondition 进场状态出场状态
             * endTime 退场时间
             * a101 金额
             *salaryReviewStatus 是否可以提交
             */

            private String empId;
            private String empName;
            private int isAmClock;
            private String isClock;
            private String tag;
            private String teamId;
            private String teamName;
            private String clockNum;
            private String amClockNum;
            private String constructionName;
            private Integer enterAndRetreatCondition;
            private String endTime;
            private double a101;
            private String monthWorkLoad;
            private int salaryReviewStatus;
            private String unit;

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

            public int getIsAmClock() {
                return isAmClock;
            }

            public void setIsAmClock(int isAmClock) {
                this.isAmClock = isAmClock;
            }

            public String getIsClock() {
                return isClock;
            }

            public void setIsClock(String isClock) {
                this.isClock = isClock;
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

            public String getClockNum() {
                return clockNum;
            }

            public void setClockNum(String clockNum) {
                this.clockNum = clockNum;
            }

            public String getAmClockNum() {
                return amClockNum;
            }

            public void setAmClockNum(String amClockNum) {
                this.amClockNum = amClockNum;
            }

            public String getConstructionName() {
                return constructionName;
            }

            public void setConstructionName(String constructionName) {
                this.constructionName = constructionName;
            }

            public Integer getEnterAndRetreatCondition() {
                return enterAndRetreatCondition;
            }

            public void setEnterAndRetreatCondition(Integer enterAndRetreatCondition) {
                this.enterAndRetreatCondition = enterAndRetreatCondition;
            }

            public String getEndTime() {
                return endTime;
            }

            public void setEndTime(String endTime) {
                this.endTime = endTime;
            }

            public double getA101() {
                return a101;
            }

            public void setA101(double a101) {
                this.a101 = a101;
            }

            public String getMonthWorkLoad() {
                return monthWorkLoad;
            }

            public void setMonthWorkLoad(String monthWorkLoad) {
                this.monthWorkLoad = monthWorkLoad;
            }

            public int getSalaryReviewStatus() {
                return salaryReviewStatus;
            }

            public void setSalaryReviewStatus(int salaryReviewStatus) {
                this.salaryReviewStatus = salaryReviewStatus;
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
