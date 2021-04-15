package com.orange.resourcehotfix.networkmodel;

/**
 * create by ths on 2020/6/17
 */
public class LoginModel{

    /**
     * code : 1000
     * message : 请求处理成功
     * result : {"constructionId":"","createTime":1591931119000,"faceUrl":"","ico":"","id":"447d868cb72412b37a63461d6d713a5e","isDel":0,"isManager":0,"loginName":"lisa","orgId":"f6b465b938c75ab967b1fd82f7b127ca","passWord":"e10adc3949ba59abbe56e057f20f883e","projectId":"47768b8681aa5be8390c73377a16745d","sex":2,"status":0,"token":"eab1f3ee29dc45bd8cf855a1bf87cb38","userType":2}
     */

    private int code;
    private String message;
    private ResultBean result;

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

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * constructionId :
         * createTime : 1591931119000
         * faceUrl :
         * ico :
         * id : 447d868cb72412b37a63461d6d713a5e
         * isDel : 0
         * isManager : 0
         * loginName : lisa
         * orgId : f6b465b938c75ab967b1fd82f7b127ca
         * passWord : e10adc3949ba59abbe56e057f20f883e
         * projectId : 47768b8681aa5be8390c73377a16745d
         * sex : 2
         * status : 0
         * token : eab1f3ee29dc45bd8cf855a1bf87cb38
         * userType : 2
         */

        private String constructionId;
        private long createTime;
        private String faceUrl;
        private String ico;
        private String id;
        private int isDel;
        private int isManager;
        private String loginName;
        private String orgId;
        private String passWord;
        private String projectId;
        private int sex;
        private int status;
        private String token;
        private int userType;
        private String empId;
        private String displayName;
        private String nickName;
        private String projectName;
        private String companyName;
        private String loginRole;
        private String constructionName;
        private String logoUrl;
        private String phone;

        public String getConstructionId() {
            return constructionId;
        }

        public void setConstructionId(String constructionId) {
            this.constructionId = constructionId;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public String getFaceUrl() {
            return faceUrl;
        }

        public void setFaceUrl(String faceUrl) {
            this.faceUrl = faceUrl;
        }

        public String getIco() {
            return ico;
        }

        public void setIco(String ico) {
            this.ico = ico;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getIsDel() {
            return isDel;
        }

        public void setIsDel(int isDel) {
            this.isDel = isDel;
        }

        public int getIsManager() {
            return isManager;
        }

        public void setIsManager(int isManager) {
            this.isManager = isManager;
        }

        public String getLoginName() {
            return loginName;
        }

        public void setLoginName(String loginName) {
            this.loginName = loginName;
        }

        public String getOrgId() {
            return orgId;
        }

        public void setOrgId(String orgId) {
            this.orgId = orgId;
        }

        public String getPassWord() {
            return passWord;
        }

        public void setPassWord(String passWord) {
            this.passWord = passWord;
        }

        public String getProjectId() {
            return projectId;
        }

        public void setProjectId(String projectId) {
            this.projectId = projectId;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public int getUserType() {
            return userType;
        }

        public void setUserType(int userType) {
            this.userType = userType;
        }

        public String getEmpId() {
            return empId;
        }

        public void setEmpId(String empId) {
            this.empId = empId;
        }

        public String getDisplayName() {
            return displayName;
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public String getProjectName() {
            return projectName;
        }

        public void setProjectName(String projectName) {
            this.projectName = projectName;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public String getLoginRole() {
            return loginRole;
        }

        public void setLoginRole(String loginRole) {
            this.loginRole = loginRole;
        }

        public String getConstructionName() {
            return constructionName;
        }

        public void setConstructionName(String constructionName) {
            this.constructionName = constructionName;
        }

        public String getLogoUrl() {
            return logoUrl;
        }

        public void setLogoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
    }
}
