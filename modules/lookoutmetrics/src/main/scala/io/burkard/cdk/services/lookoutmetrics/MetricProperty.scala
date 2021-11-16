package io.burkard.cdk.services.lookoutmetrics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricProperty {

  def apply(
    metricName: String,
    aggregationFunction: String,
    namespace: Option[String] = None
  ): software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricProperty =
    (new software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricProperty.Builder)
      .metricName(metricName)
      .aggregationFunction(aggregationFunction)
      .namespace(namespace.orNull)
      .build()
}
