package com.mock.rdslambdamock.model.category;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
@JsonDeserialize(builder = CategoryStateProgress.CategoryStateProgressBuilder.class)
public class CategoryStateProgress {

  private OrganizationTotalProgress organizationTotalProgress;

  private List<CategoryState> categoryStates;

}
