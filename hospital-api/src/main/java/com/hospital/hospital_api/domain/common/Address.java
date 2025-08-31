package com.hospital.hospital_api.domain.common;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;

@Embeddable
public class Address {
  @NotBlank
  private String street;
  @NotBlank
  private String city;
  @NotBlank
  private String state;
  @NotBlank
  private String zipCode;

  // getters/setters
  public String getStreet() { return street; }
  public void setStreet(String street) { this.street = street; }

  public String getCity() { return city; }
  public void setCity(String city) { this.city = city; }

  public String getState() { return state; }
  public void setState(String state) { this.state = state; }

  public String getZipCode() { return zipCode; }
  public void setZipCode(String zipCode) { this.zipCode = zipCode; }
}
