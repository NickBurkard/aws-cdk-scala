package io.burkard.cdk.services.budgets

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NotificationProperty {

  def apply(
    comparisonOperator: String,
    notificationType: String,
    threshold: Number,
    thresholdType: Option[String] = None
  ): software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty =
    (new software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty.Builder)
      .comparisonOperator(comparisonOperator)
      .notificationType(notificationType)
      .threshold(threshold)
      .thresholdType(thresholdType.orNull)
      .build()
}
