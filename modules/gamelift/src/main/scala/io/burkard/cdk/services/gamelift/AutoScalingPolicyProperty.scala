package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AutoScalingPolicyProperty {

  def apply(
    targetTrackingConfiguration: software.amazon.awscdk.services.gamelift.CfnGameServerGroup.TargetTrackingConfigurationProperty,
    estimatedInstanceWarmup: Option[Number] = None
  ): software.amazon.awscdk.services.gamelift.CfnGameServerGroup.AutoScalingPolicyProperty =
    (new software.amazon.awscdk.services.gamelift.CfnGameServerGroup.AutoScalingPolicyProperty.Builder)
      .targetTrackingConfiguration(targetTrackingConfiguration)
      .estimatedInstanceWarmup(estimatedInstanceWarmup.orNull)
      .build()
}
