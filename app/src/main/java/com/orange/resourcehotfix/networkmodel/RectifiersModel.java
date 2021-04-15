package com.orange.resourcehotfix.networkmodel;

import java.util.List;

/**
 * create by ths on 2020/12/15
 */
public class RectifiersModel {

    /**
     * code : 1000
     * message : 请求处理成功
     * result : [{"constructionId":"4a59f12eedc0d907995b0d2dc609fd8c","createTime":1591931366000,"ico":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200701/98c7ddf95e3b49d99fcd415517023528.jpg","id":"2c1c13a912d8566690f3b69626df5680","isDel":0,"isManager":0,"loginName":"JISOO","nickName":"K wow\n","orgId":"f6b465b938c75ab967b1fd82f7b127ca","passWord":"e10adc3949ba59abbe56e057f20f883e","projectId":"47768b8681aa5be8390c73377a16745d","sex":2,"status":0,"userType":3},{"constructionId":"4a59f12eedc0d907995b0d2dc609fd8c","createTime":1591931394000,"ico":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200612/b1c7287866bd495e8a5808a84a17161a.jpg","id":"4b7cd065a597e89adcc47c5a54960a40","isDel":0,"isManager":0,"loginName":"JENNIE","nickName":"","orgId":"f6b465b938c75ab967b1fd82f7b127ca","passWord":"e10adc3949ba59abbe56e057f20f883e","projectId":"47768b8681aa5be8390c73377a16745d","sex":2,"status":0,"userType":3}]
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
         * constructionId : 4a59f12eedc0d907995b0d2dc609fd8c
         * createTime : 1591931366000
         * ico : https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200701/98c7ddf95e3b49d99fcd415517023528.jpg
         * id : 2c1c13a912d8566690f3b69626df5680
         * isDel : 0
         * isManager : 0
         * loginName : JISOO
         * nickName : K wow
         * orgId : f6b465b938c75ab967b1fd82f7b127ca
         * passWord : e10adc3949ba59abbe56e057f20f883e
         * projectId : 47768b8681aa5be8390c73377a16745d
         * sex : 2
         * status : 0
         * userType : 3
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
    }
}
