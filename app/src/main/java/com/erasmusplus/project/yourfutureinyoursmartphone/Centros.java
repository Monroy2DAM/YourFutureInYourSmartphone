package com.erasmusplus.project.yourfutureinyoursmartphone;

import java.util.List;

public class Centros {

    //==============================================================================================
    // ATRIBUTOS
    //==============================================================================================
    private List<Centro> listaCentros;
    private int exito;

    //==============================================================================================
    // GETTERS Y SETTERS
    //==============================================================================================
    public List<Centro> getListaCentros() {
        return listaCentros;
    }

    public void setListaCentros(List<Centro> listaCentros) {
        this.listaCentros = listaCentros;
    }

    public int getExito() {
        return exito;
    }

    public void setExito(int exito) {
        this.exito = exito;
    }

    //==============================================================================================
    // CLASE ANIDADA CENTRO
    //==============================================================================================
    public static class Centro {

        //==========================================================================================
        // ATRIBUTOS
        //==========================================================================================
        private String idCentro;
        private String correoCentro;
        private String nombreCentro;
        private String direccionCentro;
        private String ciudadCentro;
        private String paisCentro;
        private String tipoCentro;

        //==========================================================================================
        // GETTERS Y SETTERS
        //==========================================================================================
        public String getIdCentro() {
            return idCentro;
        }

        public void setIdCentro(String idCentro) {
            this.idCentro = idCentro;
        }

        public String getCorreoCentro() {
            return correoCentro;
        }

        public void setCorreoCentro(String correoCentro) {
            this.correoCentro = correoCentro;
        }

        public String getNombreCentro() {
            return nombreCentro;
        }

        public void setNombreCentro(String nombreCentro) {
            this.nombreCentro = nombreCentro;
        }

        public String getDireccionCentro() {
            return direccionCentro;
        }

        public void setDireccionCentro(String direccionCentro) {
            this.direccionCentro = direccionCentro;
        }

        public String getCiudadCentro() {
            return ciudadCentro;
        }

        public void setCiudadCentro(String ciudadCentro) {
            this.ciudadCentro = ciudadCentro;
        }

        public String getPaisCentro() {
            return paisCentro;
        }

        public void setPaisCentro(String paisCentro) {
            this.paisCentro = paisCentro;
        }

        public String getTipoCentro() {
            return tipoCentro;
        }

        public void setTipoCentro(String tipoCentro) {
            this.tipoCentro = tipoCentro;
        }

        //==========================================================================================
        // MÉTODOS SOBREESCRITOS
        //==========================================================================================
        @Override
        public String toString() {
            return this.nombreCentro;
        }
    }
}
