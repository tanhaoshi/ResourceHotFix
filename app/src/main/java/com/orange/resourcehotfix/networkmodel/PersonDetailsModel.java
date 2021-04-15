package com.orange.resourcehotfix.networkmodel;

import java.io.Serializable;
import java.util.List;

/**
 * create by ths on 2020/6/20
 */
public class PersonDetailsModel {


    /**
     * code : 1000
     * message : 请求处理成功
     * result : {"current":1,"orders":[],"pages":1,"records":[{"empName":"谭浩世","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200619/24f6cec076a64670bbcbcbf56bf6b7da.jpg","id":"04399cbd73c05004f9b840e74320b2ac"},{"empName":"谭浩世","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200618/960165c798014167ad8f1927c2c0102a.jpg","id":"0670bcf49e0894f69bfdfeccf80d998a"},{"empName":"谭皓","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200619/6e9cc7107e094d7091c6e075075692e0.jpg","id":"1ef9f6b53f8321d99126fde2b5707ca2"},{"empName":"aa","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200612/799d85b6644d4e53911b0e8f27bcc0fc.jpg","id":"291102b0046bdecd0b769a86d5708136"},{"empName":"宫崎骏","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200615/b31070f5b55348388f2aefa38f3dc2c0.jpg","id":"3e6e95f3a7908285defd6f42a4c1d222"},{"empName":"顺丰速递","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200619/ca18a6c52888458ca1ca1ba081e43bbe.jpg","id":"5420a0ab17c02c2f0eac674a802f87ef"},{"empName":"ee","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200615/13d42a06a7ef41f5920f902db3a975e2.jpg","id":"5b725373d2b217855a7f50ec0e9775c6"},{"empName":"可口可乐","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200613/bd2da582bdf1466796188a75036ddd21.jpg","id":"620d2170b87614a68c72981f88c9f010"},{"empName":"谭皓","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200619/366c8101168b4289861ee74c007743ec.jpg","id":"6c612702b0d5f706cc5388b615e107c0"},{"empName":"丽萨","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200612/e85263a6e4714d28b83580cd22b5006f.jpg","id":"731f9bc8604356a4d0da71c98e2c181a"},{"empName":"详浩世","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200618/3e3734febc224d598e200ca2c683a3c6.jpg","id":"74e4096b83522c1f460a655b2f3c79bb"},{"empName":"特朗普","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200615/fbab987b5d11488f9d977542e9360ed6.jpg","id":"8463c4161141cbd1e7bc19ac79cd9a7a"},{"empName":"谭浩世","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200618/960165c798014167ad8f1927c2c0102a.jpg","id":"8a04a08b14370c09e5fcc8864fde4d92"},{"empName":"王梦遂","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200619/bf769a6682a74140897b93b8a81c886e.jpg","id":"8a88d4df9ad4861cfde845196ea393ea"},{"empName":"谭浩世","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200618/960165c798014167ad8f1927c2c0102a.jpg","id":"94f4f713e2b1826b3c5f50fc9763a97d"},{"empName":"朴彩英","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200612/ceaa6398e7764172841b59bba2808c3e.jpg","id":"96bb1137f3b414dd6a369d84a62a97b4"},{"empName":"某王姓大侠","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200615/eef219d37a3b4b5db8461a55a938e459.jpg","id":"9ceb573f3401bc5bba5abd23552a0215"},{"empName":"谭浩世","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200618/960165c798014167ad8f1927c2c0102a.jpg","id":"9f668d34abdcdb5e53b1dd7bea3da3ae"},{"empName":"谭浩世","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200618/960165c798014167ad8f1927c2c0102a.jpg","id":"b6db2629be32c1ae6991e85c84da2ebe"},{"empName":"金智秀","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200612/40fcba6cd84d48b795802961c0bae816.jpg","id":"d7af22aa9139b3ba997c45eb0a4d96dd"},{"empName":"胡椒","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200613/77ab7e5acd974977bf95c6f11d835875.jpg","id":"def819ecd5b0510f95f5d1ab7ebab72a"},{"empName":"舒婷","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200612/e1194ddf00b540e885cd71ca4fe4c1cf.jpg","id":"e4bfc3cee8b647ffcaaa97ccc4a88034"},{"empName":"嗡嗡嗡","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200617/f66c9da169cb466398c20c17be988ec0.jpg","id":"ebda8ec3a0970f6dcf34991f1142fc38"},{"empName":"谭浩世","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200618/960165c798014167ad8f1927c2c0102a.jpg","id":"fa109dece30fe1485601a22779fbec43"},{"empName":"金智妮","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200612/884afe2e7eae41df921af383858866aa.jpg","id":"fa541ea302913389d94679b61403e779"}],"searchCount":true,"size":500,"total":25}
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
         * records : [{"empName":"谭浩世","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200619/24f6cec076a64670bbcbcbf56bf6b7da.jpg","id":"04399cbd73c05004f9b840e74320b2ac"},{"empName":"谭浩世","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200618/960165c798014167ad8f1927c2c0102a.jpg","id":"0670bcf49e0894f69bfdfeccf80d998a"},{"empName":"谭皓","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200619/6e9cc7107e094d7091c6e075075692e0.jpg","id":"1ef9f6b53f8321d99126fde2b5707ca2"},{"empName":"aa","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200612/799d85b6644d4e53911b0e8f27bcc0fc.jpg","id":"291102b0046bdecd0b769a86d5708136"},{"empName":"宫崎骏","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200615/b31070f5b55348388f2aefa38f3dc2c0.jpg","id":"3e6e95f3a7908285defd6f42a4c1d222"},{"empName":"顺丰速递","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200619/ca18a6c52888458ca1ca1ba081e43bbe.jpg","id":"5420a0ab17c02c2f0eac674a802f87ef"},{"empName":"ee","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200615/13d42a06a7ef41f5920f902db3a975e2.jpg","id":"5b725373d2b217855a7f50ec0e9775c6"},{"empName":"可口可乐","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200613/bd2da582bdf1466796188a75036ddd21.jpg","id":"620d2170b87614a68c72981f88c9f010"},{"empName":"谭皓","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200619/366c8101168b4289861ee74c007743ec.jpg","id":"6c612702b0d5f706cc5388b615e107c0"},{"empName":"丽萨","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200612/e85263a6e4714d28b83580cd22b5006f.jpg","id":"731f9bc8604356a4d0da71c98e2c181a"},{"empName":"详浩世","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200618/3e3734febc224d598e200ca2c683a3c6.jpg","id":"74e4096b83522c1f460a655b2f3c79bb"},{"empName":"特朗普","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200615/fbab987b5d11488f9d977542e9360ed6.jpg","id":"8463c4161141cbd1e7bc19ac79cd9a7a"},{"empName":"谭浩世","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200618/960165c798014167ad8f1927c2c0102a.jpg","id":"8a04a08b14370c09e5fcc8864fde4d92"},{"empName":"王梦遂","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200619/bf769a6682a74140897b93b8a81c886e.jpg","id":"8a88d4df9ad4861cfde845196ea393ea"},{"empName":"谭浩世","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200618/960165c798014167ad8f1927c2c0102a.jpg","id":"94f4f713e2b1826b3c5f50fc9763a97d"},{"empName":"朴彩英","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200612/ceaa6398e7764172841b59bba2808c3e.jpg","id":"96bb1137f3b414dd6a369d84a62a97b4"},{"empName":"某王姓大侠","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200615/eef219d37a3b4b5db8461a55a938e459.jpg","id":"9ceb573f3401bc5bba5abd23552a0215"},{"empName":"谭浩世","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200618/960165c798014167ad8f1927c2c0102a.jpg","id":"9f668d34abdcdb5e53b1dd7bea3da3ae"},{"empName":"谭浩世","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200618/960165c798014167ad8f1927c2c0102a.jpg","id":"b6db2629be32c1ae6991e85c84da2ebe"},{"empName":"金智秀","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200612/40fcba6cd84d48b795802961c0bae816.jpg","id":"d7af22aa9139b3ba997c45eb0a4d96dd"},{"empName":"胡椒","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200613/77ab7e5acd974977bf95c6f11d835875.jpg","id":"def819ecd5b0510f95f5d1ab7ebab72a"},{"empName":"舒婷","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200612/e1194ddf00b540e885cd71ca4fe4c1cf.jpg","id":"e4bfc3cee8b647ffcaaa97ccc4a88034"},{"empName":"嗡嗡嗡","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200617/f66c9da169cb466398c20c17be988ec0.jpg","id":"ebda8ec3a0970f6dcf34991f1142fc38"},{"empName":"谭浩世","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200618/960165c798014167ad8f1927c2c0102a.jpg","id":"fa109dece30fe1485601a22779fbec43"},{"empName":"金智妮","faceUrl":"https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200612/884afe2e7eae41df921af383858866aa.jpg","id":"fa541ea302913389d94679b61403e779"}]
         * searchCount : true
         * size : 500
         * total : 25
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

        public static class RecordsBean implements Serializable {
            /**
             * empName : 谭浩世
             * faceUrl : https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20200619/24f6cec076a64670bbcbcbf56bf6b7da.jpg
             * id : 04399cbd73c05004f9b840e74320b2ac
             */

            private String empName;
            private String faceUrl;
            private String id;

            public String getEmpName() {
                return empName;
            }

            public void setEmpName(String empName) {
                this.empName = empName;
            }

            public String getFaceUrl() {
                return faceUrl;
            }

            public void setFaceUrl(String faceUrl) {
                this.faceUrl = faceUrl;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }
        }
    }
}
