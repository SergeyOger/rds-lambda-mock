package com.mock.rdslambdamock.controller;

import com.mock.rdslambdamock.mock.MockGenerator;
import com.mock.rdslambdamock.model.OrganizationStatusReport;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/organization")
public class DashboardController {

  @GetMapping("/{id}")
  public OrganizationStatusReport getOrganizationReport(@PathVariable String id) {

    return OrganizationStatusReport.builder()
        .activitiesState(MockGenerator.getActivityState())
        .categoryStates(MockGenerator.getCategoriesStates())
        .organizationAnalysis(MockGenerator.getOrganizationAnalysis())
        .organizationProgressReports(MockGenerator.getProgressReports())
        .totalOrganizationProgress(MockGenerator.getTotalOrganizationProgress())
        .build();
  }
}
