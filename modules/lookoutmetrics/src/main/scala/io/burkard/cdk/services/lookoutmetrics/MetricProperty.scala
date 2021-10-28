package io.burkard.cdk.services.lookoutmetrics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MetricProperty {

  def apply(
    metricName: Option[String] = None,
    aggregationFunction: Option[String] = None,
    namespace: Option[String] = None
  ): software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricProperty =
    (new software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricProperty.Builder)
      .metricName(metricName.orNull)
      .aggregationFunction(aggregationFunction.orNull)
      .namespace(namespace.orNull)
      .build()
}
