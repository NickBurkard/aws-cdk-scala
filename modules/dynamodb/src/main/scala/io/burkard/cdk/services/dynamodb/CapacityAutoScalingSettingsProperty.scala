package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CapacityAutoScalingSettingsProperty {

  def apply(
    maxCapacity: Option[Number] = None,
    minCapacity: Option[Number] = None,
    targetTrackingScalingPolicyConfiguration: Option[software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty] = None,
    seedCapacity: Option[Number] = None
  ): software.amazon.awscdk.services.dynamodb.CfnGlobalTable.CapacityAutoScalingSettingsProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnGlobalTable.CapacityAutoScalingSettingsProperty.Builder)
      .maxCapacity(maxCapacity.orNull)
      .minCapacity(minCapacity.orNull)
      .targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration.orNull)
      .seedCapacity(seedCapacity.orNull)
      .build()
}
