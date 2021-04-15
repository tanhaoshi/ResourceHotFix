package com.orange.resourcehotfix.networkmodel;

import java.util.Date;

public class AttendanceManual{
	
	/**
	 * 手工考勤表
	 */
	private String id;
	
	/**
	 * 员工id
	 */
	private String employeeId;
	
	/**
	 * 创建日期
	 */
	private Date createDate;
	
	/**
	 * 记录内容
	 */
	private String recordContent;
	
	/**
	 * 类型(1:工时 2:工量)
	 */
	private Integer type;
	
	/**
	 * 工量日期（type为2时才有值）
	 */
	private String day;
	
	/**
	 * 是否考勤  0-X ,1-√
	 * @return
	 */
	private Integer isAmClock;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getRecordContent() {
		return recordContent;
	}

	public void setRecordContent(String recordContent) {
		this.recordContent = recordContent;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getIsAmClock() {
		return isAmClock;
	}

	public void setIsAmClock(Integer isAmClock) {
		this.isAmClock = isAmClock;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	@Override
    public String toString() {
        return "AttendanceManual{" +
        "id=" + id +
        ", employeeId=" + employeeId +
        ", createDate=" + createDate +
        ", recordContent=" + recordContent +
        ", type=" + type +
        ", day=" + day +
        "}";
    }

}
