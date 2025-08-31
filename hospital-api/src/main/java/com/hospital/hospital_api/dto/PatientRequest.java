package com.hospital.hospital_api.dto;

import com.hospital.hospital_api.domain.common.Address;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import java.time.LocalDate;

public class PatientRequest {
  @NotBlank
  private String name;

  @Pattern(regexp = "\\d{11}")
  private String cpf;

  @Past
  private LocalDate birthDate;

  @NotBlank
  private String motherName;

  private Address address;

  // getters/setters
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
