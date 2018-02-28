package com.erasmusplus.project.yourfutureinyoursmartphone;

import java.util.List;

public class TiposCentros {

    //==============================================================================================
    // ATRIBUTOS
    //==============================================================================================
    private List<TipoCentro> listaTiposCentros;
    private int exito;

    //==============================================================================================
    // GETTERS Y SETTERS
    //==============================================================================================
    public List<TipoCentro> getListaTiposCentros() {
        return listaTiposCentros;
    }

    public void setListaTiposCentros(List<TipoCentro> listaTiposCentros) {
        this.listaTiposCentros = listaTiposCentros;
    }

    public int getExito() {
        return exito;
    }

    public void setExito(int exito) {
        this.exito = exito;
    }

    //==============================================================================================
    // CLASE ANIDADA TIPO CENTRO
    //==============================================================================================
    public static class TipoCentro {

        //==========================================================================================
        // ATRIBUTOS
        //==========================================================================================
        private String idTipoCentro;
        private String nombreTipoCentro;

        //==========================================================================================
        // GETTERS Y SETTERS
        //==========================================================================================
        public String getIdTipoCentro() {
            return idTipoCentro;
        }

        public void setIdTipoCentro(String idTipoCentro) {
            this.idTipoCentro = idTipoCentro;
        }

        public String getNombreTipoCentro() {
            return nombreTipoCentro;
        }

        public void setNombreTipoCentro(String nombreTipoCentro) {
            this.nombreTipoCentro = nombreTipoCentro;
        }

        //==========================================================================================
        // MÉTODOS SOBREESCRITOS
        //==========================================================================================
        @Override
        public String toString() {
            return this.nombreTipoCentro;
        }
    }
}