package com.hospital.hospital_api.dto;

import com.hospital.hospital_api.domain.enums.SurgeryType;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

public class SurgeryRequest {
  @NotBlank
  private String name;

  @NotNull
  private SurgeryType type;

  @NotNull
  @FutureOrPresent
  private LocalDate surgeryDate;

  // getters/setters
  public String getName() { return name; }
  public void setName(String name) { this.name = name; }
  public SurgeryType getType() { return type; }
  public void setType(SurgeryType type) { this.type = type; }
  public LocalDate getSurgeryDate() { return surgeryDate; }
  public void setSurgeryDate(LocalDate surgeryDate) { this.surgeryDate = surgeryDate; }
}
