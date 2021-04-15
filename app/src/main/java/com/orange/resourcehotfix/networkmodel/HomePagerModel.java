package com.orange.resourcehotfix.networkmodel;

/**
 * create by ths on 2020/6/17
 */
public class HomePagerModel {


    /**
     * code : 1000
     * message : 请求处理成功
     * result : {"adminIstrationCount":8,"adminSituation":0,"attendanceAdminCount":0,"attendanceLaborCount":0,"bePresentAdminIstrationCount":7,"bePresentLaborCount":1,"laborCount":1,"laborSituation":0}
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
         * adminIstrationCount : 8
         * adminSituation : 0.0
         * attendanceAdminCount : 0
         * attendanceLaborCount : 0
         * bePresentAdminIstrationCount : 7
         * bePresentLaborCount : 1
         * laborCount : 1
         * laborSituation : 0.0    劳务工人情况
         */

        private int adminIstrationCount;
        private double adminSituation;
        private int attendanceAdminCount;
        private int attendanceLaborCount;
        private int bePresentAdminIstrationCount;
        private int bePresentLaborCount;
        private int laborCount;
        private double laborSituation;

        public int getAdminIstrationCount() {
            return adminIstrationCount;
        }

        public void setAdminIstrationCount(int adminIstrationCount) {
            this.adminIstrationCount = adminIstrationCount;
        }

        public double getAdminSituation() {
            return adminSituation;
        }

        public void setAdminSituation(double adminSituation) {
            this.adminSituation = adminSituation;
        }

        public int getAttendanceAdminCount() {
            return attendanceAdminCount;
        }

        public void setAttendanceAdminCount(int attendanceAdminCount) {
            this.attendanceAdminCount = attendanceAdminCount;
        }

        public int getAttendanceLaborCount() {
            return attendanceLaborCount;
        }

        public void setAttendanceLaborCount(int attendanceLaborCount) {
            this.attendanceLaborCount = attendanceLaborCount;
        }

        public int getBePresentAdminIstrationCount() {
            return bePresentAdminIstrationCount;
        }

        public void setBePresentAdminIstrationCount(int bePresentAdminIstrationCount) {
            this.bePresentAdminIstrationCount = bePresentAdminIstrationCount;
        }

        public int getBePresentLaborCount() {
            return bePresentLaborCount;
        }

        public void setBePresentLaborCount(int bePresentLaborCount) {
            this.bePresentLaborCount = bePresentLaborCount;
        }

        public int getLaborCount() {
            return laborCount;
        }

        public void setLaborCount(int laborCount) {
            this.laborCount = laborCount;
        }

        public double getLaborSituation() {
            return laborSituation;
        }

        public void setLaborSituation(double laborSituation) {
            this.laborSituation = laborSituation;
        }
    }
}
