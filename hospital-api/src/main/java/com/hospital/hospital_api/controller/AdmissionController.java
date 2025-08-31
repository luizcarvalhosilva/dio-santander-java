package com.hospital.hospital_api.controller;

// controller/AdmissionController.java

import com.hospital.hospital_api.dto.AdmissionRequest;
import com.hospital.hospital_api.dto.AdmissionResponse;
import com.hospital.hospital_api.service.AdmissionService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admissions")
public class AdmissionController {

  private final AdmissionService service;

  public AdmissionController(AdmissionService service) {
    this.service = service;
  }

  /** 3) POST /admissions */
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public AdmissionResponse create(@RequestBody @Valid AdmissionRequest request) {
    return service.create(request);
  }
}
