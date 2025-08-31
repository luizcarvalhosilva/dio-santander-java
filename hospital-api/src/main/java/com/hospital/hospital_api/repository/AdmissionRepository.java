package com.hospital.hospital_api.repository;

// repository/AdmissionRepository.java

import com.hospital.hospital_api.domain.admission.Admission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdmissionRepository extends JpaRepository<Admission, Long> {
  boolean existsByAttendanceNumber(String attendanceNumber);
}
