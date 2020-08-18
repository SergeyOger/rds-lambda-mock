package com.mock.rdslambdamock.model.category;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
@JsonDeserialize(builder = CategoryState.CategoryStateBuilder.class)
public class CategoryState {

  private String categoryTitle;

  private double categoryHealth;

  private double actualProgress;

  private double planedProgress;

  private double variance;

  private List<DeliverableState> deliverableStates;

}
