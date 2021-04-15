package com.orange.resourcehotfix.networkmodel;

/**
 * create by ths on 2020/10/20
 */
public class WorkersModel {


    /**
     * result : {"teamName":"消防管道班","bankCardUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20201012/397ff06eb93c42099e229704f23ef8e5.jpeg","isExamine":1,"updateDate":1603077840000,"idValiddate":"2012.02.13-2022.02.13","constructionId":"4a59f12eedc0d907995b0d2dc609fd8c","idAddress":"湖南省桂阳县城关镇蔡伦南路24号","isTeam":1,"idAgency":"桂阳县公安局","empCardnum":"622848 0038835714775","empName":"谭浩世","jobNo":"2010120003","constructionName":"中建八局","empPhon":"15367257793","startTime":"2020-10-19","cwrIskeypsn":"0","id":"c0cf16fb008693554c3b8440ae7d99a5","idphotoScan2":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20201012/8b78caa4d05444c98b12c707c567a5a6.jpeg","createDate":1602481630000,"jobName":"0135e1ed7beb806c3d1db3d7a60c2e97","salaryType":1,"idphotoScan":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20201012/75b1782363c244c698714ccc507a6868.jpeg","idCode":"431021199411070032","empBankname":"农业银行","dateOfBirth":"1994-11-07","empCategory":"03","enterAndRetreatCondition":0,"empNation":"汉族","token":"915043deba5d4288b2ad43784017c6ba","jobTypename":"3","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20201012/661015a5d08b4a778e305acd5f24b26f.jpeg","unit":"","empSex":"男","empNaticeplace":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20201012/36d1f8e1292f4dca8c99ebccf9194980.jpeg","teamId":"fa06ed82c612600804099a14fd9b6c84","quarantine":"0","endTime":"","isUpload":"1","ifContract":0,"projectName":"澳洲列表","projectId":"47768b8681aa5be8390c73377a16745d","isTrain":0}
     * code : 1000
     * message : 请求处理成功
     */

    private ResultBean result;
    private int code;
    private String message;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

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

    public static class ResultBean {
        /**
         * teamName : 消防管道班
         * bankCardUrl : https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20201012/397ff06eb93c42099e229704f23ef8e5.jpeg
         * isExamine : 1
         * updateDate : 1603077840000
         * idValiddate : 2012.02.13-2022.02.13
         * constructionId : 4a59f12eedc0d907995b0d2dc609fd8c
         * idAddress : 湖南省桂阳县城关镇蔡伦南路24号
         * isTeam : 1
         * idAgency : 桂阳县公安局
         * empCardnum : 622848 0038835714775
         * empName : 谭浩世
         * jobNo : 2010120003
         * constructionName : 中建八局
         * empPhon : 15367257793
         * startTime : 2020-10-19
         * cwrIskeypsn : 0
         * id : c0cf16fb008693554c3b8440ae7d99a5
         * idphotoScan2 : https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20201012/8b78caa4d05444c98b12c707c567a5a6.jpeg
         * createDate : 1602481630000
         * jobName : 0135e1ed7beb806c3d1db3d7a60c2e97
         * salaryType : 1
         * idphotoScan : https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20201012/75b1782363c244c698714ccc507a6868.jpeg
         * idCode : 431021199411070032
         * empBankname : 农业银行
         * dateOfBirth : 1994-11-07
         * empCategory : 03
         * enterAndRetreatCondition : 0
         * empNation : 汉族
         * token : 915043deba5d4288b2ad43784017c6ba
         * jobTypename : 3
         * faceUrl : https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20201012/661015a5d08b4a778e305acd5f24b26f.jpeg
         * unit :
         * empSex : 男
         * empNaticeplace : https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20201012/36d1f8e1292f4dca8c99ebccf9194980.jpeg
         * teamId : fa06ed82c612600804099a14fd9b6c84
         * quarantine : 0
         * endTime :
         * isUpload : 1
         * ifContract : 0
         * projectName : 澳洲列表
         * projectId : 47768b8681aa5be8390c73377a16745d
         * isTrain : 0
         */

        private String teamName;
        private String bankCardUrl;
        private int isExamine;
        private long updateDate;
        private String idValiddate;
        private String constructionId;
        private String idAddress;
        private int isTeam;
        private String idAgency;
        private String empCardnum;
        private String empName;
        private String jobNo;
        private String constructionName;
        private String empPhon;
        private String startTime;
        private String cwrIskeypsn;
        private String id;
        private String idphotoScan2;
        private long createDate;
        private String jobName;
        private int salaryType;
        private String idphotoScan;
        private String idCode;
        private String empBankname;
        private String dateOfBirth;
        private String empCategory;
        private int enterAndRetreatCondition;
        private String empNation;
        private String token;
        private String jobTypename;
        private String faceUrl;
        private String unit;
        private String empSex;
        private String empNaticeplace;
        private String teamId;
        private String quarantine;
        private String endTime;
        private String isUpload;
        private int ifContract;
        private String projectName;
        private String projectId;
        private int isTrain;
        private String loginRole;

        public String getTeamName() {
            return teamName;
        }

        public void setTeamName(String teamName) {
            this.teamName = teamName;
        }

        public String getBankCardUrl() {
            return bankCardUrl;
        }

        public void setBankCardUrl(String bankCardUrl) {
            this.bankCardUrl = bankCardUrl;
        }

        public int getIsExamine() {
            return isExamine;
        }

        public void setIsExamine(int isExamine) {
            this.isExamine = isExamine;
        }

        public long getUpdateDate() {
            return updateDate;
        }

        public void setUpdateDate(long updateDate) {
            this.updateDate = updateDate;
        }

        public String getIdValiddate() {
            return idValiddate;
        }

        public void setIdValiddate(String idValiddate) {
            this.idValiddate = idValiddate;
        }

        public String getConstructionId() {
            return constructionId;
        }

        public void setConstructionId(String constructionId) {
            this.constructionId = constructionId;
        }

        public String getIdAddress() {
            return idAddress;
        }

        public void setIdAddress(String idAddress) {
            this.idAddress = idAddress;
        }

        public int getIsTeam() {
            return isTeam;
        }

        public void setIsTeam(int isTeam) {
            this.isTeam = isTeam;
        }

        public String getIdAgency() {
            return idAgency;
        }

        public void setIdAgency(String idAgency) {
            this.idAgency = idAgency;
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

        public String getJobNo() {
            return jobNo;
        }

        public void setJobNo(String jobNo) {
            this.jobNo = jobNo;
        }

        public String getConstructionName() {
            return constructionName;
        }

        public void setConstructionName(String constructionName) {
            this.constructionName = constructionName;
        }

        public String getEmpPhon() {
            return empPhon;
        }

        public void setEmpPhon(String empPhon) {
            this.empPhon = empPhon;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public String getCwrIskeypsn() {
            return cwrIskeypsn;
        }

        public void setCwrIskeypsn(String cwrIskeypsn) {
            this.cwrIskeypsn = cwrIskeypsn;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIdphotoScan2() {
            return idphotoScan2;
        }

        public void setIdphotoScan2(String idphotoScan2) {
            this.idphotoScan2 = idphotoScan2;
        }

        public long getCreateDate() {
            return createDate;
        }

        public void setCreateDate(long createDate) {
            this.createDate = createDate;
        }

        public String getJobName() {
            return jobName;
        }

        public void setJobName(String jobName) {
            this.jobName = jobName;
        }

        public int getSalaryType() {
            return salaryType;
        }

        public void setSalaryType(int salaryType) {
            this.salaryType = salaryType;
        }

        public String getIdphotoScan() {
            return idphotoScan;
        }

        public void setIdphotoScan(String idphotoScan) {
            this.idphotoScan = idphotoScan;
        }

        public String getIdCode() {
            return idCode;
        }

        public void setIdCode(String idCode) {
            this.idCode = idCode;
        }

        public String getEmpBankname() {
            return empBankname;
        }

        public void setEmpBankname(String empBankname) {
            this.empBankname = empBankname;
        }

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public String getEmpCategory() {
            return empCategory;
        }

        public void setEmpCategory(String empCategory) {
            this.empCategory = empCategory;
        }

        public int getEnterAndRetreatCondition() {
            return enterAndRetreatCondition;
        }

        public void setEnterAndRetreatCondition(int enterAndRetreatCondition) {
            this.enterAndRetreatCondition = enterAndRetreatCondition;
        }

        public String getEmpNation() {
            return empNation;
        }

        public void setEmpNation(String empNation) {
            this.empNation = empNation;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getJobTypename() {
            return jobTypename;
        }

        public void setJobTypename(String jobTypename) {
            this.jobTypename = jobTypename;
        }

        public String getFaceUrl() {
            return faceUrl;
        }

        public void setFaceUrl(String faceUrl) {
            this.faceUrl = faceUrl;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public String getEmpSex() {
            return empSex;
        }

        public void setEmpSex(String empSex) {
            this.empSex = empSex;
        }

        public String getEmpNaticeplace() {
            return empNaticeplace;
        }

        public void setEmpNaticeplace(String empNaticeplace) {
            this.empNaticeplace = empNaticeplace;
        }

        public String getTeamId() {
            return teamId;
        }

        public void setTeamId(String teamId) {
            this.teamId = teamId;
        }

        public String getQuarantine() {
            return quarantine;
        }

        public void setQuarantine(String quarantine) {
            this.quarantine = quarantine;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        public String getIsUpload() {
            return isUpload;
        }

        public void setIsUpload(String isUpload) {
            this.isUpload = isUpload;
        }

        public int getIfContract() {
            return ifContract;
        }

        public void setIfContract(int ifContract) {
            this.ifContract = ifContract;
        }

        public String getProjectName() {
            return projectName;
        }

        public void setProjectName(String projectName) {
            this.projectName = projectName;
        }

        public String getProjectId() {
            return projectId;
        }

        public void setProjectId(String projectId) {
            this.projectId = projectId;
        }

        public int getIsTrain() {
            return isTrain;
        }

        public void setIsTrain(int isTrain) {
            this.isTrain = isTrain;
        }

        public String getLoginRole() {
            return loginRole;
        }

        public void setLoginRole(String loginRole) {
            this.loginRole = loginRole;
        }
    }
}
