package com.orange.resourcehotfix.networkmodel;

/**
 * create by ths on 2020/7/29
 */
public class WorkSalaryModel {

    private String name;
    private String projectName;
    private String teamName;
    private String workType;
    private String workStatus;
    private String workDay;
    private String factDay;
    private String salary;

    public WorkSalaryModel(String name, String projectName, String teamName, String workType, String workStatus, String workDay, String factDay) {
        this.name = name;
        this.projectName = projectName;
        this.teamName = teamName;
        this.workType = workType;
        this.workStatus = workStatus;
        this.workDay = workDay;
        this.factDay = factDay;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public String getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }

    public String getWorkDay() {
        return workDay;
    }

    public void setWorkDay(String workDay) {
        this.workDay = workDay;
    }

    public String getFactDay() {
        return factDay;
    }

    public void setFactDay(String factDay) {
        this.factDay = factDay;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
