package com.orange.resourcehotfix.networkmodel;

import java.util.Date;

/**
 * create by ths on 2020/6/23
 */
public class ProjectListModel {

    /**
     * ID
     */
    private String id;

    /**
     * 项目名
     */
    private String projectName;

    /**
     * 简称
     */
    private String shortName;

    /**
     * 项目负责人
     */
    private String projectPrincipal;

    /**
     * 联系方式
     */
    private String phone;

    /**
     * 项目类型（从字典获取相应数据）
     */
    private String projectType;

    /**
     * 项目状态
     */
    private String projectState;

    /**
     * 项目管理人数
     */
    private Integer projectNumber;

    /**
     * 所属地区（三级联动）
     */
    private String projectRegion;

    /**
     * 施工许可证
     */
    private String builderLicense;

    /**
     * 项目地址
     */
    private String projectAddress;

    /**
     * 起始时间
     */
    private Date startingTime;

    /**
     * 结束时间
     */
    private Date finishTime;

    /**
     * 施工企业（公司库获取）
     */
    private Integer constructionId;

    /**
     * 监理企业（公司库获取）
     */
    private Integer supervisorId;

    /**
     * 建筑面积(平米)
     */
    private String acreage;

    /**
     * 工程造价(万元)
     */
    private String projectCost;

    /**
     * 经度
     */
    private String longitude;

    /**
     * 纬度
     */
    private String latitude;

    /**
     * 安全报监编号
     */
    private String securityCode;

    /**
     * 质量报监编号
     */
    private String qualityNumber;

    /**
     * 设计单位
     */
    private String designOrganization;

    /**
     * 勘察单位
     */
    private String explorationUnit;

    /**
     * 备注
     */
    private String remark;

    /**
     * 项目效果图
     */
    private String projectImage;

    /**
     * 状态（0.显示 1.隐藏）
     */
    private Integer showState;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改时间
     */
    private Date updateDate;

    /**
     * 人脸库编号
     */
    private String faceGroup;

    /**
     * 东莞项目唯一编号
     */
    private Integer itemId;

    /**
     * 建设单位
     */
    private String buildUnit;

    /**
     * 所属部门
     */
    private String projectDept;

    /**
     * 代建或总承包名称
     */
    private String djorzcb;

    /**
     * 代建公司，总承包公司
     */
    private String djorzcbType;

    /**
     * 项目编码
     */
    private String projectCode;

    private String companyId;

    private String planId;

    private String projectTypeName;

    private Integer workersNum;

    private String companyName;

    private String planName;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getProjectPrincipal() {
        return projectPrincipal;
    }

    public void setProjectPrincipal(String projectPrincipal) {
        this.projectPrincipal = projectPrincipal;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getProjectState() {
        return projectState;
    }

    public void setProjectState(String projectState) {
        this.projectState = projectState;
    }

    public Integer getProjectNumber() {
        return projectNumber;
    }

    public void setProjectNumber(Integer projectNumber) {
        this.projectNumber = projectNumber;
    }

    public String getProjectRegion() {
        return projectRegion;
    }

    public void setProjectRegion(String projectRegion) {
        this.projectRegion = projectRegion;
    }

    public String getBuilderLicense() {
        return builderLicense;
    }

    public void setBuilderLicense(String builderLicense) {
        this.builderLicense = builderLicense;
    }

    public String getProjectAddress() {
        return projectAddress;
    }

    public void setProjectAddress(String projectAddress) {
        this.projectAddress = projectAddress;
    }

    public Date getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(Date startingTime) {
        this.startingTime = startingTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Integer getConstructionId() {
        return constructionId;
    }

    public void setConstructionId(Integer constructionId) {
        this.constructionId = constructionId;
    }

    public Integer getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(Integer supervisorId) {
        this.supervisorId = supervisorId;
    }

    public String getAcreage() {
        return acreage;
    }

    public void setAcreage(String acreage) {
        this.acreage = acreage;
    }

    public String getProjectCost() {
        return projectCost;
    }

    public void setProjectCost(String projectCost) {
        this.projectCost = projectCost;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getQualityNumber() {
        return qualityNumber;
    }

    public void setQualityNumber(String qualityNumber) {
        this.qualityNumber = qualityNumber;
    }

    public String getDesignOrganization() {
        return designOrganization;
    }

    public void setDesignOrganization(String designOrganization) {
        this.designOrganization = designOrganization;
    }

    public String getExplorationUnit() {
        return explorationUnit;
    }

    public void setExplorationUnit(String explorationUnit) {
        this.explorationUnit = explorationUnit;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getProjectImage() {
        return projectImage;
    }

    public void setProjectImage(String projectImage) {
        this.projectImage = projectImage;
    }

    public Integer getShowState() {
        return showState;
    }

    public void setShowState(Integer showState) {
        this.showState = showState;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getFaceGroup() {
        return faceGroup;
    }

    public void setFaceGroup(String faceGroup) {
        this.faceGroup = faceGroup;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getBuildUnit() {
        return buildUnit;
    }

    public void setBuildUnit(String buildUnit) {
        this.buildUnit = buildUnit;
    }

    public String getProjectDept() {
        return projectDept;
    }

    public void setProjectDept(String projectDept) {
        this.projectDept = projectDept;
    }

    public String getDjorzcb() {
        return djorzcb;
    }

    public void setDjorzcb(String djorzcb) {
        this.djorzcb = djorzcb;
    }

    public String getDjorzcbType() {
        return djorzcbType;
    }

    public void setDjorzcbType(String djorzcbType) {
        this.djorzcbType = djorzcbType;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getProjectTypeName() {
        return projectTypeName;
    }

    public void setProjectTypeName(String projectTypeName) {
        this.projectTypeName = projectTypeName;
    }

    public Integer getWorkersNum() {
        return workersNum;
    }

    public void setWorkersNum(Integer workersNum) {
        this.workersNum = workersNum;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    @Override
    public String toString() {
        return "Projects{" +
                "id=" + id +
                ", projectName=" + projectName +
                ", shortName=" + shortName +
                ", projectPrincipal=" + projectPrincipal +
                ", phone=" + phone +
                ", projectType=" + projectType +
                ", projectState=" + projectState +
                ", projectNumber=" + projectNumber +
                ", projectRegion=" + projectRegion +
                ", builderLicense=" + builderLicense +
                ", projectAddress=" + projectAddress +
                ", startingTime=" + startingTime +
                ", finishTime=" + finishTime +
                ", constructionId=" + constructionId +
                ", supervisorId=" + supervisorId +
                ", acreage=" + acreage +
                ", projectCost=" + projectCost +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", securityCode=" + securityCode +
                ", qualityNumber=" + qualityNumber +
                ", designOrganization=" + designOrganization +
                ", explorationUnit=" + explorationUnit +
                ", remark=" + remark +
                ", projectImage=" + projectImage +
                ", showState=" + showState +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", faceGroup=" + faceGroup +
                ", itemId=" + itemId +
                ", buildUnit=" + buildUnit +
                ", projectDept=" + projectDept +
                ", djorzcb=" + djorzcb +
                ", djorzcbType=" + djorzcbType +
                ", projectCode=" + projectCode +
                "}";
    }
}
