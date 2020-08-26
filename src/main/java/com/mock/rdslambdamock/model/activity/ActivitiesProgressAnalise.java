package com.mock.rdslambdamock.model.activity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@JsonDeserialize(builder = ActivitiesProgressAnalise.ActivitiesProgressAnaliseBuilder.class)
public class ActivitiesProgressAnalise {

  private Progress perceptedProgress;

  private Progress actualProgress;


}
