package com.app3.server.region.service;

import com.app3.server.region.controller.dto.response.RegionGetResponse;
import com.app3.server.region.repository.RegionJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Transactional
@Service
@RequiredArgsConstructor
public class RegionService {
    private final RegionJpaRepository regionJpaRepository;

    public List<RegionGetResponse> getRegions() {
        return regionJpaRepository.findAll()
                .stream()
                .map(RegionGetResponse::of)
                .collect(Collectors.toList());
    }
}
