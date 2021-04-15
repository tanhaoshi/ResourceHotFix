package com.orange.resourcehotfix.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.List;

/**
 * create by ths on 2020/12/16
 */
public class InspectionModel implements Serializable {

    /**
     * code : 1000
     * message : 请求处理成功
     * result : [{"ccPerson1Id":"447d868cb72412b37a63461d6d713a5e","ccPerson1Name":"w","ccPerson2Id":"3d7b706ef37d581b865f8c334969626a","ccPerson2Name":"Wang","ccPerson3Id":"4a48907abebb5716ebd9a78e1b566f42","ccPerson3Name":"fangyang","constructionId":"4a59f12eedc0d907995b0d2dc609fd8c","createTime":1607930390000,"hiddenDanger":"12121","hiddenDangerTitle":"安全隐患1","id":"221470c52d85efc4bd80ffa12eeddb55","lastDate":"2020-12-17","operatorId":"447d868cb72412b37a63461d6d713a5e","operatorName":"w","problem":"工具摆放太乱","problemLevel":1,"projectId":"47768b8681aa5be8390c73377a16745d","recheckPersonId":"447d868cb72412b37a63461d6d713a5e","recheckPersonName":"w","rectificationRequirements":"工具摆放整齐","rectifiersId":"2c1c13a912d8566690f3b69626df5680","rectifiersName":"Kwow","scenePho":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20201209/9cd0b31bd157488f9eaaf1d129244af2.jpeg","status":0}]
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

    public static class ResultBean implements Parcelable {
        /**
         * ccPerson1Id : 447d868cb72412b37a63461d6d713a5e
         * ccPerson1Name : w
         * ccPerson2Id : 3d7b706ef37d581b865f8c334969626a
         * ccPerson2Name : Wang
         * ccPerson3Id : 4a48907abebb5716ebd9a78e1b566f42
         * ccPerson3Name : fangyang
         * constructionId : 4a59f12eedc0d907995b0d2dc609fd8c
         * createTime : 1607930390000
         * hiddenDanger : 12121
         * hiddenDangerTitle : 安全隐患1
         * id : 221470c52d85efc4bd80ffa12eeddb55
         * lastDate : 2020-12-17
         * operatorId : 447d868cb72412b37a63461d6d713a5e
         * operatorName : w
         * problem : 工具摆放太乱
         * problemLevel : 1
         * projectId : 47768b8681aa5be8390c73377a16745d
         * recheckPersonId : 447d868cb72412b37a63461d6d713a5e
         * recheckPersonName : w
         * rectificationRequirements : 工具摆放整齐
         * rectifiersId : 2c1c13a912d8566690f3b69626df5680
         * rectifiersName : Kwow
         * scenePho : https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20201209/9cd0b31bd157488f9eaaf1d129244af2.jpeg
         * status : 0
         */

        private String ccPerson1Id;
        private String ccPerson1Name;
        private String ccPerson2Id;
        private String ccPerson2Name;
        private String ccPerson3Id;
        private String ccPerson3Name;
        private String constructionId;
        private long createTime;
        private String hiddenDanger;
        private String hiddenDangerTitle;
        private String id;
        private String lastDate;
        private String operatorId;
        private String operatorName;
        private String problem;
        private int problemLevel;
        private String projectId;
        private String recheckPersonId;
        private String recheckPersonName;
        private String rectificationRequirements;
        private String rectifiersId;
        private String rectifiersName;
        private String scenePho;
        private int status;
        private String title;
        private String constructionName;

        protected ResultBean(Parcel in) {
            ccPerson1Id = in.readString();
            ccPerson1Name = in.readString();
            ccPerson2Id = in.readString();
            ccPerson2Name = in.readString();
            ccPerson3Id = in.readString();
            ccPerson3Name = in.readString();
            constructionId = in.readString();
            createTime = in.readLong();
            hiddenDanger = in.readString();
            hiddenDangerTitle = in.readString();
            id = in.readString();
            lastDate = in.readString();
            operatorId = in.readString();
            operatorName = in.readString();
            problem = in.readString();
            problemLevel = in.readInt();
            projectId = in.readString();
            recheckPersonId = in.readString();
            recheckPersonName = in.readString();
            rectificationRequirements = in.readString();
            rectifiersId = in.readString();
            rectifiersName = in.readString();
            scenePho = in.readString();
            status = in.readInt();
            title = in.readString();
            constructionName = in.readString();
        }

        public static final Creator<ResultBean> CREATOR = new Creator<ResultBean>() {
            @Override
            public ResultBean createFromParcel(Parcel in) {
                return new ResultBean(in);
            }

            @Override
            public ResultBean[] newArray(int size) {
                return new ResultBean[size];
            }
        };

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

        public String getHiddenDanger() {
            return hiddenDanger;
        }

        public void setHiddenDanger(String hiddenDanger) {
            this.hiddenDanger = hiddenDanger;
        }

        public String getHiddenDangerTitle() {
            return hiddenDangerTitle;
        }

        public void setHiddenDangerTitle(String hiddenDangerTitle) {
            this.hiddenDangerTitle = hiddenDangerTitle;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getLastDate() {
            return lastDate;
        }

        public void setLastDate(String lastDate) {
            this.lastDate = lastDate;
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

        public String getProblem() {
            return problem;
        }

        public void setProblem(String problem) {
            this.problem = problem;
        }

        public int getProblemLevel() {
            return problemLevel;
        }

        public void setProblemLevel(int problemLevel) {
            this.problemLevel = problemLevel;
        }

        public String getProjectId() {
            return projectId;
        }

        public void setProjectId(String projectId) {
            this.projectId = projectId;
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

        public String getRectificationRequirements() {
            return rectificationRequirements;
        }

        public void setRectificationRequirements(String rectificationRequirements) {
            this.rectificationRequirements = rectificationRequirements;
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

        public String getScenePho() {
            return scenePho;
        }

        public void setScenePho(String scenePho) {
            this.scenePho = scenePho;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getConstructionName() {
            return constructionName;
        }

        public void setConstructionName(String constructionName) {
            this.constructionName = constructionName;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(ccPerson1Id);
            dest.writeString(ccPerson1Name);
            dest.writeString(ccPerson2Id);
            dest.writeString(ccPerson2Name);
            dest.writeString(ccPerson3Id);
            dest.writeString(ccPerson3Name);
            dest.writeString(constructionId);
            dest.writeLong(createTime);
            dest.writeString(hiddenDanger);
            dest.writeString(hiddenDangerTitle);
            dest.writeString(id);
            dest.writeString(lastDate);
            dest.writeString(operatorId);
            dest.writeString(operatorName);
            dest.writeString(problem);
            dest.writeInt(problemLevel);
            dest.writeString(projectId);
            dest.writeString(recheckPersonId);
            dest.writeString(recheckPersonName);
            dest.writeString(rectificationRequirements);
            dest.writeString(rectifiersId);
            dest.writeString(rectifiersName);
            dest.writeString(scenePho);
            dest.writeInt(status);
            dest.writeString(title);
            dest.writeString(constructionName);
        }
    }
}
