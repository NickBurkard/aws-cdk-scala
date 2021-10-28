package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MetricStatProperty {

  def apply(
    stat: Option[String] = None,
    metric: Option[software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricProperty] = None,
    unit: Option[String] = None,
    period: Option[Number] = None
  ): software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricStatProperty =
    (new software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricStatProperty.Builder)
      .stat(stat.orNull)
      .metric(metric.orNull)
      .unit(unit.orNull)
      .period(period.orNull)
      .build()
}
