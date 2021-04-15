package com.orange.resourcehotfix.networkmodel;

import java.util.List;

/**
 * create by ths on 2020/12/15
 */
public class CheckPersonModel {

    /**
     * code : 1000
     * message : 请求处理成功
     * result : [{"constructionId":"","createTime":1593425489000,"ico":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200629/615424c32f1e4462a5d5ef1016840308.jpg","id":"3d7b706ef37d581b865f8c334969626a","isDel":1,"isManager":0,"loginName":"wmy","nickName":"Wang","orgId":"f6b465b938c75ab967b1fd82f7b127ca","passWord":"e10adc3949ba59abbe56e057f20f883e","projectId":"47768b8681aa5be8390c73377a16745d","sex":2,"status":0,"userType":2},{"constructionId":"","createTime":1591931119000,"empId":"10000001","ico":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200701/f661f5f2075a43ba878955558e07d70c.jpg","id":"447d868cb72412b37a63461d6d713a5e","isDel":0,"isManager":0,"loginName":"lisa","nickName":"w","orgId":"f6b465b938c75ab967b1fd82f7b127ca","passWord":"e10adc3949ba59abbe56e057f20f883e","projectId":"47768b8681aa5be8390c73377a16745d","sex":2,"status":0,"userType":2},{"constructionId":"","createTime":1607500859000,"ico":"","id":"4a48907abebb5716ebd9a78e1b566f42","isDel":0,"isManager":0,"loginName":"cs","nickName":"","orgId":"f6b465b938c75ab967b1fd82f7b127ca","passWord":"eb906363d0ec3b88cbe3944c1b218f5d","projectId":"47768b8681aa5be8390c73377a16745d","status":0,"userType":2}]
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
         * constructionId :
         * createTime : 1593425489000
         * ico : https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200629/615424c32f1e4462a5d5ef1016840308.jpg
         * id : 3d7b706ef37d581b865f8c334969626a
         * isDel : 1
         * isManager : 0
         * loginName : wmy
         * nickName : Wang
         * orgId : f6b465b938c75ab967b1fd82f7b127ca
         * passWord : e10adc3949ba59abbe56e057f20f883e
         * projectId : 47768b8681aa5be8390c73377a16745d
         * sex : 2
         * status : 0
         * userType : 2
         * empId : 10000001
         */

        private String constructionId;
        private long createTime;
        private String ico;
        private String id;
        private int isDel;
        private int isManager;
        private String loginName;
        private String nickName;
        private String orgId;
        private String passWord;
        private String projectId;
        private int sex;
        private int status;
        private int userType;
        private String empId;

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

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
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
    }
}
