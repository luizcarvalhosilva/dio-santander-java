package com.hospital.hospital_api.service;

// service/SurgeryService.java

import com.hospital.hospital_api.domain.patient.Patient;
import com.hospital.hospital_api.domain.surgery.Surgery;
import com.hospital.hospital_api.dto.SurgeryRequest;
import com.hospital.hospital_api.dto.SurgeryResponse;
import com.hospital.hospital_api.repository.SurgeryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SurgeryService {

  private final SurgeryRepository repo;
  private final PatientService patientService;

  public SurgeryService(SurgeryRepository repo, PatientService patientService) {
    this.repo = repo;
    this.patientService = patientService;
  }

  @Transactional
  public SurgeryResponse create(Long patientId, SurgeryRequest req) {
    Patient patient = patientService.getByIdOrThrow(patientId);

    Surgery s = new Surgery();
    s.setName(req.getName());
    s.setType(req.getType());
    s.setSurgeryDate(req.getSurgeryDate());
    s.setPatient(patient);

    repo.save(s);

    SurgeryResponse out = new SurgeryResponse();
    out.setId(s.getId());
    out.setName(s.getName());
    out.setType(s.getType());
    out.setSurgeryDate(s.getSurgeryDate());
    out.setPatientId(patient.getId());
    return out;
  }

  public Surgery getByIdOrThrow(Long id) {
    return repo.findById(id).orElseThrow(() -> new com.hospital.hospital_api.exception.NotFoundException("surgery not found"));
  }
}
