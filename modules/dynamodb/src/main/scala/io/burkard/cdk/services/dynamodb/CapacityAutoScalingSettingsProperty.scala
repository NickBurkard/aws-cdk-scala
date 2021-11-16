package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CapacityAutoScalingSettingsProperty {

  def apply(
    maxCapacity: Number,
    minCapacity: Number,
    targetTrackingScalingPolicyConfiguration: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty,
    seedCapacity: Option[Number] = None
  ): software.amazon.awscdk.services.dynamodb.CfnGlobalTable.CapacityAutoScalingSettingsProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnGlobalTable.CapacityAutoScalingSettingsProperty.Builder)
      .maxCapacity(maxCapacity)
      .minCapacity(minCapacity)
      .targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration)
      .seedCapacity(seedCapacity.orNull)
      .build()
}
