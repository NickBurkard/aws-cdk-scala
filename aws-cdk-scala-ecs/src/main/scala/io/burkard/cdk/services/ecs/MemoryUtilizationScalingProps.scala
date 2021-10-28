package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MemoryUtilizationScalingProps {

  def apply(
    disableScaleIn: Option[Boolean] = None,
    policyName: Option[String] = None,
    scaleInCooldown: Option[software.amazon.awscdk.Duration] = None,
    targetUtilizationPercent: Option[Number] = None,
    scaleOutCooldown: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.ecs.MemoryUtilizationScalingProps =
    (new software.amazon.awscdk.services.ecs.MemoryUtilizationScalingProps.Builder)
      .disableScaleIn(disableScaleIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .policyName(policyName.orNull)
      .scaleInCooldown(scaleInCooldown.orNull)
      .targetUtilizationPercent(targetUtilizationPercent.orNull)
      .scaleOutCooldown(scaleOutCooldown.orNull)
      .build()
}
