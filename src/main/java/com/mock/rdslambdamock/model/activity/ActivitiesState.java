package com.mock.rdslambdamock.model.activity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
@JsonDeserialize(builder = ActivitiesState.ActivitiesStateBuilder.class)
public class ActivitiesState {

  private int progressiveActivitiesCount;

  private int completedActivitiesCount;

  private int inactiveActivitiesCount;

}
