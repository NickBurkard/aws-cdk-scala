package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BasicTargetTrackingScalingPolicyProps {

  def apply(
    customMetric: Option[software.amazon.awscdk.services.cloudwatch.IMetric] = None,
    disableScaleIn: Option[Boolean] = None,
    estimatedInstanceWarmup: Option[software.amazon.awscdk.Duration] = None,
    resourceLabel: Option[String] = None,
    targetValue: Option[Number] = None,
    cooldown: Option[software.amazon.awscdk.Duration] = None,
    predefinedMetric: Option[software.amazon.awscdk.services.autoscaling.PredefinedMetric] = None
  ): software.amazon.awscdk.services.autoscaling.BasicTargetTrackingScalingPolicyProps =
    (new software.amazon.awscdk.services.autoscaling.BasicTargetTrackingScalingPolicyProps.Builder)
      .customMetric(customMetric.orNull)
      .disableScaleIn(disableScaleIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .estimatedInstanceWarmup(estimatedInstanceWarmup.orNull)
      .resourceLabel(resourceLabel.orNull)
      .targetValue(targetValue.orNull)
      .cooldown(cooldown.orNull)
      .predefinedMetric(predefinedMetric.orNull)
      .build()
}
