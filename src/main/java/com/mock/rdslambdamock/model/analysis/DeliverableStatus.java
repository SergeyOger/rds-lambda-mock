package com.mock.rdslambdamock.model.analysis;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
@JsonDeserialize(builder = DeliverableStatus.DeliverableStatusBuilder.class)
public class DeliverableStatus {

  private int notHealthyDeliverable;

  private int mediumHealthyDeliverables;

  private int healthyDeliverables;

  private int notStartedDeliverables;

}
