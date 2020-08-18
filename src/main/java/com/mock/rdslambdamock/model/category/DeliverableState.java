package com.mock.rdslambdamock.model.category;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
@JsonDeserialize(builder = DeliverableState.DeliverableStateBuilder.class)
public class DeliverableState {

  private String deliverableTitle;

  private double deliverableHealth;

  private double actualDeliverableProgress;

  private double planedDeliverableProgress;

  private double variance;

}
