package com.hospital.hospital_api.dto;

import jakarta.validation.constraints.NotNull;

public class AdmissionRequest {
  @NotNull
  private Long patientId;

  /** Cirurgia associada à internação; usada para classificar EMERGENCY/ELECTIVE */
  @NotNull
  private Long surgeryId;

  // getters/setters
  public Long getPatientId() { return patientId; }
  public void setPatientId(Long patientId) { this.patientId = patientId; }
  public Long getSurgeryId() { return surgeryId; }
  public void setSurgeryId(Long surgeryId) { this.surgeryId = surgeryId; }
}
