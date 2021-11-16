package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricTransformationProperty {

  def apply(
    metricName: String,
    metricNamespace: String,
    metricValue: String,
    defaultValue: Option[Number] = None
  ): software.amazon.awscdk.services.logs.CfnMetricFilter.MetricTransformationProperty =
    (new software.amazon.awscdk.services.logs.CfnMetricFilter.MetricTransformationProperty.Builder)
      .metricName(metricName)
      .metricNamespace(metricNamespace)
      .metricValue(metricValue)
      .defaultValue(defaultValue.orNull)
      .build()
}
