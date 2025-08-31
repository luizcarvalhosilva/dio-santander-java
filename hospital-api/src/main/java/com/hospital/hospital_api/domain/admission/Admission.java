package com.hospital.hospital_api.domain.admission;

import com.hospital.hospital_api.domain.enums.AdmissionClassification;
import com.hospital.hospital_api.domain.patient.Patient;
import com.hospital.hospital_api.domain.surgery.Surgery;
import jakarta.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "admissions", indexes = {
  @Index(name = "ix_admission_attendance", columnList = "attendanceNumber", unique = true)
})
public class Admission {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  /** Número de atendimento único da internação */
  @Column(nullable = false, unique = true, length = 36)
  private String attendanceNumber;

  @ManyToOne(optional = false, fetch = FetchType.LAZY)
  private Patient patient;

  @ManyToOne(fetch = FetchType.LAZY)
  private Surgery surgery;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false, length = 20)
  private AdmissionClassification classification;

  @Column(nullable = false)
  private OffsetDateTime createdAt = OffsetDateTime.now();

  // getters/setters
  public Long getId() { return id; }
  public String getAttendanceNumber() { return attendanceNumber; }
  public void setAttendanceNumber(String attendanceNumber) { this.attendanceNumber = attendanceNumber; }
  public Patient getPatient() { return patient; }
  public void setPatient(Patient patient) { this.patient = patient; }
  public Surgery getSurgery() { return surgery; }
  public void setSurgery(Surgery surgery) { this.surgery = surgery; }
  public AdmissionClassification getClassification() { return classification; }
  public void setClassification(AdmissionClassification classification) { this.classification = classification; }
  public OffsetDateTime getCreatedAt() { return createdAt; }
  public void setCreatedAt(OffsetDateTime createdAt) { this.createdAt = createdAt; }
}
