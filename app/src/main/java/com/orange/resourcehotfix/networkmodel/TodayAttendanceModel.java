package com.orange.resourcehotfix.networkmodel;

/**
 * create by ths on 2020/7/28
 */
public class TodayAttendanceModel {

    private String workPeople;
    private String workType;
    private int    attendance;
    private int    attendanceConfirm;

    public TodayAttendanceModel(String workPeople, String workType, int attendance, int attendanceConfirm) {
        this.workPeople = workPeople;
        this.workType = workType;
        this.attendance = attendance;
        this.attendanceConfirm = attendanceConfirm;
    }

    public String getWorkPeople() {
        return workPeople;
    }

    public void setWorkPeople(String workPeople) {
        this.workPeople = workPeople;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public int getAttendanceConfirm() {
        return attendanceConfirm;
    }

    public void setAttendanceConfirm(int attendanceConfirm) {
        this.attendanceConfirm = attendanceConfirm;
    }
}
