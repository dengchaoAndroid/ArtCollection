package com.tsutsuku.artcollection.model.shopping;

import java.util.List;

/**
 * @Author Sun Renwei
 * @Create 2017/1/19
 * @Description Content
 */

public class ProvinceBean {

    /**
     * id : 110000
     * name : 北京市
     * citys : [{"id":"110100","name":"市辖区","area":[{"id":"110101","name":"东城区"},{"id":"110102","name":"西城区"},{"id":"110103","name":"崇文区"},{"id":"110104","name":"宣武区"},{"id":"110105","name":"朝阳区"},{"id":"110106","name":"丰台区"},{"id":"110107","name":"石景山区"},{"id":"110108","name":"海淀区"},{"id":"110109","name":"门头沟区"},{"id":"110111","name":"房山区"},{"id":"110112","name":"通州区"},{"id":"110113","name":"顺义区"},{"id":"110114","name":"昌平区"},{"id":"110115","name":"大兴区"},{"id":"110116","name":"怀柔区"},{"id":"110117","name":"平谷区"}]},{"id":"110200","name":"县","area":[{"id":"110228","name":"密云县"},{"id":"110229","name":"延庆县"}]}]
     */

    private String id;
    private String name;
    private List<CitysBean> citys;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CitysBean> getCitys() {
        return citys;
    }

    public void setCitys(List<CitysBean> citys) {
        this.citys = citys;
    }

    public static class CitysBean {
        /**
         * id : 110100
         * name : 市辖区
         * area : [{"id":"110101","name":"东城区"},{"id":"110102","name":"西城区"},{"id":"110103","name":"崇文区"},{"id":"110104","name":"宣武区"},{"id":"110105","name":"朝阳区"},{"id":"110106","name":"丰台区"},{"id":"110107","name":"石景山区"},{"id":"110108","name":"海淀区"},{"id":"110109","name":"门头沟区"},{"id":"110111","name":"房山区"},{"id":"110112","name":"通州区"},{"id":"110113","name":"顺义区"},{"id":"110114","name":"昌平区"},{"id":"110115","name":"大兴区"},{"id":"110116","name":"怀柔区"},{"id":"110117","name":"平谷区"}]
         */

        private String id;
        private String name;
        private List<AreaBean> area;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<AreaBean> getArea() {
            return area;
        }

        public void setArea(List<AreaBean> area) {
            this.area = area;
        }

        public static class AreaBean {
            /**
             * id : 110101
             * name : 东城区
             */

            private String id;
            private String name;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
