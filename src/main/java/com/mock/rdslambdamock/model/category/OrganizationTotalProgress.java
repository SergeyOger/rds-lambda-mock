package com.mock.rdslambdamock.model.category;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
@JsonDeserialize(builder = CategoryStateProgress.CategoryStateProgressBuilder.class)
public class OrganizationTotalProgress {

  private double totalCategoryHealth;

  private double totalActualProgress;

  private double totalPlanedProgress;

  private double totalVariance;

}
