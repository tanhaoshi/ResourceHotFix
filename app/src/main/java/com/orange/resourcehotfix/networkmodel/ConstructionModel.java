package com.orange.resourcehotfix.networkmodel;

import java.util.List;

/**
 * create by ths on 2020/6/18
 */
public class ConstructionModel {


    /**
     * code : 1000
     * message : 请求处理成功
     * result : {"current":1,"orders":[],"pages":2,"records":[{"address":"","bankAddress":"","bankNum":"325235555","bankOpen":"2发生的","capital":12222,"companyType":"2","constructionName":"xxx","contacts":"库尔班热合曼","createDate":1591943241000,"email":"2342342353535","id":"1570faf512a5d2237d88e24973badee2","isUpload":"1","legalPerson":"范德萨","mobilePhone":"13211111111","organizationCode":"3333333","shortName":"阿萨","showState":0,"suid":"33333ddsa"}],"searchCount":true,"size":10,"total":15}
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
         * current : 1
         * orders : []
         * pages : 2
         * records : [{"address":"","bankAddress":"","bankNum":"325235555","bankOpen":"2发生的","capital":12222,"companyType":"2","constructionName":"xxx","contacts":"库尔班热合曼","createDate":1591943241000,"email":"2342342353535","id":"1570faf512a5d2237d88e24973badee2","isUpload":"1","legalPerson":"范德萨","mobilePhone":"13211111111","organizationCode":"3333333","shortName":"阿萨","showState":0,"suid":"33333ddsa"}]
         * searchCount : true
         * size : 10
         * total : 15
         */

        private int current;
        private int pages;
        private boolean searchCount;
        private int size;
        private int total;
        private List<?> orders;
        private List<RecordsBean> records;

        public int getCurrent() {
            return current;
        }

        public void setCurrent(int current) {
            this.current = current;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }

        public boolean isSearchCount() {
            return searchCount;
        }

        public void setSearchCount(boolean searchCount) {
            this.searchCount = searchCount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<?> getOrders() {
            return orders;
        }

        public void setOrders(List<?> orders) {
            this.orders = orders;
        }

        public List<RecordsBean> getRecords() {
            return records;
        }

        public void setRecords(List<RecordsBean> records) {
            this.records = records;
        }

        public static class RecordsBean {
            /**
             * address :
             * bankAddress :
             * bankNum : 325235555
             * bankOpen : 2发生的
             * capital : 12222
             * companyType : 2
             * constructionName : xxx
             * contacts : 库尔班热合曼
             * createDate : 1591943241000
             * email : 2342342353535
             * id : 1570faf512a5d2237d88e24973badee2
             * isUpload : 1
             * legalPerson : 范德萨
             * mobilePhone : 13211111111
             * organizationCode : 3333333
             * shortName : 阿萨
             * showState : 0
             * suid : 33333ddsa
             */

            private String address;
            private String bankAddress;
            private String bankNum;
            private String bankOpen;
            private int capital;
            private String companyType;
            private String constructionName;
            private String contacts;
            private long createDate;
            private String email;
            private String id;
            private String isUpload;
            private String legalPerson;
            private String mobilePhone;
            private String organizationCode;
            private String shortName;
            private int showState;
            private String suid;

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getBankAddress() {
                return bankAddress;
            }

            public void setBankAddress(String bankAddress) {
                this.bankAddress = bankAddress;
            }

            public String getBankNum() {
                return bankNum;
            }

            public void setBankNum(String bankNum) {
                this.bankNum = bankNum;
            }

            public String getBankOpen() {
                return bankOpen;
            }

            public void setBankOpen(String bankOpen) {
                this.bankOpen = bankOpen;
            }

            public int getCapital() {
                return capital;
            }

            public void setCapital(int capital) {
                this.capital = capital;
            }

            public String getCompanyType() {
                return companyType;
            }

            public void setCompanyType(String companyType) {
                this.companyType = companyType;
            }

            public String getConstructionName() {
                return constructionName;
            }

            public void setConstructionName(String constructionName) {
                this.constructionName = constructionName;
            }

            public String getContacts() {
                return contacts;
            }

            public void setContacts(String contacts) {
                this.contacts = contacts;
            }

            public long getCreateDate() {
                return createDate;
            }

            public void setCreateDate(long createDate) {
                this.createDate = createDate;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getIsUpload() {
                return isUpload;
            }

            public void setIsUpload(String isUpload) {
                this.isUpload = isUpload;
            }

            public String getLegalPerson() {
                return legalPerson;
            }

            public void setLegalPerson(String legalPerson) {
                this.legalPerson = legalPerson;
            }

            public String getMobilePhone() {
                return mobilePhone;
            }

            public void setMobilePhone(String mobilePhone) {
                this.mobilePhone = mobilePhone;
            }

            public String getOrganizationCode() {
                return organizationCode;
            }

            public void setOrganizationCode(String organizationCode) {
                this.organizationCode = organizationCode;
            }

            public String getShortName() {
                return shortName;
            }

            public void setShortName(String shortName) {
                this.shortName = shortName;
            }

            public int getShowState() {
                return showState;
            }

            public void setShowState(int showState) {
                this.showState = showState;
            }

            public String getSuid() {
                return suid;
            }

            public void setSuid(String suid) {
                this.suid = suid;
            }
        }
    }
}
