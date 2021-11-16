package io.burkard.cdk.services.applicationautoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TargetTrackingScalingPolicyConfigurationProperty {

  def apply(
    targetValue: Number,
    disableScaleIn: Option[Boolean] = None,
    customizedMetricSpecification: Option[software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty] = None,
    scaleOutCooldown: Option[Number] = None,
    scaleInCooldown: Option[Number] = None,
    predefinedMetricSpecification: Option[software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty] = None
  ): software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty =
    (new software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.Builder)
      .targetValue(targetValue)
      .disableScaleIn(disableScaleIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .customizedMetricSpecification(customizedMetricSpecification.orNull)
      .scaleOutCooldown(scaleOutCooldown.orNull)
      .scaleInCooldown(scaleInCooldown.orNull)
      .predefinedMetricSpecification(predefinedMetricSpecification.orNull)
      .build()
}
