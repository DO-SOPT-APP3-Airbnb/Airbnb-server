package com.app3.server.dormitory.controller;

import com.app3.server.common.dto.ApiResponse;
import com.app3.server.common.exception.enums.SuccessType;
import com.app3.server.dormitory.controller.dto.response.DormitoryGetResponse;
import com.app3.server.dormitory.controller.dto.response.DormitoryImageGetResponse;
import com.app3.server.dormitory.domain.Dormitory;
import com.app3.server.dormitory.service.DomitoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dormitory")
@RequiredArgsConstructor
public class DormitoryController {
    private final DomitoryService domitoryService;

    @GetMapping
    public ApiResponse<List<DormitoryGetResponse>> getDormitories() {
        return ApiResponse.success(SuccessType.DORMITORY_SEARCH_SUCCESS, domitoryService.getDormitories());
    }
    @GetMapping("/image/{dormitoryId}")
    public ApiResponse<List<DormitoryImageGetResponse>> getDormitoryImages(@PathVariable Integer dormitoryId) {
        List<DormitoryImageGetResponse> dormitoryImages = domitoryService.getDormitoryImages(dormitoryId);
        return ApiResponse.success(SuccessType.DORMITORY_IMAGE_SEARCH_SUCCESS, dormitoryImages);
    }
}
