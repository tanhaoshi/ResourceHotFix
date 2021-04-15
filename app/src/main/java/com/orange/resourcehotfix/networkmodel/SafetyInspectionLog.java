package com.orange.resourcehotfix.networkmodel;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author xieming
 * @since 2020-12-14
 */
public class SafetyInspectionLog implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * ID（安全巡检日志表）
     */
    private String id;

    /**
     * 巡检id
     */
    private String inspectionId;

    /**
     * 处理情况描述
     */
    private String handleResult;

    /**
     * 处理照片
     */
    private String handlePho;

    /**
     * 用户id（对应sys_user中id）
     */
    private String userId;

    /**
     * 操作人名字（对应sys_user中nick_name）
     */
    private String operatorName;

    /**
     * 操作流程步骤 0.发起安全整改 1.整改完成 2.复查通过 3.复查不通过 4.异常
     */
    private Integer operationProcess;

    /**
     * 复查意见 0.通过 1.不通过
     */
    private Integer recheckIdea;

    /**
     * 复查情况描述
     */
    private String recheckResult;

    /**
     * 复查照片
     */
    private String recheckPho;

    /**
     * 创建时间
     */
    private Date createTime;
    
    /**
     * 抄送人1姓名
     */
    private String ccPerson1Name;
    
    /**
     * 抄送人2姓名
     */
    private String ccPerson2Name;
    
    /**
     * 抄送人3姓名
     */
    private String ccPerson3Name;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInspectionId() {
        return inspectionId;
    }

    public void setInspectionId(String inspectionId) {
        this.inspectionId = inspectionId;
    }

    public String getHandleResult() {
        return handleResult;
    }

    public void setHandleResult(String handleResult) {
        this.handleResult = handleResult;
    }

    public String getHandlePho() {
        return handlePho;
    }

    public void setHandlePho(String handlePho) {
        this.handlePho = handlePho;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public Integer getOperationProcess() {
        return operationProcess;
    }

    public void setOperationProcess(Integer operationProcess) {
        this.operationProcess = operationProcess;
    }

    public Integer getRecheckIdea() {
        return recheckIdea;
    }

    public void setRecheckIdea(Integer recheckIdea) {
        this.recheckIdea = recheckIdea;
    }

    public String getRecheckResult() {
        return recheckResult;
    }

    public void setRecheckResult(String recheckResult) {
        this.recheckResult = recheckResult;
    }

    public String getRecheckPho() {
        return recheckPho;
    }

    public void setRecheckPho(String recheckPho) {
        this.recheckPho = recheckPho;
    }

    public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCcPerson1Name() {
		return ccPerson1Name;
	}

	public void setCcPerson1Name(String ccPerson1Name) {
		this.ccPerson1Name = ccPerson1Name;
	}

	public String getCcPerson2Name() {
		return ccPerson2Name;
	}

	public void setCcPerson2Name(String ccPerson2Name) {
		this.ccPerson2Name = ccPerson2Name;
	}

	public String getCcPerson3Name() {
		return ccPerson3Name;
	}

	public void setCcPerson3Name(String ccPerson3Name) {
		this.ccPerson3Name = ccPerson3Name;
	}

	@Override
    public String toString() {
        return "SafetyInspectionLog{" +
        "id=" + id +
        ", inspectionId=" + inspectionId +
        ", handleResult=" + handleResult +
        ", handlePho=" + handlePho +
        ", userId=" + userId +
        ", operatorName=" + operatorName +
        ", operationProcess=" + operationProcess +
        ", recheckIdea=" + recheckIdea +
        ", recheckResult=" + recheckResult +
        ", recheckPho=" + recheckPho +
        ", createTime=" + createTime +
        "}";
    }
}
