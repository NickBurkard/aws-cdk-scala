package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RequestCountScalingProps {

  def apply(
    disableScaleIn: Option[Boolean] = None,
    policyName: Option[String] = None,
    scaleOutCooldown: Option[software.amazon.awscdk.Duration] = None,
    scaleInCooldown: Option[software.amazon.awscdk.Duration] = None,
    requestsPerTarget: Option[Number] = None,
    targetGroup: Option[software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup] = None
  ): software.amazon.awscdk.services.ecs.RequestCountScalingProps =
    (new software.amazon.awscdk.services.ecs.RequestCountScalingProps.Builder)
      .disableScaleIn(disableScaleIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .policyName(policyName.orNull)
      .scaleOutCooldown(scaleOutCooldown.orNull)
      .scaleInCooldown(scaleInCooldown.orNull)
      .requestsPerTarget(requestsPerTarget.orNull)
      .targetGroup(targetGroup.orNull)
      .build()
}
