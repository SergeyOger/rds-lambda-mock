package com.mock.rdslambdamock.model.activity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@JsonDeserialize(builder = Progress.ProgressBuilder.class)
public class Progress {

  private int positiveActivitiesCount;

  private int negativeActivitiesCount;

}
