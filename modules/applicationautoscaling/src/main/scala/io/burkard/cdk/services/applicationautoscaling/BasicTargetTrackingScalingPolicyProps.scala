package io.burkard.cdk.services.applicationautoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BasicTargetTrackingScalingPolicyProps {

  def apply(
    customMetric: Option[software.amazon.awscdk.services.cloudwatch.IMetric] = None,
    disableScaleIn: Option[Boolean] = None,
    policyName: Option[String] = None,
    scaleOutCooldown: Option[software.amazon.awscdk.Duration] = None,
    predefinedMetric: Option[software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric] = None,
    resourceLabel: Option[String] = None,
    scaleInCooldown: Option[software.amazon.awscdk.Duration] = None,
    targetValue: Option[Number] = None
  ): software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps =
    (new software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps.Builder)
      .customMetric(customMetric.orNull)
      .disableScaleIn(disableScaleIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .policyName(policyName.orNull)
      .scaleOutCooldown(scaleOutCooldown.orNull)
      .predefinedMetric(predefinedMetric.orNull)
      .resourceLabel(resourceLabel.orNull)
      .scaleInCooldown(scaleInCooldown.orNull)
      .targetValue(targetValue.orNull)
      .build()
}
