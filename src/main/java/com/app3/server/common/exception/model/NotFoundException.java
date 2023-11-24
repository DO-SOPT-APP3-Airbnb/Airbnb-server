package com.app3.server.common.exception.model;

import com.app3.server.common.exception.enums.ErrorType;

public class NotFoundException extends SoptException{

    public NotFoundException(final ErrorType errorType) {
        super(errorType);
    }
}