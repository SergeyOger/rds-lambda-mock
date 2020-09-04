package com.mock.rdslambdamock.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mock.rdslambdamock.model.activity.ActivitiesState;
import com.mock.rdslambdamock.model.activity.ActivitiesProgressAnalise;
import com.mock.rdslambdamock.model.analysis.OrganizationAnalysis;
import com.mock.rdslambdamock.model.category.CategoryState;
import com.mock.rdslambdamock.model.category.CategoryStateProgress;
import com.mock.rdslambdamock.model.category.OrganizationTotalProgress;
import com.mock.rdslambdamock.model.progress.TotalOrganizationProgress;
import com.mock.rdslambdamock.model.progress.WeeklyOrganizationActualProgress;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@JsonDeserialize(builder = OrganizationStatusReport.OrganizationStatusReportBuilder.class)
public class OrganizationStatusReport {

  private Map<LocalDate, WeeklyOrganizationActualProgress> organizationProgressReports;

  private OrganizationAnalysis organizationAnalysis;

  private TotalOrganizationProgress totalOrganizationProgress;

  private CategoryStateProgress categoryStateProgress;

  private ActivitiesState activitiesState;

  private ActivitiesProgressAnalise activitiesProgressAnalise;

}
