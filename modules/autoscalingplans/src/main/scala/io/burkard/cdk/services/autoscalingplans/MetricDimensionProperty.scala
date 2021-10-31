package io.burkard.cdk.services.autoscalingplans

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricDimensionProperty {

  def apply(
    name: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.MetricDimensionProperty =
    (new software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.MetricDimensionProperty.Builder)
      .name(name.orNull)
      .value(value.orNull)
      .build()
}
