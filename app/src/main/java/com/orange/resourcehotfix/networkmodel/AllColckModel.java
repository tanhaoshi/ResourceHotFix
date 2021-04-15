package com.orange.resourcehotfix.networkmodel;

import java.util.List;

/**
 * create by ths on 2020/8/5
 */
public class AllColckModel {


    /**
     * code : 1000
     * message : 请求处理成功
     * result : [{"allSave":false,"personNum":3,"startTime":"2020-08-01","workLoadNum":0},{"allSave":false,"personNum":4,"startTime":"2020-08-02","workLoadNum":0},{"allSave":false,"personNum":4,"startTime":"2020-08-03","workLoadNum":0},{"allSave":false,"personNum":4,"startTime":"2020-08-04","workLoadNum":0},{"allSave":false,"personNum":3,"startTime":"2020-08-05","workLoadNum":2,"workersDayload":"627"}]
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
         * allSave : false
         * personNum : 3
         * startTime : 2020-08-01
         * workLoadNum : 0
         * workersDayload : 627
         */

        private boolean allSave;
        private int personNum;
        private String startTime;
        private int workLoadNum;
        private String workersDayload;

        public boolean isAllSave() {
            return allSave;
        }

        public void setAllSave(boolean allSave) {
            this.allSave = allSave;
        }

        public int getPersonNum() {
            return personNum;
        }

        public void setPersonNum(int personNum) {
            this.personNum = personNum;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public int getWorkLoadNum() {
            return workLoadNum;
        }

        public void setWorkLoadNum(int workLoadNum) {
            this.workLoadNum = workLoadNum;
        }

        public String getWorkersDayload() {
            return workersDayload;
        }

        public void setWorkersDayload(String workersDayload) {
            this.workersDayload = workersDayload;
        }
    }
}
