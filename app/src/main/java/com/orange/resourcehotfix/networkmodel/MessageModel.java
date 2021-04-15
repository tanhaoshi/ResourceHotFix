package com.orange.resourcehotfix.networkmodel;

import java.util.List;

/**
 * create by ths on 2020/12/21
 */
public class MessageModel {


    /**
     * code : 1000
     * message : 请求处理成功
     * result : [{"content":"您有一条安全巡检新消息","createTime":1608015267000,"id":"ed1cfcc4812b78d26db49d59216776ee","inspectionId":"f92acce969bf1a3570d50b300c509a7d","isRead":0,"title":"智慧工地宝","type":1,"userId":"447d868cb72412b37a63461d6d713a5e"},{"content":"您有一条安全巡检新消息","createTime":1608015280000,"id":"5bd2b96cae9e1a9ca900aabd59af6acb","inspectionId":"f92acce969bf1a3570d50b300c509a7d","isRead":0,"title":"智慧工地宝","type":1,"userId":"447d868cb72412b37a63461d6d713a5e"}]
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
         * content : 您有一条安全巡检新消息
         * createTime : 1608015267000
         * id : ed1cfcc4812b78d26db49d59216776ee
         * inspectionId : f92acce969bf1a3570d50b300c509a7d
         * isRead : 0
         * title : 智慧工地宝
         * type : 1
         * userId : 447d868cb72412b37a63461d6d713a5e
         */

        private String content;
        private long createTime;
        private String id;
        private String inspectionId;
        private int isRead;
        private String title;
        private int type;
        private String userId;
        private int status;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
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

        public int getIsRead() {
            return isRead;
        }

        public void setIsRead(int isRead) {
            this.isRead = isRead;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }
    }
}
