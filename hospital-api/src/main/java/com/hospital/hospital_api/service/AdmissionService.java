package com.hospital.hospital_api.service;

// service/AdmissionService.java

import com.hospital.hospital_api.domain.admission.Admission;
import com.hospital.hospital_api.domain.enums.AdmissionClassification;
import com.hospital.hospital_api.domain.enums.SurgeryType;
import com.hospital.hospital_api.domain.patient.Patient;
import com.hospital.hospital_api.domain.surgery.Surgery;
import com.hospital.hospital_api.dto.AdmissionRequest;
import com.hospital.hospital_api.dto.AdmissionResponse;
import com.hospital.hospital_api.repository.AdmissionRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class AdmissionService {

  private final AdmissionRepository repo;
  private final PatientService patientService;
  private final SurgeryService surgeryService;

  public AdmissionService(AdmissionRepository repo, PatientService patientService, SurgeryService surgeryService) {
    this.repo = repo;
    this.patientService = patientService;
    this.surgeryService = surgeryService;
  }

  @Transactional
  public AdmissionResponse create(AdmissionRequest req) {
    Patient patient = patientService.getByIdOrThrow(req.getPatientId());
    Surgery surgery = surgeryService.getByIdOrThrow(req.getSurgeryId());

    Admission a = new Admission();
    a.setAttendanceNumber(generateAttendance());
    a.setPatient(patient);
    a.setSurgery(surgery);

    AdmissionClassification classification =
        (surgery.getType() == SurgeryType.URGENCY) ? AdmissionClassification.EMERGENCY : AdmissionClassification.ELECTIVE;

    a.setClassification(classification);

    repo.save(a);

    AdmissionResponse out = new AdmissionResponse();
    out.setId(a.getId());
    out.setAttendanceNumber(a.getAttendanceNumber());
    out.setPatientId(patient.getId());
    out.setSurgeryId(surgery.getId());
    out.setClassification(a.getClassification());
    out.setCreatedAt(a.getCreatedAt());
    return out;
  }

  private String generateAttendance() {
    return UUID.randomUUID().toString();
  }
}

