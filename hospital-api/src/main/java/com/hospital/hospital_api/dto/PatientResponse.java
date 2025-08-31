package com.hospital.hospital_api.dto;

import com.hospital.hospital_api.domain.common.Address;
import java.time.LocalDate;

public class PatientResponse {
  private Long id;
  private String mrn;
  private String name;
  private String cpf;
  private LocalDate birthDate;
  private String motherName;
  private Address address;

  // getters/setters
  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }
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
