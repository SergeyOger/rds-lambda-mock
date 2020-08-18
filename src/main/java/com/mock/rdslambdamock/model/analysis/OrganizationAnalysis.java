package com.mock.rdslambdamock.model.analysis;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
@JsonDeserialize(builder = OrganizationAnalysis.OrganizationAnalysisBuilder.class)
public class OrganizationAnalysis {

  private CategoryStatus categoryStatus;

  private DeliverableStatus deliverableStatus;

}
