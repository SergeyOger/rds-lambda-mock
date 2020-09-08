package com.mock.rdslambdamock.mock;

import com.mock.rdslambdamock.model.activity.ActivitiesProgressAnalise;
import com.mock.rdslambdamock.model.activity.ActivitiesState;
import com.mock.rdslambdamock.model.activity.Progress;
import com.mock.rdslambdamock.model.analysis.CategoryStatus;
import com.mock.rdslambdamock.model.analysis.DeliverableStatus;
import com.mock.rdslambdamock.model.analysis.OrganizationAnalysis;
import com.mock.rdslambdamock.model.category.CategoryState;
import com.mock.rdslambdamock.model.category.CategoryStateProgress;
import com.mock.rdslambdamock.model.category.DeliverableState;
import com.mock.rdslambdamock.model.category.OrganizationTotalProgress;
import com.mock.rdslambdamock.model.progress.TotalOrganizationProgress;
import com.mock.rdslambdamock.model.progress.WeeklyOrganizationActualProgress;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class MockGenerator {

  private static final Random RANDOM = new Random();

  private static final LocalDate CURRENT_DATE = LocalDate.now();

  public static ActivitiesState getActivityState() {
    return ActivitiesState.builder()
        .completedInTimeActivitiesCount(getRandomInt())
        .completedOverDueActivitiesCount(getRandomInt())
        .inactiveActivitiesCount(getRandomInt())
        .progressiveActivitiesCount(getRandomInt()).build();
  }

  public static CategoryStateProgress getCategoryStateProgress() {
    return CategoryStateProgress.builder()
        .categoryStates(getCategoriesStates())
        .organizationTotalProgress(getOrganizationTotalProgress()).build();
  }

  private static OrganizationTotalProgress getOrganizationTotalProgress() {
    return OrganizationTotalProgress.builder()
        .totalActualProgress(getRandomDouble())
        .totalCategoryHealth(getRandomDouble())
        .totalPlanedProgress(getRandomDouble())
        .totalVariance(getRandomDouble())
        .build();
  }

  private static List<CategoryState> getCategoriesStates() {

    CategoryState categoryStateForLaboratory = CategoryState.builder()
        .actualProgress(30)
        .categoryHealth(3.2)
        .categoryTitle("Laboratory")
        .planedProgress(100.00)
        .variance(70)
        .deliverableStates(getDeliverableStates("Laboratory"))
        .build();

    CategoryState categoryStateForLearning = CategoryState.builder()
        .actualProgress(40)
        .categoryHealth(5.2)
        .categoryTitle("Learning")
        .planedProgress(100.00)
        .variance(60)
        .deliverableStates(getDeliverableStates("Learning"))
        .build();

    CategoryState categoryStateForLearning1 = CategoryState.builder()
        .actualProgress(40)
        .categoryHealth(5.2)
        .categoryTitle("Learning")
        .planedProgress(100.00)
        .variance(60)
        .deliverableStates(getDeliverableStates("Learning"))
        .build();

    CategoryState categoryStateForLearning2 = CategoryState.builder()
        .actualProgress(40)
        .categoryHealth(5.2)
        .categoryTitle("Learning")
        .planedProgress(100.00)
        .variance(60)
        .deliverableStates(getDeliverableStates("Learning"))
        .build();

    CategoryState categoryStateForLearning3 = CategoryState.builder()
        .actualProgress(40)
        .categoryHealth(5.2)
        .categoryTitle("Learning")
        .planedProgress(100.00)
        .variance(60)
        .deliverableStates(getDeliverableStates("Learning"))
        .build();
    return Arrays
        .asList(categoryStateForLaboratory, categoryStateForLearning, categoryStateForLearning1,
            categoryStateForLearning2, categoryStateForLearning3);
  }

  public static OrganizationAnalysis getOrganizationAnalysis() {
    CategoryStatus categoryStatus = CategoryStatus.builder()
        .healthyCategories(getRandomInt())
        .mediumHealthyCategories(getRandomInt())
        .notHealthyCategories(getRandomInt()).build();

    DeliverableStatus deliverableStatus = DeliverableStatus.builder()
        .healthyDeliverables(getRandomInt())
        .mediumHealthyDeliverables(getRandomInt())
        .notHealthyDeliverable(getRandomInt())
        .notStartedDeliverables(getRandomInt()).build();

    return OrganizationAnalysis.builder()
        .categoryStatus(categoryStatus)
        .deliverableStatus(deliverableStatus).build();
  }

  public static Map<LocalDate, WeeklyOrganizationActualProgress> getProgressReports() {
    Map<LocalDate, WeeklyOrganizationActualProgress> reports = new TreeMap<>();
    for (int i = 3; i >= 0; i--) {
      WeeklyOrganizationActualProgress progress = WeeklyOrganizationActualProgress.builder()
          .complectedDeliverableCount(getRandomInt())
          .completedActivities(getRandomInt())
          .health(getRandomDouble())
          .readiness(getRandomDouble())
          .runOut(getRandomInt())
          .build();
      reports.put(CURRENT_DATE.minusWeeks(i), progress);
    }
    return reports;
  }

  public static TotalOrganizationProgress getTotalOrganizationProgress() {
    Map<LocalDate, Double> planedProgress = new TreeMap<>();
    Map<LocalDate, Double> actualProgress = new TreeMap<>();

    double actualProgressPoints = 0.0;
    double planedProgressPoints = 0.0;

    for (int i = 14; i >= -6; i--) {

      planedProgress.put(CURRENT_DATE.minusMonths(i), planedProgressPoints);
      planedProgressPoints += getRandomInt(1, 5);
      if (i >= 0) {
        actualProgress.put(CURRENT_DATE.minusMonths(i), actualProgressPoints);
        actualProgressPoints += getRandomInt(1, 6);
      }
    }

    return TotalOrganizationProgress.builder()
        .planedProgressPoints(planedProgress)
        .actualProgressPoints(actualProgress).build();
  }

  public static ActivitiesProgressAnalise getProgressAnalise() {

    return ActivitiesProgressAnalise.builder()
        .actualProgress(Progress.builder().negativeActivitiesCount(getRandomInt())
            .positiveActivitiesCount(getRandomInt()).build())
        .perceptedProgress(Progress.builder().negativeActivitiesCount(getRandomInt())
            .positiveActivitiesCount(getRandomInt()).build())
        .build();
  }

  private static List<DeliverableState> getDeliverableStates(String title) {

    List<DeliverableState> deliverableStates = new ArrayList<>();

    for (int i = 0; i < 6; i++) {
      DeliverableState deliverableState = DeliverableState.builder()
          .deliverableTitle(title + i)
          .actualDeliverableProgress(getRandomDouble())
          .deliverableHealth(getRandomDouble())
          .planedDeliverableProgress(getRandomDouble())
          .variance(getRandomDouble())
          .build();
      deliverableStates.add(deliverableState);
    }
    return deliverableStates;
  }

  private static int getRandomInt() {
    int min = 2;
    int max = 40;
    return RANDOM.nextInt((max - min) + 1) + min;
  }

  private static int getRandomInt(int min, int max) {
    return RANDOM.nextInt((max - min) + 1) + min;
  }

  private static double getRandomDouble() {
    double min = 2;
    double max = 40;
    return Math.round((min + (max - min) * RANDOM.nextDouble()) * 100.0) / 100.0;
  }
}
