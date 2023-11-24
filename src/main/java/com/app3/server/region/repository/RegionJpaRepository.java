package com.app3.server.region.repository;

import com.app3.server.region.domain.Region;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionJpaRepository extends JpaRepository<Region, Long>{
}
