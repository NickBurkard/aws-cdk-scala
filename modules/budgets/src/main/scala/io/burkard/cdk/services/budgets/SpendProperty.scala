package io.burkard.cdk.services.budgets

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SpendProperty {

  def apply(
    amount: Number,
    unit: String
  ): software.amazon.awscdk.services.budgets.CfnBudget.SpendProperty =
    (new software.amazon.awscdk.services.budgets.CfnBudget.SpendProperty.Builder)
      .amount(amount)
      .unit(unit)
      .build()
}
