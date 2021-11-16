package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RequestCountScalingProps {

  def apply(
    requestsPerTarget: Number,
    targetGroup: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup,
    disableScaleIn: Option[Boolean] = None,
    policyName: Option[String] = None,
    scaleOutCooldown: Option[software.amazon.awscdk.Duration] = None,
    scaleInCooldown: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.ecs.RequestCountScalingProps =
    (new software.amazon.awscdk.services.ecs.RequestCountScalingProps.Builder)
      .requestsPerTarget(requestsPerTarget)
      .targetGroup(targetGroup)
      .disableScaleIn(disableScaleIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .policyName(policyName.orNull)
      .scaleOutCooldown(scaleOutCooldown.orNull)
      .scaleInCooldown(scaleInCooldown.orNull)
      .build()
}
