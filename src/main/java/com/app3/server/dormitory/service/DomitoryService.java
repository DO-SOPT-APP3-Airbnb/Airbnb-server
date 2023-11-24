package com.app3.server.dormitory.service;

import com.app3.server.dormitory.controller.dto.response.DormitoryGetResponse;
import com.app3.server.dormitory.controller.dto.response.DormitoryImageGetResponse;
import com.app3.server.dormitory.domain.Dormitory;
import com.app3.server.dormitory.repository.DormitoryJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Transactional
@Service
@RequiredArgsConstructor
public class DomitoryService {
    private final DormitoryJpaRepository dormitoryJpaRepository;

    public List<DormitoryGetResponse> getDormitories() {
        return dormitoryJpaRepository.findAll()
                .stream()
                .map(DormitoryGetResponse::of)
                .collect(Collectors.toList());
    }
    public List<DormitoryImageGetResponse> getDormitoryImages() {
        return dormitoryJpaRepository.findAll()
                .stream()
                .map(DormitoryImageGetResponse::of)
                .collect(Collectors.toList());
    }
}
