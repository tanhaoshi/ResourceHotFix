package com.orange.resourcehotfix.networkmodel;


import java.util.List;

/**
 * create by ths on 2021/3/11
 */
public class LifeAreaModel {


    /**
     * code : 1000
     * message : 请求处理成功
     * result : [{"createTime":1615261666000,"id":"1","isDel":0,"isOpen":1,"liveAreaName":"生活A区","personLiable":"方洋","personLiablePhone":"18773333212","projectId":"47768b8681aa5be8390c73377a16745d","remark":"无","unitLts":[{"createTime":1615261812000,"dormitoryLts":[{"allNums":4,"constructionId":"4a59f12eedc0d907995b0d2dc609fd8c","createTime":1615262126000,"floor":"1","houseNumber":"1001","id":"1","isDel":0,"isOpen":1,"liveNums":1,"operatorId":"447d868cb72412b37a63461d6d713a5e","personLiable":"小芳","sex":"男","unitId":"1"}],"floor":"1","id":"1","isDel":0,"isOpen":1,"liveAreaId":"1","roomNums":10,"unitName":"单元1"},{"createTime":1615261895000,"dormitoryLts":[],"floor":"2","id":"2","isDel":0,"isOpen":1,"liveAreaId":"1","roomNums":10,"unitName":"单元1"}]},{"createTime":1615261696000,"id":"2","isDel":0,"isOpen":1,"liveAreaName":"生活B区","personLiable":"小羊","personLiablePhone":"18774444212","projectId":"47768b8681aa5be8390c73377a16745d","remark":"无","unitLts":[{"createTime":1615261959000,"dormitoryLts":[],"floor":"1","id":"3","isDel":0,"isOpen":1,"liveAreaId":"2","roomNums":4,"unitName":"单元A"},{"createTime":1615261973000,"dormitoryLts":[],"floor":"2","id":"4","isDel":0,"isOpen":1,"liveAreaId":"2","roomNums":4,"unitName":"单元A"},{"createTime":1615261982000,"dormitoryLts":[],"floor":"3","id":"5","isDel":0,"isOpen":1,"liveAreaId":"2","roomNums":4,"unitName":"单元A"}]}]
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
         * createTime : 1615261666000
         * id : 1
         * isDel : 0
         * isOpen : 1
         * liveAreaName : 生活A区
         * personLiable : 方洋
         * personLiablePhone : 18773333212
         * projectId : 47768b8681aa5be8390c73377a16745d
         * remark : 无
         * unitLts : [{"createTime":1615261812000,"dormitoryLts":[{"allNums":4,"constructionId":"4a59f12eedc0d907995b0d2dc609fd8c","createTime":1615262126000,"floor":"1","houseNumber":"1001","id":"1","isDel":0,"isOpen":1,"liveNums":1,"operatorId":"447d868cb72412b37a63461d6d713a5e","personLiable":"小芳","sex":"男","unitId":"1"}],"floor":"1","id":"1","isDel":0,"isOpen":1,"liveAreaId":"1","roomNums":10,"unitName":"单元1"},{"createTime":1615261895000,"dormitoryLts":[],"floor":"2","id":"2","isDel":0,"isOpen":1,"liveAreaId":"1","roomNums":10,"unitName":"单元1"}]
         */

        private long createTime;
        private String id;
        private int isDel;
        private int isOpen;
        private String liveAreaName;
        private String personLiable;
        private String personLiablePhone;
        private String projectId;
        private String remark;
        private List<UnitLtsBean> unitLts;

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

        public int getIsDel() {
            return isDel;
        }

        public void setIsDel(int isDel) {
            this.isDel = isDel;
        }

        public int getIsOpen() {
            return isOpen;
        }

        public void setIsOpen(int isOpen) {
            this.isOpen = isOpen;
        }

        public String getLiveAreaName() {
            return liveAreaName;
        }

        public void setLiveAreaName(String liveAreaName) {
            this.liveAreaName = liveAreaName;
        }

        public String getPersonLiable() {
            return personLiable;
        }

        public void setPersonLiable(String personLiable) {
            this.personLiable = personLiable;
        }

        public String getPersonLiablePhone() {
            return personLiablePhone;
        }

        public void setPersonLiablePhone(String personLiablePhone) {
            this.personLiablePhone = personLiablePhone;
        }

        public String getProjectId() {
            return projectId;
        }

        public void setProjectId(String projectId) {
            this.projectId = projectId;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public List<UnitLtsBean> getUnitLts() {
            return unitLts;
        }

        public void setUnitLts(List<UnitLtsBean> unitLts) {
            this.unitLts = unitLts;
        }

        public static class UnitLtsBean {
            /**
             * createTime : 1615261812000
             * dormitoryLts : [{"allNums":4,"constructionId":"4a59f12eedc0d907995b0d2dc609fd8c","createTime":1615262126000,"floor":"1","houseNumber":"1001","id":"1","isDel":0,"isOpen":1,"liveNums":1,"operatorId":"447d868cb72412b37a63461d6d713a5e","personLiable":"小芳","sex":"男","unitId":"1"}]
             * floor : 1
             * id : 1
             * isDel : 0
             * isOpen : 1
             * liveAreaId : 1
             * roomNums : 10
             * unitName : 单元1
             */

            private long createTime;
            private String floor;
            private String id;
            private int isDel;
            private int isOpen;
            private String liveAreaId;
            private int roomNums;
            private String unitName;
            private List<DormitoryLtsBean> dormitoryLts;

            public long getCreateTime() {
                return createTime;
            }

            public void setCreateTime(long createTime) {
                this.createTime = createTime;
            }

            public String getFloor() {
                return floor;
            }

            public void setFloor(String floor) {
                this.floor = floor;
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

            public int getIsOpen() {
                return isOpen;
            }

            public void setIsOpen(int isOpen) {
                this.isOpen = isOpen;
            }

            public String getLiveAreaId() {
                return liveAreaId;
            }

            public void setLiveAreaId(String liveAreaId) {
                this.liveAreaId = liveAreaId;
            }

            public int getRoomNums() {
                return roomNums;
            }

            public void setRoomNums(int roomNums) {
                this.roomNums = roomNums;
            }

            public String getUnitName() {
                return unitName;
            }

            public void setUnitName(String unitName) {
                this.unitName = unitName;
            }

            public List<DormitoryLtsBean> getDormitoryLts() {
                return dormitoryLts;
            }

            public void setDormitoryLts(List<DormitoryLtsBean> dormitoryLts) {
                this.dormitoryLts = dormitoryLts;
            }

            public static class DormitoryLtsBean {
                /**
                 * allNums : 4
                 * constructionId : 4a59f12eedc0d907995b0d2dc609fd8c
                 * createTime : 1615262126000
                 * floor : 1
                 * houseNumber : 1001
                 * id : 1
                 * isDel : 0
                 * isOpen : 1
                 * liveNums : 1
                 * operatorId : 447d868cb72412b37a63461d6d713a5e
                 * personLiable : 小芳
                 * sex : 男
                 * unitId : 1
                 */

                private int allNums;
                private String constructionId;
                private long createTime;
                private String floor;
                private String houseNumber;
                private String id;
                private int isDel;
                private int isOpen;
                private int liveNums;
                private String operatorId;
                private String personLiable;
                private String sex;
                private String unitId;

                public int getAllNums() {
                    return allNums;
                }

                public void setAllNums(int allNums) {
                    this.allNums = allNums;
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

                public String getFloor() {
                    return floor;
                }

                public void setFloor(String floor) {
                    this.floor = floor;
                }

                public String getHouseNumber() {
                    return houseNumber;
                }

                public void setHouseNumber(String houseNumber) {
                    this.houseNumber = houseNumber;
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

                public int getIsOpen() {
                    return isOpen;
                }

                public void setIsOpen(int isOpen) {
                    this.isOpen = isOpen;
                }

                public int getLiveNums() {
                    return liveNums;
                }

                public void setLiveNums(int liveNums) {
                    this.liveNums = liveNums;
                }

                public String getOperatorId() {
                    return operatorId;
                }

                public void setOperatorId(String operatorId) {
                    this.operatorId = operatorId;
                }

                public String getPersonLiable() {
                    return personLiable;
                }

                public void setPersonLiable(String personLiable) {
                    this.personLiable = personLiable;
                }

                public String getSex() {
                    return sex;
                }

                public void setSex(String sex) {
                    this.sex = sex;
                }

                public String getUnitId() {
                    return unitId;
                }

                public void setUnitId(String unitId) {
                    this.unitId = unitId;
                }
            }
        }
    }
}
