package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RequestCountScalingProps {

  def apply(
    disableScaleIn: Option[Boolean] = None,
    cooldown: Option[software.amazon.awscdk.Duration] = None,
    estimatedInstanceWarmup: Option[software.amazon.awscdk.Duration] = None,
    targetRequestsPerMinute: Option[Number] = None
  ): software.amazon.awscdk.services.autoscaling.RequestCountScalingProps =
    (new software.amazon.awscdk.services.autoscaling.RequestCountScalingProps.Builder)
      .disableScaleIn(disableScaleIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cooldown(cooldown.orNull)
      .estimatedInstanceWarmup(estimatedInstanceWarmup.orNull)
      .targetRequestsPerMinute(targetRequestsPerMinute.orNull)
      .build()
}
