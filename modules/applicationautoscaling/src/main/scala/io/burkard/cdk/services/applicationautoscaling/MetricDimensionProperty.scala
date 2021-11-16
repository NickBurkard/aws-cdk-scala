package io.burkard.cdk.services.applicationautoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricDimensionProperty {

  def apply(
    name: String,
    value: String
  ): software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.MetricDimensionProperty =
    (new software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.MetricDimensionProperty.Builder)
      .name(name)
      .value(value)
      .build()
}
