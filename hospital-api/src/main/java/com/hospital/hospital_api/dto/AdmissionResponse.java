package com.hospital.hospital_api.dto;

import com.hospital.hospital_api.domain.enums.AdmissionClassification;
import java.time.OffsetDateTime;

public class AdmissionResponse {
  private Long id;
  private String attendanceNumber;
  private Long patientId;
  private Long surgeryId;
  private AdmissionClassification classification;
  private OffsetDateTime createdAt;

  // getters/setters
  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }
  public String getAttendanceNumber() { return attendanceNumber; }
  public void setAttendanceNumber(String attendanceNumber) { this.attendanceNumber = attendanceNumber; }
  public Long getPatientId() { return patientId; }
  public void setPatientId(Long patientId) { this.patientId = patientId; }
  public Long getSurgeryId() { return surgeryId; }
  public void setSurgeryId(Long surgeryId) { this.surgeryId = surgeryId; }
  public AdmissionClassification getClassification() { return classification; }
  public void setClassification(AdmissionClassification classification) { this.classification = classification; }
  public OffsetDateTime getCreatedAt() { return createdAt; }
  public void setCreatedAt(OffsetDateTime createdAt) { this.createdAt = createdAt; }
}
