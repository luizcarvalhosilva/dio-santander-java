package com.hospital.hospital_api.service;

// service/PatientService.java

import com.hospital.hospital_api.domain.patient.Patient;
import com.hospital.hospital_api.dto.PatientRequest;
import com.hospital.hospital_api.dto.PatientResponse;
import com.hospital.hospital_api.exception.BusinessException;
import com.hospital.hospital_api.repository.PatientRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class PatientService {

  private final PatientRepository repo;

  public PatientService(PatientRepository repo) {
    this.repo = repo;
  }

  @Transactional
  public PatientResponse create(PatientRequest req) {
    if (repo.existsByCpf(req.getCpf())) {
      throw new BusinessException("cpf already registered");
    }

    Patient p = new Patient();
    p.setMrn(generateMrn());
    p.setName(req.getName());
    p.setCpf(req.getCpf());
    p.setBirthDate(req.getBirthDate());
    p.setMotherName(req.getMotherName());
    p.setAddress(req.getAddress());

    repo.save(p);

    PatientResponse out = new PatientResponse();
    out.setId(p.getId());
    out.setMrn(p.getMrn());
    out.setName(p.getName());
    out.setCpf(p.getCpf());
    out.setBirthDate(p.getBirthDate());
    out.setMotherName(p.getMotherName());
    out.setAddress(p.getAddress());
    return out;
  }

  private String generateMrn() {
    // MRN curto (sem hífens)
    return UUID.randomUUID().toString().replace("-", "").substring(0, 16);
  }

  public Patient getByIdOrThrow(Long id) {
    return repo.findById(id).orElseThrow(() -> new com.hospital.hospital_api.exception.NotFoundException("patient not found"));
  }
}
