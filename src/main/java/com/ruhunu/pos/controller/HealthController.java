package com.ruhunu.pos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruhunu.pos.dto.HealthDTO;
import com.ruhunu.pos.service.HealthService;

/**
 * This will route to the application health
 */
@RestController
@RequestMapping({ "/health" })
public class HealthController {

  @Autowired
  private HealthService healthService;

  @GetMapping
  public ResponseEntity<HealthDTO> getAppHealth() {
    HealthDTO healthDTO = healthService.getHealth();
    healthDTO.add(ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(HealthController.class).getAppHealth()).withSelfRel());
    return new ResponseEntity<>(healthDTO, HttpStatus.OK);
  }

}
