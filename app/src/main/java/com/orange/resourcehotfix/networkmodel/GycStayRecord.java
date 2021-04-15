package com.orange.resourcehotfix.networkmodel;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author fangyang
 * @since 2021-03-09
 */
public class GycStayRecord implements Serializable {

    private static final long serialVersionUID=1L;

    private String id;

    /**
     * 宿舍ID
     */
    private String dormitoryId;

    /**
     * 人员ID
     */
    private String employeeId;

    /**
     * 入住/迁出时间
     */
    private Date operatorTime;

    /**
     * 1 入住 2 已迁出
     */
    private Integer type;

    /**
     * 操作人ID
     */
    private String operatorId;

    private Date createTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDormitoryId() {
        return dormitoryId;
    }

    public void setDormitoryId(String dormitoryId) {
        this.dormitoryId = dormitoryId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Date getOperatorTime() {
		return operatorTime;
	}

	public void setOperatorTime(Date operatorTime) {
		this.operatorTime = operatorTime;
	}

	public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
    public String toString() {
        return "GycStayRecord{" +
        "id=" + id +
        ", dormitoryId=" + dormitoryId +
        ", employeeId=" + employeeId +
        ", operatorTime=" + operatorTime +
        ", type=" + type +
        ", operatorId=" + operatorId +
        ", createTime=" + createTime +
        "}";
    }
}
