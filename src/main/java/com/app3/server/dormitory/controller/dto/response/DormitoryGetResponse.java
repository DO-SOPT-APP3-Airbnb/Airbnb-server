package com.app3.server.dormitory.controller.dto.response;

import com.app3.server.dormitory.domain.Dormitory;

public record DormitoryGetResponse (
        String description,
        Integer distance,
        String travelDate,
        Integer price,
        Double scope
) {
    public static DormitoryGetResponse of(Dormitory dormitory) {
        return new DormitoryGetResponse(
                dormitory.getDescription(),
                dormitory.getDistance(),
                dormitory.getTravelDate(),
                dormitory.getPrice(),
                dormitory.getScope()
        );
    }
}
