package com.orange.resourcehotfix.networkmodel;

import java.util.List;

/**
 * create by ths on 2020/12/17
 */
public class InspectionLogModel {

    /**
     * code : 1000
     * message : 请求处理成功
     * result : [{"ccPerson1Name":"w","ccPerson2Name":"w","ccPerson3Name":"w","createTime":1607994278000,"id":"51f4631dbc7cd682f9e563bf368181fa","inspectionId":"7afb730ec927b132493cb579d413278d","operationProcess":0,"operatorName":"w","userId":"447d868cb72412b37a63461d6d713a5e"},{"createTime":1607994332000,"handlePho":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200808/680479871bb149fdbdf23136934645df.jpg","handleResult":"工具都摆放好了，请领导查收","id":"ab0aeb0d24a82630e876fbc0e6530daa","inspectionId":"7afb730ec927b132493cb579d413278d","operationProcess":1,"operatorName":"w","recheckPho":"","recheckResult":"","userId":"447d868cb72412b37a63461d6d713a5e"},{"createTime":1607994373000,"handlePho":"","handleResult":"","id":"19bcc456d732b63f7d358fe64c365526","inspectionId":"7afb730ec927b132493cb579d413278d","operationProcess":3,"operatorName":"w","recheckIdea":1,"recheckPho":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200808/680479871bb149fdbdf23136934645df.jpg","recheckResult":"重新处理","userId":"447d868cb72412b37a63461d6d713a5e"},{"createTime":1607994416000,"handlePho":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200808/680479871bb149fdbdf23136934645df.jpg","handleResult":"工具都摆放好了，请领导查收","id":"c7c9a09118cfbc2ae4de8a7e2d165054","inspectionId":"7afb730ec927b132493cb579d413278d","operationProcess":1,"operatorName":"w","recheckPho":"","recheckResult":"","userId":"447d868cb72412b37a63461d6d713a5e"},{"createTime":1607994439000,"handlePho":"","handleResult":"","id":"f7d2e67db718a3130d1a418c349870d5","inspectionId":"7afb730ec927b132493cb579d413278d","operationProcess":3,"operatorName":"w","recheckIdea":1,"recheckPho":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200808/680479871bb149fdbdf23136934645df.jpg","recheckResult":"重新处理","userId":"447d868cb72412b37a63461d6d713a5e"}]
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
         * ccPerson1Name : w
         * ccPerson2Name : w
         * ccPerson3Name : w
         * createTime : 1607994278000
         * id : 51f4631dbc7cd682f9e563bf368181fa
         * inspectionId : 7afb730ec927b132493cb579d413278d
         * operationProcess : 0
         * operatorName : w
         * userId : 447d868cb72412b37a63461d6d713a5e
         * handlePho : https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200808/680479871bb149fdbdf23136934645df.jpg
         * handleResult : 工具都摆放好了，请领导查收
         * recheckPho :
         * recheckResult :
         * recheckIdea : 1
         */

        private String ccPerson1Name;
        private String ccPerson2Name;
        private String ccPerson3Name;
        private long createTime;
        private String id;
        private String inspectionId;
        private int operationProcess;
        private String operatorName;
        private String userId;
        private String handlePho;
        private String handleResult;
        private String recheckPho;
        private String recheckResult;
        private int recheckIdea;

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

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

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

        public int getOperationProcess() {
            return operationProcess;
        }

        public void setOperationProcess(int operationProcess) {
            this.operationProcess = operationProcess;
        }

        public String getOperatorName() {
            return operatorName;
        }

        public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getHandlePho() {
            return handlePho;
        }

        public void setHandlePho(String handlePho) {
            this.handlePho = handlePho;
        }

        public String getHandleResult() {
            return handleResult;
        }

        public void setHandleResult(String handleResult) {
            this.handleResult = handleResult;
        }

        public String getRecheckPho() {
            return recheckPho;
        }

        public void setRecheckPho(String recheckPho) {
            this.recheckPho = recheckPho;
        }

        public String getRecheckResult() {
            return recheckResult;
        }

        public void setRecheckResult(String recheckResult) {
            this.recheckResult = recheckResult;
        }

        public int getRecheckIdea() {
            return recheckIdea;
        }

        public void setRecheckIdea(int recheckIdea) {
            this.recheckIdea = recheckIdea;
        }
    }
}
