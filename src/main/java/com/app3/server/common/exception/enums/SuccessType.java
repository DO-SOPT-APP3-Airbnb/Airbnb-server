package com.app3.server.common.exception.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum SuccessType {

    USER_SEARCH_SUCCESS(HttpStatus.OK, "유저 닉네임 조회에 성공하였습니다."),
    REGION_SEARCH_SUCCESS(HttpStatus.OK, "지역 이미지 조회에 성공하였습니다.")
            ;

    private final HttpStatus httpStatus;
    private final String message;
}