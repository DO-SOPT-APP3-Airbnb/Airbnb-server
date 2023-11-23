package com.app3.server.common.exception.model;

import com.app3.server.common.exception.enums.ErrorType;
public class SoptException extends RuntimeException{
    private final ErrorType error;

    public SoptException(final ErrorType error){
        super(error.getMessage());
        this.error = error;
    }
    public int getHttpStatus(){
        return error.getHttpStatus().value();
    }
}