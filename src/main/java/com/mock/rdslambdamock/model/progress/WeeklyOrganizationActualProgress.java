package com.mock.rdslambdamock.model.progress;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
@JsonDeserialize(builder = WeeklyOrganizationActualProgress.WeeklyOrganizationActualProgressBuilder.class)
public class WeeklyOrganizationActualProgress {

  private double readiness;

  private double health;

  private int completedActivities;

  private int complectedDeliverableCount;

  private double variance;

}
