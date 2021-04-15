package com.orange.resourcehotfix.networkmodel;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 考勤记录
 * </p>
 *
 * @author xieming
 * @since 2020-05-22
 */
public class AttendanceRecord implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    private String id;

    /**
     * 项目编号
     */
    private String projectId;

    /**
     * 员工编号
     */
    private String employeeId;

    /**
     * 通过时间 ”yyyy-MM-dd hh:mm:ss”
     */
    private Date passedTime;

    /**
     * 通行方向  in—进，out—出
     */
    private String direction;

    /**
     * 通行方式 1—人脸识别，2—虹膜识别，3—指纹识别，4—掌形识别，5—身份证识别，6—实名卡，7—异常清退（适用于人员没有通过闸机系统出工地而导致人员状态不一致的情况），8—一键开闸(需要与闸机交互)， 9—应急通道（不需要与闸机交互），10—二维码识别，11-其他方式
     */
    private Integer way;

    /**
     * 工地现场采集的人脸照片，url
     */
    private String sitePhoto;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 上传时间
     */
    private Date uploadTime;

    /**
     * 考勤设备类型（Android，iOS...）
     */
    private String deviceType;

    /**
     * 考勤设备唯一标识码
     */
    private String deviceSn;

    /**
     * 体温
     */
    private String temperature;

    /**
     * 体温是否报警
     */
    private String alarm;
    
    private String jobNo;
    
    private String empName;
    
    private String projectName;
    
    private String constructionName;
    
    private String teamName;
    
    //工种名称
    private String title;


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

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Date getPassedTime() {
        return passedTime;
    }

    public void setPassedTime(Date passedTime) {
        this.passedTime = passedTime;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Integer getWay() {
        return way;
    }

    public void setWay(Integer way) {
        this.way = way;
    }

    public String getSitePhoto() {
        return sitePhoto;
    }

    public void setSitePhoto(String sitePhoto) {
        this.sitePhoto = sitePhoto;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getAlarm() {
        return alarm;
    }

    public void setAlarm(String alarm) {
        this.alarm = alarm;
    }
    
    public String getJobNo() {
		return jobNo;
	}

	public void setJobNo(String jobNo) {
		this.jobNo = jobNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getConstructionName() {
		return constructionName;
	}

	public void setConstructionName(String constructionName) {
		this.constructionName = constructionName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
    public String toString() {
        return "AttendanceRecord{" +
        "id=" + id +
        ", projectId=" + projectId +
        ", employeeId=" + employeeId +
        ", passedTime=" + passedTime +
        ", direction=" + direction +
        ", way=" + way +
        ", sitePhoto=" + sitePhoto +
        ", createDate=" + createDate +
        ", uploadTime=" + uploadTime +
        ", deviceType=" + deviceType +
        ", deviceSn=" + deviceSn +
        ", temperature=" + temperature +
        ", alarm=" + alarm +
        "}";
    }
}
