package io.burkard.cdk.services.budgets

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BudgetDataProperty {

  def apply(
    budgetName: Option[String] = None,
    costTypes: Option[software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty] = None,
    budgetLimit: Option[software.amazon.awscdk.services.budgets.CfnBudget.SpendProperty] = None,
    timePeriod: Option[software.amazon.awscdk.services.budgets.CfnBudget.TimePeriodProperty] = None,
    costFilters: Option[AnyRef] = None,
    plannedBudgetLimits: Option[AnyRef] = None,
    timeUnit: Option[String] = None,
    budgetType: Option[String] = None
  ): software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty =
    (new software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty.Builder)
      .budgetName(budgetName.orNull)
      .costTypes(costTypes.orNull)
      .budgetLimit(budgetLimit.orNull)
      .timePeriod(timePeriod.orNull)
      .costFilters(costFilters.orNull)
      .plannedBudgetLimits(plannedBudgetLimits.orNull)
      .timeUnit(timeUnit.orNull)
      .budgetType(budgetType.orNull)
      .build()
}
