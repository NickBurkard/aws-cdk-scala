package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricDimensionProperty {

  def apply(
    name: String,
    value: String
  ): software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDimensionProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDimensionProperty.Builder)
      .name(name)
      .value(value)
      .build()
}
