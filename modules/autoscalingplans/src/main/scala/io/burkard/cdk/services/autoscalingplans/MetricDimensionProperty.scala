package io.burkard.cdk.services.autoscalingplans

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricDimensionProperty {

  def apply(
    name: String,
    value: String
  ): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.MetricDimensionProperty =
    (new software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.MetricDimensionProperty.Builder)
      .name(name)
      .value(value)
      .build()
}
