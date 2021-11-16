package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TargetTrackingConfigurationProperty {

  def apply(
    targetValue: Number
  ): software.amazon.awscdk.services.gamelift.CfnGameServerGroup.TargetTrackingConfigurationProperty =
    (new software.amazon.awscdk.services.gamelift.CfnGameServerGroup.TargetTrackingConfigurationProperty.Builder)
      .targetValue(targetValue)
      .build()
}
