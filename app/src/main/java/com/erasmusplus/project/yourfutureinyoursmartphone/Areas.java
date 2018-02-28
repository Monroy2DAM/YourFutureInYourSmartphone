package com.erasmusplus.project.yourfutureinyoursmartphone;

import java.util.List;

public class Areas {

    //==============================================================================================
    // ATRIBUTOS
    //==============================================================================================
    private List<Area> listaAreas;
    private int exito;

    //==============================================================================================
    // GETTERS Y SETTERS
    //==============================================================================================
    public List<Area> getListaAreas() {
        return listaAreas;
    }

    public void setListaAreas(List<Area> listaAreas) {
        this.listaAreas = listaAreas;
    }

    public int getExito() {
        return exito;
    }

    public void setExito(int exito) {
        this.exito = exito;
    }

    //==============================================================================================
    // CLASE ANIDADA AREA
    //==============================================================================================
    public static class Area {

        //==========================================================================================
        // ATRIBUTOS
        //==========================================================================================
        private String idArea;
        private String nombreArea;

        //==========================================================================================
        // GETTERS Y SETTERS
        //==========================================================================================
        public String getIdArea() {
            return idArea;
        }

        public void setIdArea(String idArea) {
            this.idArea = idArea;
        }

        public String getNombreArea() {
            return nombreArea;
        }

        public void setNombreArea(String nombreArea) {
            this.nombreArea = nombreArea;
        }

        //==========================================================================================
        // MÉTODOS SOBREESCRITOS
        //==========================================================================================
        @Override
        public String toString() {
            return this.nombreArea;
        }
    }
}