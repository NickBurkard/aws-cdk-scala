package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MemoryUtilizationScalingProps {

  def apply(
    targetUtilizationPercent: Number,
    disableScaleIn: Option[Boolean] = None,
    policyName: Option[String] = None,
    scaleInCooldown: Option[software.amazon.awscdk.Duration] = None,
    scaleOutCooldown: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.ecs.MemoryUtilizationScalingProps =
    (new software.amazon.awscdk.services.ecs.MemoryUtilizationScalingProps.Builder)
      .targetUtilizationPercent(targetUtilizationPercent)
      .disableScaleIn(disableScaleIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .policyName(policyName.orNull)
      .scaleInCooldown(scaleInCooldown.orNull)
      .scaleOutCooldown(scaleOutCooldown.orNull)
      .build()
}
