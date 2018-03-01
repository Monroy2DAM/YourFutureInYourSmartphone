package com.erasmusplus.practica.json_handlers;

import java.util.List;


public class Handler_TiposProyectos {

    /**
     * yf_KTYPE : [{"ID":"1","KTYPENAME":"KA1XXX"},{"ID":"2","KTYPENAME":"KA2XXX"}]
     * success : 1
     */

    private int success;
    private List<YfKTYPEBean> yf_KTYPE;

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public List<YfKTYPEBean> getYf_KTYPE() {
        return yf_KTYPE;
    }

    public void setYf_KTYPE(List<YfKTYPEBean> yf_KTYPE) {
        this.yf_KTYPE = yf_KTYPE;
    }

    public static class YfKTYPEBean {
        /**
         * ID : 1
         * KTYPENAME : KA1XXX
         */

        private String ID;
        private String KTYPENAME;

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getKTYPENAME() {
            return KTYPENAME;
        }

        public void setKTYPENAME(String KTYPENAME) {
            this.KTYPENAME = KTYPENAME;
        }

        @Override
        public String toString() {
            return KTYPENAME;
        }
    }
}
