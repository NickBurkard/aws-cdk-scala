package io.burkard.cdk.services.applicationautoscaling

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TargetTrackingScalingPolicyConfigurationProperty {

  def apply(
    disableScaleIn: Option[Boolean] = None,
    customizedMetricSpecification: Option[software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty] = None,
    scaleOutCooldown: Option[Number] = None,
    scaleInCooldown: Option[Number] = None,
    targetValue: Option[Number] = None,
    predefinedMetricSpecification: Option[software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty] = None
  ): software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty =
    (new software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.Builder)
      .disableScaleIn(disableScaleIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .customizedMetricSpecification(customizedMetricSpecification.orNull)
      .scaleOutCooldown(scaleOutCooldown.orNull)
      .scaleInCooldown(scaleInCooldown.orNull)
      .targetValue(targetValue.orNull)
      .predefinedMetricSpecification(predefinedMetricSpecification.orNull)
      .build()
}
