package com.erasmusplus.project.yourfutureinyoursmartphone;

import java.util.List;

public class Personas {

    //==============================================================================================
    // ATRIBUTOS
    //==============================================================================================
    private int exito;
    private List<Persona> listaPersonas;

    //==============================================================================================
    // GETTERS Y SETTERS
    //==============================================================================================
    public List<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(List<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public int getExito() {
        return exito;
    }

    public void setExito(int exito) {
        this.exito = exito;
    }

    //==============================================================================================
    // CLASE ANIDADA PERSONA
    //==============================================================================================
    public static class Persona {

        //==========================================================================================
        // ATRIBUTOS
        //==========================================================================================
        private String idPersona;
        private String correoPersona;
        private String nombrePersona;
        private String apellidosPersona;
        private String confirmacionCorreo;
        private String confirmacionCorreoCentro;
        private String areaPersona;
        private String clavePersona;
        private String idCentro;

        //==========================================================================================
        // GETTERS Y SETTERS
        //==========================================================================================
        public String getIdPersona() {
            return idPersona;
        }

        public void setIdPersona(String idPersona) {
            this.idPersona = idPersona;
        }

        public String getCorreoPersona() {
            return correoPersona;
        }

        public void setCorreoPersona(String correoPersona) {
            this.correoPersona = correoPersona;
        }

        public String getNombrePersona() {
            return nombrePersona;
        }

        public void setNombrePersona(String nombrePersona) {
            this.nombrePersona = nombrePersona;
        }

        public String getApellidosPersona() {
            return apellidosPersona;
        }

        public void setApellidosPersona(String apellidosPersona) {
            this.apellidosPersona = apellidosPersona;
        }

        public String getConfirmacionCorreo() {
            return confirmacionCorreo;
        }

        public void setConfirmacionCorreo(String confirmacionCorreo) {
            this.confirmacionCorreo = confirmacionCorreo;
        }

        public String getConfirmacionCorreoCentro() {
            return confirmacionCorreoCentro;
        }

        public void setConfirmacionCorreoCentro(String confirmacionCorreoCentro) {
            this.confirmacionCorreoCentro = confirmacionCorreoCentro;
        }

        public String getAreaPersona() {
            return areaPersona;
        }

        public void setAreaPersona(String areaPersona) {
            this.areaPersona = areaPersona;
        }

        public String getClavePersona() {
            return clavePersona;
        }

        public void setClavePersona(String clavePersona) {
            this.clavePersona = clavePersona;
        }

        public String getIdCentro() {
            return idCentro;
        }

        public void setIdCentro(String idCentro) {
            this.idCentro = idCentro;
        }

        //==========================================================================================
        // MÉTODOS SOBREESCRITO
        //==========================================================================================
        @Override
        public String toString() {
            return "Persona{" +
                    "idPersona='" + idPersona + '\'' +
                    ", correoPersona='" + correoPersona + '\'' +
                    ", nombrePersona='" + nombrePersona + '\'' +
                    ", apellidosPersona='" + apellidosPersona + '\'' +
                    ", confirmacionCorreo='" + confirmacionCorreo + '\'' +
                    ", confirmacionCorreoCentro='" + confirmacionCorreoCentro + '\'' +
                    ", areaPersona='" + areaPersona + '\'' +
                    ", clavePersona='" + clavePersona + '\'' +
                    ", idCentro='" + idCentro + '\'' +
                    '}';
        }
    }
}