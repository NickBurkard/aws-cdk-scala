package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TargetTrackingScalingPolicyConfigurationProperty {

  def apply(
    targetValue: Number,
    disableScaleIn: Option[Boolean] = None,
    scaleOutCooldown: Option[Number] = None,
    scaleInCooldown: Option[Number] = None
  ): software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty.Builder)
      .targetValue(targetValue)
      .disableScaleIn(disableScaleIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .scaleOutCooldown(scaleOutCooldown.orNull)
      .scaleInCooldown(scaleInCooldown.orNull)
      .build()
}
