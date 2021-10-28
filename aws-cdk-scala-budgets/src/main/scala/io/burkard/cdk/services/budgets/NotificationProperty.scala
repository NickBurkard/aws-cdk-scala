package io.burkard.cdk.services.budgets

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NotificationProperty {

  def apply(
    thresholdType: Option[String] = None,
    comparisonOperator: Option[String] = None,
    notificationType: Option[String] = None,
    threshold: Option[Number] = None
  ): software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty =
    (new software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty.Builder)
      .thresholdType(thresholdType.orNull)
      .comparisonOperator(comparisonOperator.orNull)
      .notificationType(notificationType.orNull)
      .threshold(threshold.orNull)
      .build()
}
