package com.erasmusplus.project.yourfutureinyoursmartphone;

import java.util.List;

public class Paises {
    /**
     * yf_INSTITUTION : [{"COUNTRY":"Spain"},{"COUNTRY":"Afghanistan"}]
     * success : 1
     */

    //==============================================================================================
    // ATRIBUTOS
    //==============================================================================================
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






    /*
    private List<Pais> listaPaises;
    private int exito;

    //==============================================================================================
    // GETTERS Y SETTERS
    //==============================================================================================
    public List<Pais> getListaPaises() {
        return listaPaises;
    }

    public void setListaPaises(List<Pais> listaPaises) {
        this.listaPaises = listaPaises;
    }

    public int getExito() {
        return exito;
    }

    public void setExito(int exito) {
        this.exito = exito;
    }

    //==============================================================================================
    // CLASE ANIDADA PAIS
    //==============================================================================================
    public static class Pais {

        //==========================================================================================
        // ATRIBUTOS
        //==========================================================================================
        private String nombrePais;

        //==========================================================================================
        // GETTERS Y SETTERS
        //==========================================================================================
        public String getNombrePais() {
            return nombrePais;
        }

        public void setNombrePais(String nombrePais) {
            this.nombrePais = nombrePais;
        }

        //==========================================================================================
        // MÉTODOS SOBREESCRITOS
        //==========================================================================================
        @Override
        public String toString() {
            return this.nombrePais;
        }
    }*/
}