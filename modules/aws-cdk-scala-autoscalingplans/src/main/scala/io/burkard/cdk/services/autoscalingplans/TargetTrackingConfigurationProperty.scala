package io.burkard.cdk.services.autoscalingplans

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TargetTrackingConfigurationProperty {

  def apply(
    disableScaleIn: Option[Boolean] = None,
    predefinedScalingMetricSpecification: Option[software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedScalingMetricSpecificationProperty] = None,
    customizedScalingMetricSpecification: Option[software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedScalingMetricSpecificationProperty] = None,
    scaleOutCooldown: Option[Number] = None,
    estimatedInstanceWarmup: Option[Number] = None,
    scaleInCooldown: Option[Number] = None,
    targetValue: Option[Number] = None
  ): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty =
    (new software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty.Builder)
      .disableScaleIn(disableScaleIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .predefinedScalingMetricSpecification(predefinedScalingMetricSpecification.orNull)
      .customizedScalingMetricSpecification(customizedScalingMetricSpecification.orNull)
      .scaleOutCooldown(scaleOutCooldown.orNull)
      .estimatedInstanceWarmup(estimatedInstanceWarmup.orNull)
      .scaleInCooldown(scaleInCooldown.orNull)
      .targetValue(targetValue.orNull)
      .build()
}
