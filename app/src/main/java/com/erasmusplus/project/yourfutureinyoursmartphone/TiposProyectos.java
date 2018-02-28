package com.erasmusplus.project.yourfutureinyoursmartphone;

import java.util.List;

public class TiposProyectos {

    //==============================================================================================
    // ATRIBUTOS
    //==============================================================================================
    private List<TipoProyecto> listaTiposProyectos;
    private int exito;

    //==============================================================================================
    // GETTERS Y SETTERS
    //==============================================================================================
    public List<TipoProyecto> getListaTiposProyectos() {
        return listaTiposProyectos;
    }

    public void setListaTiposProyectos(List<TipoProyecto> listaTiposProyectos) {
        this.listaTiposProyectos = listaTiposProyectos;
    }

    public int getExito() {
        return exito;
    }

    public void setExito(int exito) {
        this.exito = exito;
    }

    //==============================================================================================
    // CLASE ANIDADA TIPO PROYECTO
    //==============================================================================================
    public static class TipoProyecto {

        //==========================================================================================
        // ATRIBUTOS
        //==========================================================================================
        private String idTipoProyecto;
        private String nombreTipoProyecto;

        //==========================================================================================
        // GETTERS Y SETTERS
        //==========================================================================================
        public String getIdTipoProyecto() {
            return idTipoProyecto;
        }

        public void setIdTipoProyecto(String idTipoProyecto) {
            this.idTipoProyecto = idTipoProyecto;
        }

        public String getNombreTipoProyecto() {
            return nombreTipoProyecto;
        }

        public void setNombreTipoProyecto(String nombreTipoProyecto) {
            this.nombreTipoProyecto = nombreTipoProyecto;
        }

        //==========================================================================================
        // MÉTODOS SOBREESCRITOS
        //==========================================================================================
        @Override
        public String toString() {
            return this.getNombreTipoProyecto();
        }
    }
}
