package com.erasmusplus.project.yourfutureinyoursmartphone;

import java.util.List;

public class Proyectos {

    //==============================================================================================
    // ATRIBUTOS
    //==============================================================================================
    private List<Proyecto> listaProyectos;
    private int exito;

    //==============================================================================================
    // GETTERS Y SETTERS
    //==============================================================================================
    public List<Proyecto> getListaProyectos() {
        return listaProyectos;
    }

    public void setListaProyectos(List<Proyecto> listaProyectos) {
        this.listaProyectos = listaProyectos;
    }

    public int getExito() {
        return exito;
    }

    public void setExito(int exito) {
        this.exito = exito;
    }

    //==============================================================================================
    // CLASE ANIDADA PROYECTO
    //==============================================================================================
    public static class Proyecto {

        //==========================================================================================
        // ATRIBUTOS
        //==========================================================================================
        private String idProyecto;
        private String nombreProyecto;
        private String descripcionProyecto;
        private String idContacto;
        private String tipoProyecto;

        //==========================================================================================
        // GETTERS Y SETTERS
        //==========================================================================================
        public String getIdProyecto() {
            return idProyecto;
        }

        public void setIdProyecto(String idProyecto) {
            this.idProyecto = idProyecto;
        }

        public String getNombreProyecto() {
            return nombreProyecto;
        }

        public void setNombreProyecto(String nombreProyecto) {
            this.nombreProyecto = nombreProyecto;
        }

        public String getDescripcionProyecto() {
            return descripcionProyecto;
        }

        public void setDescripcionProyecto(String descripcionProyecto) {
            this.descripcionProyecto = descripcionProyecto;
        }

        public String getIdContacto() {
            return idContacto;
        }

        public void setIdContacto(String idContacto) {
            this.idContacto = idContacto;
        }

        public String getTipoProyecto() {
            return tipoProyecto;
        }

        public void setTipoProyecto(String tipoProyecto) {
            this.tipoProyecto = tipoProyecto;
        }

        //==========================================================================================
        // MÉTODOS SOBREESCRITOS
        //==========================================================================================
        @Override
        public String toString() {
            return this.idProyecto;
        }
    }
}
