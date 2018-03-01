package com.erasmusplus.practica.json_handlers;

/**
 * Created by Ismael on 27/02/2018.
 */

public class Handler_login {


    /**
     * success : 0
     * message : Required field(s) is missing
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
}
