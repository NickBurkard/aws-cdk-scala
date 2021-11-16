package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricStatProperty {

  def apply(
    stat: String,
    metric: software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricProperty,
    period: Number,
    unit: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricStatProperty =
    (new software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricStatProperty.Builder)
      .stat(stat)
      .metric(metric)
      .period(period)
      .unit(unit.orNull)
      .build()
}
