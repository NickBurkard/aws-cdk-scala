package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricToRetainProperty {

  def apply(
    metric: Option[String] = None,
    metricDimension: Option[software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricDimensionProperty] = None
  ): software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricToRetainProperty =
    (new software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricToRetainProperty.Builder)
      .metric(metric.orNull)
      .metricDimension(metricDimension.orNull)
      .build()
}
