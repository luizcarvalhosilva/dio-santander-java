package com.hospital.hospital_api.repository;

// repository/SurgeryRepository.java

import com.hospital.hospital_api.domain.surgery.Surgery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurgeryRepository extends JpaRepository<Surgery, Long> {}
