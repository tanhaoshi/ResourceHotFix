package com.orange.resourcehotfix.networkmodel;

import java.util.List;

/**
 * create by ths on 2020/12/15
 */
public class DictionarieModel {

    /**
     * code : 1000
     * message : 请求处理成功
     * result : [{"category":"HIDDEN_DANGER","createDate":1607911420000,"groupTitle":"安全隐患","hot":0,"id":"12121","tag":"21334","title":"安全隐患1"},{"category":"HIDDEN_DANGER","createDate":1607911475000,"groupTitle":"安全隐患","hot":0,"id":"212122","tag":"34235","title":"安全隐患2"}]
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
         * createBy :
         * dictCode : 333333
         * dictLabel : 安全隐患3
         * dictType : HIDDEN_DANGER
         * dictValue : 3
         * isDel : 0
         * updateBy :
         */

        private String createBy;
        private String dictCode;
        private String dictLabel;
        private String dictType;
        private String dictValue;
        private int isDel;
        private String updateBy;

        public String getCreateBy() {
            return createBy;
        }

        public void setCreateBy(String createBy) {
            this.createBy = createBy;
        }

        public String getDictCode() {
            return dictCode;
        }

        public void setDictCode(String dictCode) {
            this.dictCode = dictCode;
        }

        public String getDictLabel() {
            return dictLabel;
        }

        public void setDictLabel(String dictLabel) {
            this.dictLabel = dictLabel;
        }

        public String getDictType() {
            return dictType;
        }

        public void setDictType(String dictType) {
            this.dictType = dictType;
        }

        public String getDictValue() {
            return dictValue;
        }

        public void setDictValue(String dictValue) {
            this.dictValue = dictValue;
        }

        public int getIsDel() {
            return isDel;
        }

        public void setIsDel(int isDel) {
            this.isDel = isDel;
        }

        public String getUpdateBy() {
            return updateBy;
        }

        public void setUpdateBy(String updateBy) {
            this.updateBy = updateBy;
        }
    }
}
