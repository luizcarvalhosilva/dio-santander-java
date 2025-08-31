package com.hospital.hospital_api.repository;

// repository/PatientRepository.java

import com.hospital.hospital_api.domain.patient.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
  boolean existsByCpf(String cpf);
}
