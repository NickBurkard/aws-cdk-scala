package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CpuUtilizationScalingProps {

  def apply(
    targetUtilizationPercent: Number,
    disableScaleIn: Option[Boolean] = None,
    cooldown: Option[software.amazon.awscdk.Duration] = None,
    estimatedInstanceWarmup: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.autoscaling.CpuUtilizationScalingProps =
    (new software.amazon.awscdk.services.autoscaling.CpuUtilizationScalingProps.Builder)
      .targetUtilizationPercent(targetUtilizationPercent)
      .disableScaleIn(disableScaleIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cooldown(cooldown.orNull)
      .estimatedInstanceWarmup(estimatedInstanceWarmup.orNull)
      .build()
}
