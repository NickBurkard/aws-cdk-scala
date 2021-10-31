package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BehaviorProperty {

  def apply(
    suppressAlerts: Option[Boolean] = None,
    name: Option[String] = None,
    criteria: Option[software.amazon.awscdk.services.iot.CfnSecurityProfile.BehaviorCriteriaProperty] = None,
    metric: Option[String] = None,
    metricDimension: Option[software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricDimensionProperty] = None
  ): software.amazon.awscdk.services.iot.CfnSecurityProfile.BehaviorProperty =
    (new software.amazon.awscdk.services.iot.CfnSecurityProfile.BehaviorProperty.Builder)
      .suppressAlerts(suppressAlerts.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .name(name.orNull)
      .criteria(criteria.orNull)
      .metric(metric.orNull)
      .metricDimension(metricDimension.orNull)
      .build()
}
