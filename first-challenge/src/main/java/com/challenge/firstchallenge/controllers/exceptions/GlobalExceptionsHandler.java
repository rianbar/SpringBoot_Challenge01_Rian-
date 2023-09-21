package com.challenge.firstchallenge.controllers.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalExceptionsHandler {

    @ExceptionHandler(CarNotFoundException.class)
    public ResponseEntity<Object> getNotFoundException(CarNotFoundException exp) {

        CarExceptionResponse response = new CarExceptionResponse(
                exp.getError(),
                exp.getMessage(),
                exp.getHttpStatus().toString()
        );

        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> getNotFoundException(){

        String httpStatus = HttpStatus.BAD_REQUEST.toString();
        String message = "payload fields cannot be empty!";
        int error_code = 400;

        CarExceptionResponse response = new CarExceptionResponse(
                error_code,
                httpStatus,
                message
        );

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> anyOtherException() {

        String httpStatus = HttpStatus.INTERNAL_SERVER_ERROR.toString();
        String message = "an unexpected error occurred";
        int error_code = 500;

        CarExceptionResponse response = new CarExceptionResponse(
                error_code,
                httpStatus,
                message
        );

        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
