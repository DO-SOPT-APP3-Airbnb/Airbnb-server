package com.app3.server.dormitory.repository;

import com.app3.server.dormitory.controller.dto.response.DormitoryImageGetResponse;
import com.app3.server.dormitory.domain.Dormitory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DormitoryJpaRepository extends JpaRepository<Dormitory, Long> {

    List<Dormitory> findByDormitoryId(int dormitoryId);
}
