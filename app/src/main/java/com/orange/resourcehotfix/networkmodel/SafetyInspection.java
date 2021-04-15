package com.orange.resourcehotfix.networkmodel;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author fangyang
 * @since 2020-12-14
 */
public class SafetyInspection implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * ID（安全巡检表）
     */
    private String id;

    /**
     * 项目id
     */
    private String projectId;

    /**
     * 参建单位id
     */
    private String constructionId;

    /**
     * 问题描述
     */
    private String problem;

    /**
     * 问题级别 0.轻微 1.一般 2.严重
     */
    private Integer problemLevel;

    /**
     * 整改要求
     */
    private String rectificationRequirements;

    /**
     * 现场照片
     */
    private String scenePho;

    /**
     * 安全隐患id
     */
    private String hiddenDanger;
    
    /**
     * 安全隐患名称
     */
    private String hiddenDangerTitle;

    /**
     * 整改人id
     */
    private String rectifiersId;

    /**
     * 整改人姓名
     */
    private String rectifiersName;

    /**
     * 复查人id
     */
    private String recheckPersonId;

    /**
     * 复查人姓名
     */
    private String recheckPersonName;

    /**
     * 抄送人1id
     */
    private String ccPerson1Id;

    /**
     * 抄送人1姓名
     */
    private String ccPerson1Name;

    /**
     * 抄送人2id
     */
    private String ccPerson2Id;

    /**
     * 抄送人2姓名
     */
    private String ccPerson2Name;

    /**
     * 抄送人3id
     */
    private String ccPerson3Id;

    /**
     * 抄送人3姓名
     */
    private String ccPerson3Name;
    
    /**
     * 操作人id
     */
    private String operatorId;
    
    /**
     * 操作人姓名
     */
    private String operatorName;

    /**
     * 最后整改期限（yy-mm-dd）
     */
    private String lastDate;

    /**
     * 状态 0.待整改 1.待复查 2.已完成 3.异常
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    //分包商名称
    private String constructionName;

    //项目名称
    private String projectName;

    //安全巡检标题
    private String title;

    private String hiddenDangerId;

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

    public String getConstructionId() {
        return constructionId;
    }

    public void setConstructionId(String constructionId) {
        this.constructionId = constructionId;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public Integer getProblemLevel() {
        return problemLevel;
    }

    public void setProblemLevel(Integer problemLevel) {
        this.problemLevel = problemLevel;
    }

    public String getRectificationRequirements() {
        return rectificationRequirements;
    }

    public void setRectificationRequirements(String rectificationRequirements) {
        this.rectificationRequirements = rectificationRequirements;
    }

    public String getScenePho() {
        return scenePho;
    }

    public void setScenePho(String scenePho) {
        this.scenePho = scenePho;
    }

    public String getHiddenDanger() {
        return hiddenDanger;
    }

    public void setHiddenDanger(String hiddenDanger) {
        this.hiddenDanger = hiddenDanger;
    }

    public String getRectifiersId() {
        return rectifiersId;
    }

    public void setRectifiersId(String rectifiersId) {
        this.rectifiersId = rectifiersId;
    }

    public String getRectifiersName() {
        return rectifiersName;
    }

    public void setRectifiersName(String rectifiersName) {
        this.rectifiersName = rectifiersName;
    }

    public String getRecheckPersonId() {
        return recheckPersonId;
    }

    public void setRecheckPersonId(String recheckPersonId) {
        this.recheckPersonId = recheckPersonId;
    }

    public String getRecheckPersonName() {
        return recheckPersonName;
    }

    public void setRecheckPersonName(String recheckPersonName) {
        this.recheckPersonName = recheckPersonName;
    }

    public String getCcPerson1Id() {
        return ccPerson1Id;
    }

    public void setCcPerson1Id(String ccPerson1Id) {
        this.ccPerson1Id = ccPerson1Id;
    }

    public String getCcPerson1Name() {
        return ccPerson1Name;
    }

    public void setCcPerson1Name(String ccPerson1Name) {
        this.ccPerson1Name = ccPerson1Name;
    }

    public String getCcPerson2Id() {
        return ccPerson2Id;
    }

    public void setCcPerson2Id(String ccPerson2Id) {
        this.ccPerson2Id = ccPerson2Id;
    }

    public String getCcPerson2Name() {
        return ccPerson2Name;
    }

    public void setCcPerson2Name(String ccPerson2Name) {
        this.ccPerson2Name = ccPerson2Name;
    }

    public String getCcPerson3Id() {
        return ccPerson3Id;
    }

    public void setCcPerson3Id(String ccPerson3Id) {
        this.ccPerson3Id = ccPerson3Id;
    }

    public String getCcPerson3Name() {
        return ccPerson3Name;
    }

    public void setCcPerson3Name(String ccPerson3Name) {
        this.ccPerson3Name = ccPerson3Name;
    }

    public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getHiddenDangerTitle() {
		return hiddenDangerTitle;
	}

	public void setHiddenDangerTitle(String hiddenDangerTitle) {
		this.hiddenDangerTitle = hiddenDangerTitle;
	}

    public String getConstructionName() {
        return constructionName;
    }

    public void setConstructionName(String constructionName) {
        this.constructionName = constructionName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHiddenDangerId() {
        return hiddenDangerId;
    }

    public void setHiddenDangerId(String hiddenDangerId) {
        this.hiddenDangerId = hiddenDangerId;
    }

    @Override
    public String toString() {
        return "SafetyInspection{" +
        "id=" + id +
        ", projectId=" + projectId +
        ", constructionId=" + constructionId +
        ", problem=" + problem +
        ", problemLevel=" + problemLevel +
        ", rectificationRequirements=" + rectificationRequirements +
        ", scenePho=" + scenePho +
        ", hiddenDanger=" + hiddenDanger +
        ", rectifiersId=" + rectifiersId +
        ", rectifiersName=" + rectifiersName +
        ", recheckPersonId=" + recheckPersonId +
        ", recheckPersonName=" + recheckPersonName +
        ", ccPerson1Id=" + ccPerson1Id +
        ", ccPerson1Name=" + ccPerson1Name +
        ", ccPerson2Id=" + ccPerson2Id +
        ", ccPerson2Name=" + ccPerson2Name +
        ", ccPerson3Id=" + ccPerson3Id +
        ", ccPerson3Name=" + ccPerson3Name +
        ", lastDate=" + lastDate +
        ", status=" + status +
        ", createTime=" + createTime +
        "}";
    }
}
