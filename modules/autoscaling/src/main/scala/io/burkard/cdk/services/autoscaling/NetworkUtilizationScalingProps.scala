package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NetworkUtilizationScalingProps {

  def apply(
    targetBytesPerSecond: Number,
    disableScaleIn: Option[Boolean] = None,
    cooldown: Option[software.amazon.awscdk.Duration] = None,
    estimatedInstanceWarmup: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.autoscaling.NetworkUtilizationScalingProps =
    (new software.amazon.awscdk.services.autoscaling.NetworkUtilizationScalingProps.Builder)
      .targetBytesPerSecond(targetBytesPerSecond)
      .disableScaleIn(disableScaleIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cooldown(cooldown.orNull)
      .estimatedInstanceWarmup(estimatedInstanceWarmup.orNull)
      .build()
}
