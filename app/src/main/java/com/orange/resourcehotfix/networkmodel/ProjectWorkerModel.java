package com.orange.resourcehotfix.networkmodel;

import java.util.List;

/**
 * create by ths on 2021/3/10
 */
public class ProjectWorkerModel {


    /**
     * code : 1000
     * message : 请求处理成功
     * result : [{"accountAddress":"","accountType":"说的","bankCardUrl":"","constructionId":"4a59f12eedc0d907995b0d2dc609fd8c","constructionName":"中建八局","createDate":1596677614000,"credential":"师傅","cwrIskeypsn":"0","dateOfBirth":"2020-07-29","education":"","email":"","empBankname":"士大夫地方","empCardnum":"阿斯顿不是","empName":"张三","empNaticeplace":"","empNation":"","empPhon":"13511110001","empSex":"男","endTime":"","enterAndRetreatCondition":0,"faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200806/b1a52ab4f6e24f029e5402b380cf2ba0.jpg","id":"352bba6d8589926e0ee6cb5e25f4eadf","idAddress":"安环撒核辐射恐慌看到放大","idAgency":"的VS发","idCode":"430921199611075440","idValiddate":"2020-99","idphotoScan":"","idphotoScan2":"","ifContract":0,"isExamine":1,"isLive":2,"isMarry":1,"isTeam":0,"isTrain":1,"isUpload":"1","jobName":"18aae4dd77817cf0638b80f0603f91b0","nativePlace":"收到VS吧","politicalOutlook":"","projectId":"47768b8681aa5be8390c73377a16745d","projectName":"澳洲列表","quarantine":"0","remark":"","salaryType":2,"startTime":"2020-11-27","teamId":"25c3e9fd5259038eb4b56bb009991a68","teamName":"分包管理人员","unit":"4da3c088bc871c31c77cc819fa7b4fc6","updateDate":1606469606000}]
     */

    private int code;
    private String message;
    private List<ResultBean> result;

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

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * accountAddress :
         * accountType : 说的
         * bankCardUrl :
         * constructionId : 4a59f12eedc0d907995b0d2dc609fd8c
         * constructionName : 中建八局
         * createDate : 1596677614000
         * credential : 师傅
         * cwrIskeypsn : 0
         * dateOfBirth : 2020-07-29
         * education :
         * email :
         * empBankname : 士大夫地方
         * empCardnum : 阿斯顿不是
         * empName : 张三
         * empNaticeplace :
         * empNation :
         * empPhon : 13511110001
         * empSex : 男
         * endTime :
         * enterAndRetreatCondition : 0
         * faceUrl : https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200806/b1a52ab4f6e24f029e5402b380cf2ba0.jpg
         * id : 352bba6d8589926e0ee6cb5e25f4eadf
         * idAddress : 安环撒核辐射恐慌看到放大
         * idAgency : 的VS发
         * idCode : 430921199611075440
         * idValiddate : 2020-99
         * idphotoScan :
         * idphotoScan2 :
         * ifContract : 0
         * isExamine : 1
         * isLive : 2
         * isMarry : 1
         * isTeam : 0
         * isTrain : 1
         * isUpload : 1
         * jobName : 18aae4dd77817cf0638b80f0603f91b0
         * nativePlace : 收到VS吧
         * politicalOutlook :
         * projectId : 47768b8681aa5be8390c73377a16745d
         * projectName : 澳洲列表
         * quarantine : 0
         * remark :
         * salaryType : 2
         * startTime : 2020-11-27
         * teamId : 25c3e9fd5259038eb4b56bb009991a68
         * teamName : 分包管理人员
         * unit : 4da3c088bc871c31c77cc819fa7b4fc6
         * updateDate : 1606469606000
         */

        private String accountAddress;
        private String accountType;
        private String bankCardUrl;
        private String constructionId;
        private String constructionName;
        private long createDate;
        private String credential;
        private String cwrIskeypsn;
        private String dateOfBirth;
        private String education;
        private String email;
        private String empBankname;
        private String empCardnum;
        private String empName;
        private String empNaticeplace;
        private String empNation;
        private String empPhon;
        private String empSex;
        private String endTime;
        private int enterAndRetreatCondition;
        private String faceUrl;
        private String id;
        private String idAddress;
        private String idAgency;
        private String idCode;
        private String idValiddate;
        private String idphotoScan;
        private String idphotoScan2;
        private int ifContract;
        private int isExamine;
        private int isLive;
        private int isMarry;
        private int isTeam;
        private int isTrain;
        private String isUpload;
        private String jobName;
        private String nativePlace;
        private String politicalOutlook;
        private String projectId;
        private String projectName;
        private String quarantine;
        private String remark;
        private int salaryType;
        private String startTime;
        private String teamId;
        private String teamName;
        private String unit;
        private long updateDate;
        private String dormitoryName;
        private String operatorName;
        private long operatorTime;
        private String jobNo;

        public String getAccountAddress() {
            return accountAddress;
        }

        public void setAccountAddress(String accountAddress) {
            this.accountAddress = accountAddress;
        }

        public String getAccountType() {
            return accountType;
        }

        public void setAccountType(String accountType) {
            this.accountType = accountType;
        }

        public String getBankCardUrl() {
            return bankCardUrl;
        }

        public void setBankCardUrl(String bankCardUrl) {
            this.bankCardUrl = bankCardUrl;
        }

        public String getConstructionId() {
            return constructionId;
        }

        public void setConstructionId(String constructionId) {
            this.constructionId = constructionId;
        }

        public String getConstructionName() {
            return constructionName;
        }

        public void setConstructionName(String constructionName) {
            this.constructionName = constructionName;
        }

        public long getCreateDate() {
            return createDate;
        }

        public void setCreateDate(long createDate) {
            this.createDate = createDate;
        }

        public String getCredential() {
            return credential;
        }

        public void setCredential(String credential) {
            this.credential = credential;
        }

        public String getCwrIskeypsn() {
            return cwrIskeypsn;
        }

        public void setCwrIskeypsn(String cwrIskeypsn) {
            this.cwrIskeypsn = cwrIskeypsn;
        }

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public String getEducation() {
            return education;
        }

        public void setEducation(String education) {
            this.education = education;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
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

        public String getEmpName() {
            return empName;
        }

        public void setEmpName(String empName) {
            this.empName = empName;
        }

        public String getEmpNaticeplace() {
            return empNaticeplace;
        }

        public void setEmpNaticeplace(String empNaticeplace) {
            this.empNaticeplace = empNaticeplace;
        }

        public String getEmpNation() {
            return empNation;
        }

        public void setEmpNation(String empNation) {
            this.empNation = empNation;
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

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        public int getEnterAndRetreatCondition() {
            return enterAndRetreatCondition;
        }

        public void setEnterAndRetreatCondition(int enterAndRetreatCondition) {
            this.enterAndRetreatCondition = enterAndRetreatCondition;
        }

        public String getFaceUrl() {
            return faceUrl;
        }

        public void setFaceUrl(String faceUrl) {
            this.faceUrl = faceUrl;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
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

        public String getIdCode() {
            return idCode;
        }

        public void setIdCode(String idCode) {
            this.idCode = idCode;
        }

        public String getIdValiddate() {
            return idValiddate;
        }

        public void setIdValiddate(String idValiddate) {
            this.idValiddate = idValiddate;
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

        public int getIfContract() {
            return ifContract;
        }

        public void setIfContract(int ifContract) {
            this.ifContract = ifContract;
        }

        public int getIsExamine() {
            return isExamine;
        }

        public void setIsExamine(int isExamine) {
            this.isExamine = isExamine;
        }

        public int getIsLive() {
            return isLive;
        }

        public void setIsLive(int isLive) {
            this.isLive = isLive;
        }

        public int getIsMarry() {
            return isMarry;
        }

        public void setIsMarry(int isMarry) {
            this.isMarry = isMarry;
        }

        public int getIsTeam() {
            return isTeam;
        }

        public void setIsTeam(int isTeam) {
            this.isTeam = isTeam;
        }

        public int getIsTrain() {
            return isTrain;
        }

        public void setIsTrain(int isTrain) {
            this.isTrain = isTrain;
        }

        public String getIsUpload() {
            return isUpload;
        }

        public void setIsUpload(String isUpload) {
            this.isUpload = isUpload;
        }

        public String getJobName() {
            return jobName;
        }

        public void setJobName(String jobName) {
            this.jobName = jobName;
        }

        public String getNativePlace() {
            return nativePlace;
        }

        public void setNativePlace(String nativePlace) {
            this.nativePlace = nativePlace;
        }

        public String getPoliticalOutlook() {
            return politicalOutlook;
        }

        public void setPoliticalOutlook(String politicalOutlook) {
            this.politicalOutlook = politicalOutlook;
        }

        public String getProjectId() {
            return projectId;
        }

        public void setProjectId(String projectId) {
            this.projectId = projectId;
        }

        public String getProjectName() {
            return projectName;
        }

        public void setProjectName(String projectName) {
            this.projectName = projectName;
        }

        public String getQuarantine() {
            return quarantine;
        }

        public void setQuarantine(String quarantine) {
            this.quarantine = quarantine;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public int getSalaryType() {
            return salaryType;
        }

        public void setSalaryType(int salaryType) {
            this.salaryType = salaryType;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public String getTeamId() {
            return teamId;
        }

        public void setTeamId(String teamId) {
            this.teamId = teamId;
        }

        public String getTeamName() {
            return teamName;
        }

        public void setTeamName(String teamName) {
            this.teamName = teamName;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public long getUpdateDate() {
            return updateDate;
        }

        public void setUpdateDate(long updateDate) {
            this.updateDate = updateDate;
        }

        public String getDormitoryName() {
            return dormitoryName;
        }

        public void setDormitoryName(String dormitoryName) {
            this.dormitoryName = dormitoryName;
        }

        public String getOperatorName() {
            return operatorName;
        }

        public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }

        public long getOperatorTime() {
            return operatorTime;
        }

        public void setOperatorTime(long operatorTime) {
            this.operatorTime = operatorTime;
        }

        public String getJobNo() {
            return jobNo;
        }

        public void setJobNo(String jobNo) {
            this.jobNo = jobNo;
        }
    }
}
