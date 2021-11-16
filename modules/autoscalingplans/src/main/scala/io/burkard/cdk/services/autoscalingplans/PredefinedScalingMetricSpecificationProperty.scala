package io.burkard.cdk.services.autoscalingplans

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PredefinedScalingMetricSpecificationProperty {

  def apply(
    predefinedScalingMetricType: String,
    resourceLabel: Option[String] = None
  ): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedScalingMetricSpecificationProperty =
    (new software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedScalingMetricSpecificationProperty.Builder)
      .predefinedScalingMetricType(predefinedScalingMetricType)
      .resourceLabel(resourceLabel.orNull)
      .build()
}
