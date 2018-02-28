package com.erasmusplus.project.yourfutureinyoursmartphone;

import java.util.List;


public class Handler_Areas {


    /**
     * yf_AREA : [{"ID":"1","NAME":"EDUCATION PRIMARY SCHOOL"},{"ID":"2","NAME":"EDUCATION SECONDARY SCHOOL"},{"ID":"3","NAME":"EDUCATION VOCATIONAL SCHOOL"},{"ID":"4","NAME":"COMPUTER"},{"ID":"5","NAME":"TRANSPORT"}]
     * success : 1
     */

    private int success;
    private List<YfAREABean> yf_AREA;

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public List<YfAREABean> getYf_AREA() {
        return yf_AREA;
    }

    public void setYf_AREA(List<YfAREABean> yf_AREA) {
        this.yf_AREA = yf_AREA;
    }

    public static class YfAREABean {
        /**
         * ID : 1
         * NAME : EDUCATION PRIMARY SCHOOL
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

        @Override
        public String toString() {
            return NAME;
        }
    }
}
