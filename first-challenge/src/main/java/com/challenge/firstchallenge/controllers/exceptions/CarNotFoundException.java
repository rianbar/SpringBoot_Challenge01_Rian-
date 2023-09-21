package com.challenge.firstchallenge.controllers.exceptions;

import org.springframework.http.HttpStatus;

public class CarNotFoundException extends RuntimeException{

    private final HttpStatus httpStatus;
    private final int error;

    public CarNotFoundException(String message) {
        super(message);
        httpStatus = HttpStatus.NOT_FOUND;
        error = 404;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public int getError() {
        return error;
    }
}
