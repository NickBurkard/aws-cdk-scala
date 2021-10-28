package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UtilizationScalingProps {

  def apply(
    disableScaleIn: Option[Boolean] = None,
    policyName: Option[String] = None,
    scaleInCooldown: Option[software.amazon.awscdk.Duration] = None,
    targetUtilizationPercent: Option[Number] = None,
    scaleOutCooldown: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.dynamodb.UtilizationScalingProps =
    (new software.amazon.awscdk.services.dynamodb.UtilizationScalingProps.Builder)
      .disableScaleIn(disableScaleIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .policyName(policyName.orNull)
      .scaleInCooldown(scaleInCooldown.orNull)
      .targetUtilizationPercent(targetUtilizationPercent.orNull)
      .scaleOutCooldown(scaleOutCooldown.orNull)
      .build()
}
