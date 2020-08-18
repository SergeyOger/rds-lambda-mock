package com.mock.rdslambdamock.model.analysis;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
@JsonDeserialize(builder = CategoryStatus.CategoryStatusBuilder.class)
public class CategoryStatus {

  private int notHealthyCategories;

  private int mediumHealthyCategories;

  private int healthyCategories;

}
