package com.emazon.reportes_api.aplication.exceptions;

public class ErrorNotAuthenticated extends RuntimeException {
    public ErrorNotAuthenticated(String message){
        super(message);
    }
}
