package com.hospital.hospital_api.dto;

import com.hospital.hospital_api.domain.enums.SurgeryType;
import java.time.LocalDate;

public class SurgeryResponse {
  private Long id;
  private String name;
  private SurgeryType type;
  private LocalDate surgeryDate;
  private Long patientId;

  // getters/setters
  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }
  public String getName() { return name; }
  public void setName(String name) { this.name = name; }
  public SurgeryType getType() { return type; }
  public void setType(SurgeryType type) { this.type = type; }
  public LocalDate getSurgeryDate() { return surgeryDate; }
  public void setSurgeryDate(LocalDate surgeryDate) { this.surgeryDate = surgeryDate; }
  public Long getPatientId() { return patientId; }
  public void setPatientId(Long patientId) { this.patientId = patientId; }
}
