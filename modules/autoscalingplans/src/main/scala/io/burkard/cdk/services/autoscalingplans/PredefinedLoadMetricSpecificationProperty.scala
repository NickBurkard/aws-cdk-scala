package io.burkard.cdk.services.autoscalingplans

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PredefinedLoadMetricSpecificationProperty {

  def apply(
    predefinedLoadMetricType: Option[String] = None,
    resourceLabel: Option[String] = None
  ): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedLoadMetricSpecificationProperty =
    (new software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedLoadMetricSpecificationProperty.Builder)
      .predefinedLoadMetricType(predefinedLoadMetricType.orNull)
      .resourceLabel(resourceLabel.orNull)
      .build()
}
