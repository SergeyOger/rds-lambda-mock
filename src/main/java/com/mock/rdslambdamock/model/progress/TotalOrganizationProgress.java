package com.mock.rdslambdamock.model.progress;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.LocalDate;
import java.util.Map;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
@JsonDeserialize(builder = TotalOrganizationProgress.TotalOrganizationProgressBuilder.class)
public class TotalOrganizationProgress {

  private Map<LocalDate, Double> actualProgressPoints;

  private Map<LocalDate, Double> planedProgressPoints;

}
