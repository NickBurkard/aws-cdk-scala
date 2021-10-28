package io.burkard.cdk.services.budgets

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SpendProperty {

  def apply(
    amount: Option[Number] = None,
    unit: Option[String] = None
  ): software.amazon.awscdk.services.budgets.CfnBudget.SpendProperty =
    (new software.amazon.awscdk.services.budgets.CfnBudget.SpendProperty.Builder)
      .amount(amount.orNull)
      .unit(unit.orNull)
      .build()
}
