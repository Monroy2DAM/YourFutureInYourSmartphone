package com.erasmusplus.project.yourfutureinyoursmartphone;

import java.util.List;


public class Handler_Ltype {

    /**
     * yf_TYPE : [{"ID":"1","NAME":"PRIMARY SCHOOL"},{"ID":"2","NAME":"SECONDARY SCHOOL"},{"ID":"3","NAME":"VOCATIONAL SCHOOL"},{"ID":"4","NAME":"UNIVERSITY"},{"ID":"5","NAME":"COMPANIES"},{"ID":"6","NAME":"PUBLIC INSTITUTION"},{"ID":"7","NAME":"OTHERS"}]
     * success : 1
     */

    private int success;
    private List<YfTYPEBean> yf_TYPE;

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public List<YfTYPEBean> getYf_TYPE() {
        return yf_TYPE;
    }

    public void setYf_TYPE(List<YfTYPEBean> yf_TYPE) {
        this.yf_TYPE = yf_TYPE;
    }

    public static class YfTYPEBean {
        /**
         * ID : 1
         * NAME : PRIMARY SCHOOL
         */

        private String ID;
        private String NAME;

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getNAME() {
            return NAME;
        }

        public void setNAME(String NAME) {
            this.NAME = NAME;
        }
    }
}
