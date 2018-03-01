package com.erasmusplus.practica.json_handlers;

import java.util.List;


public class Handler_Paises {

    /**
     * yf_INSTITUTION : [{"COUNTRY":"Spain"},{"COUNTRY":"Afghanistan"}]
     * success : 1
     */

    private int success;
    private List<YfINSTITUTIONBean> yf_INSTITUTION;

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public List<YfINSTITUTIONBean> getYf_INSTITUTION() {
        return yf_INSTITUTION;
    }

    public void setYf_INSTITUTION(List<YfINSTITUTIONBean> yf_INSTITUTION) {
        this.yf_INSTITUTION = yf_INSTITUTION;
    }

    public static class YfINSTITUTIONBean {
        /**
         * COUNTRY : Spain
         */

        private String COUNTRY;

        public String getCOUNTRY() {
            return COUNTRY;
        }

        public void setCOUNTRY(String COUNTRY) {
            this.COUNTRY = COUNTRY;
        }

        @Override
        public String toString() {
            return COUNTRY;
        }
    }
}
