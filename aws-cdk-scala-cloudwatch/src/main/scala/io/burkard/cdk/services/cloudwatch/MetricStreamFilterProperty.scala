package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MetricStreamFilterProperty {

  def apply(
    namespace: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamFilterProperty =
    (new software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamFilterProperty.Builder)
      .namespace(namespace.orNull)
      .build()
}
