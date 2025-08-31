package com.hospital.hospital_api.controller;

// controller/PatientController.java

import com.hospital.hospital_api.dto.PatientRequest;
import com.hospital.hospital_api.dto.PatientResponse;
import com.hospital.hospital_api.service.PatientService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
public class PatientController {

  private final PatientService service;

  public PatientController(PatientService service) {
    this.service = service;
  }

  /** 1) POST /patients */
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public PatientResponse create(@RequestBody @Valid PatientRequest request) {
    return service.create(request);
  }
}
