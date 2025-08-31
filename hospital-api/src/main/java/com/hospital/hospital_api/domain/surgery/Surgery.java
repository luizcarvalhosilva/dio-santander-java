package com.hospital.hospital_api.domain.surgery;

import com.hospital.hospital_api.domain.enums.SurgeryType;
import com.hospital.hospital_api.domain.patient.Patient;
import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Table(name = "surgeries")
public class Surgery {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  private String name;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false, length = 20)
  private SurgeryType type;

  @FutureOrPresent
  private LocalDate surgeryDate;

  @ManyToOne(optional = false, fetch = FetchType.LAZY)
  private Patient patient;

  // getters/setters
  public Long getId() { return id; }
  public String getName() { return name; }
  public void setName(String name) { this.name = name; }
  public SurgeryType getType() { return type; }
  public void setType(SurgeryType type) { this.type = type; }
  public LocalDate getSurgeryDate() { return surgeryDate; }
  public void setSurgeryDate(LocalDate surgeryDate) { this.surgeryDate = surgeryDate; }
  public Patient getPatient() { return patient; }
  public void setPatient(Patient patient) { this.patient = patient; }
}
