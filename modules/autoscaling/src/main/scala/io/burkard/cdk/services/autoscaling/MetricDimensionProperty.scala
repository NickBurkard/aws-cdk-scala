package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricDimensionProperty {

  def apply(
    name: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDimensionProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDimensionProperty.Builder)
      .name(name.orNull)
      .value(value.orNull)
      .build()
}
