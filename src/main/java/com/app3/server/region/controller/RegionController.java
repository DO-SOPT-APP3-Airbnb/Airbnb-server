package com.app3.server.region.controller;

import com.app3.server.common.dto.ApiResponse;
import com.app3.server.common.exception.enums.SuccessType;
import com.app3.server.region.controller.dto.response.RegionGetResponse;
import com.app3.server.region.domain.Region;
import com.app3.server.region.service.RegionService;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/region")
@RequiredArgsConstructor

public class RegionController {

    private final RegionService regionService;
    @GetMapping
    public ApiResponse<List<RegionGetResponse>> getMembersProfile() {
        return ApiResponse.success(SuccessType.REGION_SEARCH_SUCCESS, regionService.getRegions());
    }
}
