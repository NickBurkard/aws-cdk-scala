package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricStreamFilterProperty {

  def apply(
    namespace: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamFilterProperty =
    (new software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamFilterProperty.Builder)
      .namespace(namespace.orNull)
      .build()
}
