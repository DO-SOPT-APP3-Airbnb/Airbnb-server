package com.app3.server.common.dto;

import com.app3.server.common.exception.enums.SuccessType;

public record ApiResponse<T> (
        int status,
        String message,
        T data
) {
        public static <T> ApiResponse<T> success(SuccessType successType, T data) {
            return new ApiResponse(successType.getHttpStatus().value(), successType.getMessage(), data);
        }

        public static ApiResponse error(int httpStatus, String message) {

            return new ApiResponse(httpStatus, message, "");
        }
    }