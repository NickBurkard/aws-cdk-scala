package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricDataQueryProperty {

  def apply(
    label: Option[String] = None,
    accountId: Option[String] = None,
    returnData: Option[Boolean] = None,
    metricStat: Option[software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricStatProperty] = None,
    id: Option[String] = None,
    expression: Option[String] = None,
    period: Option[Number] = None
  ): software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricDataQueryProperty =
    (new software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricDataQueryProperty.Builder)
      .label(label.orNull)
      .accountId(accountId.orNull)
      .returnData(returnData.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .metricStat(metricStat.orNull)
      .id(id.orNull)
      .expression(expression.orNull)
      .period(period.orNull)
      .build()
}
