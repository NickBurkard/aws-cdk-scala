package io.burkard.cdk.services.budgets

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TimePeriodProperty {

  def apply(
    end: Option[String] = None,
    start: Option[String] = None
  ): software.amazon.awscdk.services.budgets.CfnBudget.TimePeriodProperty =
    (new software.amazon.awscdk.services.budgets.CfnBudget.TimePeriodProperty.Builder)
      .end(end.orNull)
      .start(start.orNull)
      .build()
}
