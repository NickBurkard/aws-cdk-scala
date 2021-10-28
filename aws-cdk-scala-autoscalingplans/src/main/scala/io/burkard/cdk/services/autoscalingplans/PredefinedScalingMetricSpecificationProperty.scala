package io.burkard.cdk.services.autoscalingplans

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PredefinedScalingMetricSpecificationProperty {

  def apply(
    predefinedScalingMetricType: Option[String] = None,
    resourceLabel: Option[String] = None
  ): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedScalingMetricSpecificationProperty =
    (new software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedScalingMetricSpecificationProperty.Builder)
      .predefinedScalingMetricType(predefinedScalingMetricType.orNull)
      .resourceLabel(resourceLabel.orNull)
      .build()
}
