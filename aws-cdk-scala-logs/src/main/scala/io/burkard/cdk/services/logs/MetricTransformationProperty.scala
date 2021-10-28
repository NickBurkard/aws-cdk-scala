package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MetricTransformationProperty {

  def apply(
    metricName: Option[String] = None,
    metricNamespace: Option[String] = None,
    metricValue: Option[String] = None,
    defaultValue: Option[Number] = None
  ): software.amazon.awscdk.services.logs.CfnMetricFilter.MetricTransformationProperty =
    (new software.amazon.awscdk.services.logs.CfnMetricFilter.MetricTransformationProperty.Builder)
      .metricName(metricName.orNull)
      .metricNamespace(metricNamespace.orNull)
      .metricValue(metricValue.orNull)
      .defaultValue(defaultValue.orNull)
      .build()
}
