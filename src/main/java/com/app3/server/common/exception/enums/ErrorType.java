package com.app3.server.common.exception.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorType {
    USER_NOT_FOUND_EXCEPTION(HttpStatus.NOT_FOUND, "해당 유저을 찾을 수 없습니다."),
    REGION_NOT_FOUND_EXCEPTION(HttpStatus.NOT_FOUND, "지역 이미지를 찾을 수 없습니다"),

    INTERNAL_SERVER_EXCEPTION(HttpStatus.INTERNAL_SERVER_ERROR, "서버 내부 오류입니다.");
    private final HttpStatus httpStatus;
    private final String message;
}