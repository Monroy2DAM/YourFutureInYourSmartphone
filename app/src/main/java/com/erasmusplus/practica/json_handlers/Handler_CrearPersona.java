package com.erasmusplus.practica.json_handlers;

public class Handler_CrearPersona {
    /**
     * success : 0
     * message : Se requieren campos que están vacíos
     */

    private int success;
    private String message;

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /*//==============================================================================================
    // ATRIBUTOS
    //==============================================================================================
    private String mensaje;
    private int exito;

    //==============================================================================================
    // GETTERS Y SETTERS
    //==============================================================================================
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public int getExito() {
        return exito;
    }

    public void setExito(int exito) {
        this.exito = exito;
    }*/
}
