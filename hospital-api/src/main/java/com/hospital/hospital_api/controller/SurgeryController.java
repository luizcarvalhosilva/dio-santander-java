package com.hospital.hospital_api.controller;

// controller/SurgeryController.java

import com.hospital.hospital_api.dto.SurgeryRequest;
import com.hospital.hospital_api.dto.SurgeryResponse;
import com.hospital.hospital_api.service.SurgeryService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients/{patientId}/surgeries")
public class SurgeryController {

  private final SurgeryService service;

  public SurgeryController(SurgeryService service) {
    this.service = service;
  }

  /** 2) POST /patients/{patientId}/surgeries */
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public SurgeryResponse create(@PathVariable Long patientId,
                                @RequestBody @Valid SurgeryRequest request) {
    return service.create(patientId, request);
  }
}
