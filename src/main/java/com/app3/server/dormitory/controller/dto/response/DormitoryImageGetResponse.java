package com.app3.server.dormitory.controller.dto.response;

import com.app3.server.dormitory.domain.Dormitory;

public record DormitoryImageGetResponse (
        String imageUrl
) {
    public static DormitoryImageGetResponse of(Dormitory dormitory) {
        return new DormitoryImageGetResponse(
                dormitory.getImageUrl()
        );
    }
}