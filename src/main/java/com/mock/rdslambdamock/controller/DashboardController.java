package com.mock.rdslambdamock.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mock.rdslambdamock.mock.MockGenerator;
import com.mock.rdslambdamock.model.OrganizationStatusReport;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/organization")
@Slf4j
public class DashboardController {

  @GetMapping("/{id}")
  public OrganizationStatusReport getOrganizationReport(@PathVariable String id)
      throws JsonProcessingException {

    OrganizationStatusReport report = OrganizationStatusReport.builder()
        .activitiesState(MockGenerator.getActivityState())
        .categoryStates(MockGenerator.getCategoriesStates())
        .organizationAnalysis(MockGenerator.getOrganizationAnalysis())
        .organizationProgressReports(MockGenerator.getProgressReports())
        .totalOrganizationProgress(MockGenerator.getTotalOrganizationProgress())
        .activitiesProgressAnalise(MockGenerator.getProgressAnalise())
        .build();

    log.info(new ObjectMapper().writeValueAsString(report));

    return report;
  }
}
