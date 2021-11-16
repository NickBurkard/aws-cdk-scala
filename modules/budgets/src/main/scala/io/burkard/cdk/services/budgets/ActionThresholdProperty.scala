package io.burkard.cdk.services.budgets

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ActionThresholdProperty {

  def apply(
    `type`: String,
    value: Number
  ): software.amazon.awscdk.services.budgets.CfnBudgetsAction.ActionThresholdProperty =
    (new software.amazon.awscdk.services.budgets.CfnBudgetsAction.ActionThresholdProperty.Builder)
      .`type`(`type`)
      .value(value)
      .build()
}
