package com.orange.resourcehotfix.networkmodel;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 项目工人
 * </p>
 *
 * @author xieming
 * @since 2020-05-20
 */
public class ProjectWorkers implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    private String id;

    /**
     * 班组id
     */
    private String teamId;

    /**
     * 参建单位id
     */
    private String constructionId;

    /**
     * 项目 id
     */
    private String projectId;

    /**
     * 姓名
     */
    private String empName;

    /**
     * 身份证号码
     */
    private String idCode;

    /**
     * 手机号码
     */
    private String empPhon;

    /**
     * 性别
     */
    private String empSex;

    /**
     * 民族
     */
    private String empNation;

    /**
     * 身份证地址
     */
    private String idAddress;

    /**
     * 签发机关
     */
    private String idAgency;

    /**
     * 有效期限
     */
    private String idValiddate;

    /**
     * 出生日期
     */
    private String dateOfBirth;

    /**
     * 籍贯
     */
    private String nativePlace;

    /**
     * 进场日期
     */
    private String startTime;

    /**
     * 退场日期
     */
    private String endTime;

    /**
     * 是否班组长(0否，1是)
     */
    private Integer isTeam;

    /**
     * 是否重要人员(0否，1是)
     */
    private String cwrIskeypsn;

    /**
     * 人员类别
     */
    private String jobTypename;

    /**
     * 工种id
     */
    private String jobName;



    /**
     * 人员类型
     */
    private String empCategory;

    /**
     * 是否办理合同(0否，1是)
     */
    private Integer ifContract;

    /**
     * 所属工做部门
     */
    private String empDept;

    /**
     * 现工作部门
     */
    private String obDept;

    /**
     * 开户行
     */
    private String empBankname;

    /**
     * 银行账号
     */
    private String empCardnum;

    /**
     * 账户类型
     */
    private String accountType;

    /**
     * 开户地址
     */
    private String accountAddress;

    /**
     * 获得证书
     */
    private String credential;

    /**
     * 备注
     */
    private String remark;

    /**
     * 简易劳动合同
     */
    private String contract;

    /**
     * 工人进场承诺书
     */
    private String entrance;

    /**
     * 工人退场承诺书
     */
    private String exeunt;

    /**
     * 两制“工作”确认书
     */
    private String workConfirm;

    /**
     * 信息是否公开（0、否。1、是）
     */
    private Integer information;

    /**
     * 安全教育培训是否合格（0、否。1、是）
     */
    private Integer isTrain;

    /**
     * 人脸照片
     */
    private String faceUrl;

    /**
     * 身份证人脸照片
     */
    private String empNaticeplace;

    /**
     * 身份证正面照片
     */
    private String idphotoScan;

    /**
     * 身份证反面照片
     */
    private String idphotoScan2;

    /**
     * 银行卡照片
     */
    private String bankCardUrl;

    /**
     * 进退场状态（0、进场。1、退场,2未同步）
     */
    private Integer enterAndRetreatCondition;

    /**
     * 人脸库token
     */
    private String faceToken;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改时间
     */
    private Date updateDate;

    /**
     * 东莞劳务花名册ID
     */
    private Integer rosterWokerId;

    /**
     * 是否上传，1上传，0，否
     */
    private String isUpload;

    /**
     * 是否隔离，1，隔离，0或空，正常
     */
    private String quarantine;

    /**
     * 审核状态（0：未审核，1：已审核，2：驳回）
     */
    private Integer isExamine;
    
    private Integer isMarry;
    
    private Integer isLabunion;

    //学历 education
    private String education;

    //政治面貌  politicalOutlook
    private String politicalOutlook;
    
    private String email;
    
    private String jobNo;
    
    private String builderLicense;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 分包商名称
     */
    private String constructionName;

    /**
     * 班组名称
     */
    private String teamName;
    
    private Date lastPassTime;

    private int salaryType;

    private String unit;

    /** 迁入、迁出  1 入住 2 迁出*/
    private Integer isLive;

    //预退场时间
    private String mayEndTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getConstructionId() {
        return constructionId;
    }

    public void setConstructionId(String constructionId) {
        this.constructionId = constructionId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getEmpPhon() {
        return empPhon;
    }

    public void setEmpPhon(String empPhon) {
        this.empPhon = empPhon;
    }

    public String getEmpSex() {
        return empSex;
    }

    public void setEmpSex(String empSex) {
        this.empSex = empSex;
    }

    public String getEmpNation() {
        return empNation;
    }

    public void setEmpNation(String empNation) {
        this.empNation = empNation;
    }

    public String getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(String idAddress) {
        this.idAddress = idAddress;
    }

    public String getIdAgency() {
        return idAgency;
    }

    public void setIdAgency(String idAgency) {
        this.idAgency = idAgency;
    }

    public String getIdValiddate() {
        return idValiddate;
    }

    public void setIdValiddate(String idValiddate) {
        this.idValiddate = idValiddate;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getIsTeam() {
        return isTeam;
    }

    public void setIsTeam(Integer isTeam) {
        this.isTeam = isTeam;
    }

    public String getCwrIskeypsn() {
        return cwrIskeypsn;
    }

    public void setCwrIskeypsn(String cwrIskeypsn) {
        this.cwrIskeypsn = cwrIskeypsn;
    }

    public String getJobTypename() {
        return jobTypename;
    }

    public void setJobTypename(String jobTypename) {
        this.jobTypename = jobTypename;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getEmpCategory() {
        return empCategory;
    }

    public void setEmpCategory(String empCategory) {
        this.empCategory = empCategory;
    }

    public Integer getIfContract() {
        return ifContract;
    }

    public void setIfContract(Integer ifContract) {
        this.ifContract = ifContract;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public String getObDept() {
        return obDept;
    }

    public void setObDept(String obDept) {
        this.obDept = obDept;
    }

    public String getEmpBankname() {
        return empBankname;
    }

    public void setEmpBankname(String empBankname) {
        this.empBankname = empBankname;
    }

    public String getEmpCardnum() {
        return empCardnum;
    }

    public void setEmpCardnum(String empCardnum) {
        this.empCardnum = empCardnum;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountAddress() {
        return accountAddress;
    }

    public void setAccountAddress(String accountAddress) {
        this.accountAddress = accountAddress;
    }

    public String getCredential() {
        return credential;
    }

    public void setCredential(String credential) {
        this.credential = credential;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getEntrance() {
        return entrance;
    }

    public void setEntrance(String entrance) {
        this.entrance = entrance;
    }

    public String getExeunt() {
        return exeunt;
    }

    public void setExeunt(String exeunt) {
        this.exeunt = exeunt;
    }

    public String getWorkConfirm() {
        return workConfirm;
    }

    public void setWorkConfirm(String workConfirm) {
        this.workConfirm = workConfirm;
    }

    public Integer getInformation() {
        return information;
    }

    public void setInformation(Integer information) {
        this.information = information;
    }

    public Integer getIsTrain() {
        return isTrain;
    }

    public void setIsTrain(Integer isTrain) {
        this.isTrain = isTrain;
    }

    public String getFaceUrl() {
        return faceUrl;
    }

    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
    }

    public String getEmpNaticeplace() {
        return empNaticeplace;
    }

    public void setEmpNaticeplace(String empNaticeplace) {
        this.empNaticeplace = empNaticeplace;
    }

    public String getIdphotoScan() {
        return idphotoScan;
    }

    public void setIdphotoScan(String idphotoScan) {
        this.idphotoScan = idphotoScan;
    }

    public String getIdphotoScan2() {
        return idphotoScan2;
    }

    public void setIdphotoScan2(String idphotoScan2) {
        this.idphotoScan2 = idphotoScan2;
    }

    public String getBankCardUrl() {
        return bankCardUrl;
    }

    public void setBankCardUrl(String bankCardUrl) {
        this.bankCardUrl = bankCardUrl;
    }

    public Integer getEnterAndRetreatCondition() {
        return enterAndRetreatCondition;
    }

    public void setEnterAndRetreatCondition(Integer enterAndRetreatCondition) {
        this.enterAndRetreatCondition = enterAndRetreatCondition;
    }

    public String getFaceToken() {
        return faceToken;
    }

    public void setFaceToken(String faceToken) {
        this.faceToken = faceToken;
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

    public Integer getRosterWokerId() {
        return rosterWokerId;
    }

    public void setRosterWokerId(Integer rosterWokerId) {
        this.rosterWokerId = rosterWokerId;
    }

    public String getIsUpload() {
        return isUpload;
    }

    public void setIsUpload(String isUpload) {
        this.isUpload = isUpload;
    }

    public String getQuarantine() {
        return quarantine;
    }

    public void setQuarantine(String quarantine) {
        this.quarantine = quarantine;
    }

    public Integer getIsExamine() {
        return isExamine;
    }

    public void setIsExamine(Integer isExamine) {
        this.isExamine = isExamine;
    }
    
    public String getBuilderLicense() {
		return builderLicense;
	}

	public void setBuilderLicense(String builderLicense) {
		this.builderLicense = builderLicense;
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

	public Integer getIsMarry() {
		return isMarry;
	}

	public void setIsMarry(Integer isMarry) {
		this.isMarry = isMarry;
	}

	public Integer getIsLabunion() {
		return isLabunion;
	}

	public void setIsLabunion(Integer isLabunion) {
		this.isLabunion = isLabunion;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getPoliticalOutlook() {
		return politicalOutlook;
	}

	public void setPoliticalOutlook(String politicalOutlook) {
		this.politicalOutlook = politicalOutlook;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJobNo() {
		return jobNo;
	}

	public void setJobNo(String jobNo) {
		this.jobNo = jobNo;
	}
	
	public Date getLastPassTime() {
		return lastPassTime;
	}

	public void setLastPassTime(Date lastPassTime) {
		this.lastPassTime = lastPassTime;
	}

    public int getSalaryType() {
        return salaryType;
    }

    public void setSalaryType(int salaryType) {
        this.salaryType = salaryType;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getIsLive() {
        return isLive;
    }

    public void setIsLive(Integer isLive) {
        this.isLive = isLive;
    }

    public String getMayEndTime() {
        return mayEndTime;
    }

    public void setMayEndTime(String mayEndTime) {
        this.mayEndTime = mayEndTime;
    }

    @Override
    public String toString() {
        return "ProjectWorkers{" +
        "id=" + id +
        ", teamId=" + teamId +
        ", constructionId=" + constructionId +
        ", projectId=" + projectId +
        ", empName=" + empName +
        ", idCode=" + idCode +
        ", empPhon=" + empPhon +
        ", empSex=" + empSex +
        ", empNation=" + empNation +
        ", idAddress=" + idAddress +
        ", idAgency=" + idAgency +
        ", idValiddate=" + idValiddate +
        ", dateOfBirth=" + dateOfBirth +
        ", nativePlace=" + nativePlace +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", isTeam=" + isTeam +
        ", cwrIskeypsn=" + cwrIskeypsn +
        ", jobTypename=" + jobTypename +
        ", jobName=" + jobName +
        ", empCategory=" + empCategory +
        ", ifContract=" + ifContract +
        ", empDept=" + empDept +
        ", obDept=" + obDept +
        ", empBankname=" + empBankname +
        ", empCardnum=" + empCardnum +
        ", accountType=" + accountType +
        ", accountAddress=" + accountAddress +
        ", credential=" + credential +
        ", remark=" + remark +
        ", contract=" + contract +
        ", entrance=" + entrance +
        ", exeunt=" + exeunt +
        ", workConfirm=" + workConfirm +
        ", information=" + information +
        ", isTrain=" + isTrain +
        ", faceUrl=" + faceUrl +
        ", empNaticeplace=" + empNaticeplace +
        ", idphotoScan=" + idphotoScan +
        ", idphotoScan2=" + idphotoScan2 +
        ", bankCardUrl=" + bankCardUrl +
        ", enterAndRetreatCondition=" + enterAndRetreatCondition +
        ", faceToken=" + faceToken +
        ", createDate=" + createDate +
        ", updateDate=" + updateDate +
        ", rosterWokerId=" + rosterWokerId +
        ", isUpload=" + isUpload +
        ", quarantine=" + quarantine +
        ", isExamine=" + isExamine +
        "}";
    }
}
