package com.app3.server.user.controller.dto.response;

import com.app3.server.user.domain.User;

public record UserGetResponse (
        String nickname
) {
    public static UserGetResponse of(User user) {
        return new UserGetResponse(
                user.getNickname()
        );
    }
}


