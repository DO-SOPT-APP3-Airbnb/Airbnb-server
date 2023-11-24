package com.app3.server.dormitory.repository;

import com.app3.server.dormitory.domain.Dormitory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DormitoryJpaRepository extends JpaRepository<Dormitory, Long> {
}
