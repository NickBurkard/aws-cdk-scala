package io.burkard.cdk.services.autoscalingplans

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TargetTrackingConfigurationProperty {

  def apply(
    targetValue: Number,
    disableScaleIn: Option[Boolean] = None,
    predefinedScalingMetricSpecification: Option[software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedScalingMetricSpecificationProperty] = None,
    customizedScalingMetricSpecification: Option[software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedScalingMetricSpecificationProperty] = None,
    scaleOutCooldown: Option[Number] = None,
    estimatedInstanceWarmup: Option[Number] = None,
    scaleInCooldown: Option[Number] = None
  ): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty =
    (new software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty.Builder)
      .targetValue(targetValue)
      .disableScaleIn(disableScaleIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .predefinedScalingMetricSpecification(predefinedScalingMetricSpecification.orNull)
      .customizedScalingMetricSpecification(customizedScalingMetricSpecification.orNull)
      .scaleOutCooldown(scaleOutCooldown.orNull)
      .estimatedInstanceWarmup(estimatedInstanceWarmup.orNull)
      .scaleInCooldown(scaleInCooldown.orNull)
      .build()
}
