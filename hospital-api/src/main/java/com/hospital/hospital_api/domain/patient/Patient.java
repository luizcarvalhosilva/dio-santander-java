package com.hospital.hospital_api.domain.patient;

import com.hospital.hospital_api.domain.common.Address;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import java.time.LocalDate;

@Entity
@Table(name = "patients", uniqueConstraints = {
  @UniqueConstraint(name = "uk_patient_mrn", columnNames = "mrn"),
  @UniqueConstraint(name = "uk_patient_cpf", columnNames = "cpf")
})
public class Patient {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  /** Medical Record Number (unique hospital MRN) */
  @Column(nullable = false, unique = true, length = 32)
  private String mrn;

  @NotBlank
  private String name;

  /** CPF apenas dígitos (ex: 00011122233) */
  @Pattern(regexp = "\\d{11}", message = "cpf must have 11 digits")
  @Column(nullable = false, unique = true, length = 11)
  private String cpf;

  @Past
  private LocalDate birthDate;

  @NotBlank
  private String motherName;

  @Embedded
  private Address address;

  // getters/setters
  public Long getId() { return id; }
  public String getMrn() { return mrn; }
  public void setMrn(String mrn) { this.mrn = mrn; }
  public String getName() { return name; }
  public void setName(String name) { this.name = name; }
  public String getCpf() { return cpf; }
  public void setCpf(String cpf) { this.cpf = cpf; }
  public LocalDate getBirthDate() { return birthDate; }
  public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }
  public String getMotherName() { return motherName; }
  public void setMotherName(String motherName) { this.motherName = motherName; }
  public Address getAddress() { return address; }
  public void setAddress(Address address) { this.address = address; }
}
