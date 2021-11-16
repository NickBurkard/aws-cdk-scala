package io.burkard.cdk.services.budgets

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BudgetDataProperty {

  def apply(
    timeUnit: String,
    budgetType: String,
    budgetName: Option[String] = None,
    costTypes: Option[software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty] = None,
    budgetLimit: Option[software.amazon.awscdk.services.budgets.CfnBudget.SpendProperty] = None,
    timePeriod: Option[software.amazon.awscdk.services.budgets.CfnBudget.TimePeriodProperty] = None,
    costFilters: Option[AnyRef] = None,
    plannedBudgetLimits: Option[AnyRef] = None
  ): software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty =
    (new software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty.Builder)
      .timeUnit(timeUnit)
      .budgetType(budgetType)
      .budgetName(budgetName.orNull)
      .costTypes(costTypes.orNull)
      .budgetLimit(budgetLimit.orNull)
      .timePeriod(timePeriod.orNull)
      .costFilters(costFilters.orNull)
      .plannedBudgetLimits(plannedBudgetLimits.orNull)
      .build()
}
