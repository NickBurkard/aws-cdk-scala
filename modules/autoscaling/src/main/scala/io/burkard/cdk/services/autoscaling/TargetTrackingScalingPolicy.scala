package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TargetTrackingScalingPolicy {

  def apply(
    internalResourceId: String,
    customMetric: Option[software.amazon.awscdk.services.cloudwatch.IMetric] = None,
    disableScaleIn: Option[Boolean] = None,
    autoScalingGroup: Option[software.amazon.awscdk.services.autoscaling.IAutoScalingGroup] = None,
    estimatedInstanceWarmup: Option[software.amazon.awscdk.Duration] = None,
    resourceLabel: Option[String] = None,
    targetValue: Option[Number] = None,
    cooldown: Option[software.amazon.awscdk.Duration] = None,
    predefinedMetric: Option[software.amazon.awscdk.services.autoscaling.PredefinedMetric] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicy =
    software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicy.Builder
      .create(stackCtx, internalResourceId)
      .customMetric(customMetric.orNull)
      .disableScaleIn(disableScaleIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .autoScalingGroup(autoScalingGroup.orNull)
      .estimatedInstanceWarmup(estimatedInstanceWarmup.orNull)
      .resourceLabel(resourceLabel.orNull)
      .targetValue(targetValue.orNull)
      .cooldown(cooldown.orNull)
      .predefinedMetric(predefinedMetric.orNull)
      .build()
}
