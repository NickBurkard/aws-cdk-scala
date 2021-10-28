package io.burkard.cdk.services.budgets

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ActionThresholdProperty {

  def apply(
    `type`: Option[String] = None,
    value: Option[Number] = None
  ): software.amazon.awscdk.services.budgets.CfnBudgetsAction.ActionThresholdProperty =
    (new software.amazon.awscdk.services.budgets.CfnBudgetsAction.ActionThresholdProperty.Builder)
      .`type`(`type`.orNull)
      .value(value.orNull)
      .build()
}
