package com.challenge.firstchallenge.controllers.exceptions;

public class CarExceptionResponse {

    private int error;
    private String error_type;
    private String message;


    public CarExceptionResponse(int error, String error_type, String message) {
        this.error = error;
        this.error_type = error_type;
        this.message = message;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getError_type() {
        return error_type;
    }

    public void setError_type(String error_type) {
        this.error_type = error_type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
