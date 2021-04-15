package com.orange.resourcehotfix.networkmodel;

import java.util.List;

/**
 * create by ths on 2020/6/18
 */
public class ProjectModel {

    /**
     * code : 1000
     * message : 请求处理成功
     * result : {"current":1,"orders":[],"pages":1,"records":[{"acreage":"10000","builderLicense":"12313121","companyId":"f6b465b938c75ab967b1fd82f7b127ca","createDate":1591931104000,"designOrganization":"","explorationUnit":"","finishTime":1622736000000,"id":"47768b8681aa5be8390c73377a16745d","latitude":"22.570891","longitude":"114.045474","phone":"13200000000","projectAddress":"反对法","projectCost":"100","projectImage":"URL","projectName":"澳洲列表","projectNumber":0,"projectPrincipal":"wmy","projectRegion":"110000,110100,110101","projectState":"0","projectType":"ly","qualityNumber":"","remark":"","securityCode":"","shortName":"也乜鬼","showState":0,"startingTime":1591200000000,"updateDate":1591947824000}],"searchCount":true,"size":500,"total":1}
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
         * pages : 1
         * records : [{"acreage":"10000","builderLicense":"12313121","companyId":"f6b465b938c75ab967b1fd82f7b127ca","createDate":1591931104000,"designOrganization":"","explorationUnit":"","finishTime":1622736000000,"id":"47768b8681aa5be8390c73377a16745d","latitude":"22.570891","longitude":"114.045474","phone":"13200000000","projectAddress":"反对法","projectCost":"100","projectImage":"URL","projectName":"澳洲列表","projectNumber":0,"projectPrincipal":"wmy","projectRegion":"110000,110100,110101","projectState":"0","projectType":"ly","qualityNumber":"","remark":"","securityCode":"","shortName":"也乜鬼","showState":0,"startingTime":1591200000000,"updateDate":1591947824000}]
         * searchCount : true
         * size : 500
         * total : 1
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
             * acreage : 10000
             * builderLicense : 12313121
             * companyId : f6b465b938c75ab967b1fd82f7b127ca
             * createDate : 1591931104000
             * designOrganization :
             * explorationUnit :
             * finishTime : 1622736000000
             * id : 47768b8681aa5be8390c73377a16745d
             * latitude : 22.570891
             * longitude : 114.045474
             * phone : 13200000000
             * projectAddress : 反对法
             * projectCost : 100
             * projectImage : URL
             * projectName : 澳洲列表
             * projectNumber : 0
             * projectPrincipal : wmy
             * projectRegion : 110000,110100,110101
             * projectState : 0
             * projectType : ly
             * qualityNumber :
             * remark :
             * securityCode :
             * shortName : 也乜鬼
             * showState : 0
             * startingTime : 1591200000000
             * updateDate : 1591947824000
             */

            private String acreage;
            private String builderLicense;
            private String companyId;
            private long createDate;
            private String designOrganization;
            private String explorationUnit;
            private long finishTime;
            private String id;
            private String latitude;
            private String longitude;
            private String phone;
            private String projectAddress;
            private String projectCost;
            private String projectImage;
            private String projectName;
            private int projectNumber;
            private String projectPrincipal;
            private String projectRegion;
            private String projectState;
            private String projectType;
            private String qualityNumber;
            private String remark;
            private String securityCode;
            private String shortName;
            private int showState;
            private long startingTime;
            private long updateDate;
            private String companyName;

            public String getAcreage() {
                return acreage;
            }

            public void setAcreage(String acreage) {
                this.acreage = acreage;
            }

            public String getBuilderLicense() {
                return builderLicense;
            }

            public void setBuilderLicense(String builderLicense) {
                this.builderLicense = builderLicense;
            }

            public String getCompanyId() {
                return companyId;
            }

            public void setCompanyId(String companyId) {
                this.companyId = companyId;
            }

            public long getCreateDate() {
                return createDate;
            }

            public void setCreateDate(long createDate) {
                this.createDate = createDate;
            }

            public String getDesignOrganization() {
                return designOrganization;
            }

            public void setDesignOrganization(String designOrganization) {
                this.designOrganization = designOrganization;
            }

            public String getExplorationUnit() {
                return explorationUnit;
            }

            public void setExplorationUnit(String explorationUnit) {
                this.explorationUnit = explorationUnit;
            }

            public long getFinishTime() {
                return finishTime;
            }

            public void setFinishTime(long finishTime) {
                this.finishTime = finishTime;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getLatitude() {
                return latitude;
            }

            public void setLatitude(String latitude) {
                this.latitude = latitude;
            }

            public String getLongitude() {
                return longitude;
            }

            public void setLongitude(String longitude) {
                this.longitude = longitude;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getProjectAddress() {
                return projectAddress;
            }

            public void setProjectAddress(String projectAddress) {
                this.projectAddress = projectAddress;
            }

            public String getProjectCost() {
                return projectCost;
            }

            public void setProjectCost(String projectCost) {
                this.projectCost = projectCost;
            }

            public String getProjectImage() {
                return projectImage;
            }

            public void setProjectImage(String projectImage) {
                this.projectImage = projectImage;
            }

            public String getProjectName() {
                return projectName;
            }

            public void setProjectName(String projectName) {
                this.projectName = projectName;
            }

            public int getProjectNumber() {
                return projectNumber;
            }

            public void setProjectNumber(int projectNumber) {
                this.projectNumber = projectNumber;
            }

            public String getProjectPrincipal() {
                return projectPrincipal;
            }

            public void setProjectPrincipal(String projectPrincipal) {
                this.projectPrincipal = projectPrincipal;
            }

            public String getProjectRegion() {
                return projectRegion;
            }

            public void setProjectRegion(String projectRegion) {
                this.projectRegion = projectRegion;
            }

            public String getProjectState() {
                return projectState;
            }

            public void setProjectState(String projectState) {
                this.projectState = projectState;
            }

            public String getProjectType() {
                return projectType;
            }

            public void setProjectType(String projectType) {
                this.projectType = projectType;
            }

            public String getQualityNumber() {
                return qualityNumber;
            }

            public void setQualityNumber(String qualityNumber) {
                this.qualityNumber = qualityNumber;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public String getSecurityCode() {
                return securityCode;
            }

            public void setSecurityCode(String securityCode) {
                this.securityCode = securityCode;
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

            public long getStartingTime() {
                return startingTime;
            }

            public void setStartingTime(long startingTime) {
                this.startingTime = startingTime;
            }

            public long getUpdateDate() {
                return updateDate;
            }

            public void setUpdateDate(long updateDate) {
                this.updateDate = updateDate;
            }

            public String getCompanyName() {
                return companyName;
            }

            public void setCompanyName(String companyName) {
                this.companyName = companyName;
            }
        }
    }
}
