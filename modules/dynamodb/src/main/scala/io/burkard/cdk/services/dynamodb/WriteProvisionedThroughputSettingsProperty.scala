package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object WriteProvisionedThroughputSettingsProperty {

  def apply(
    writeCapacityAutoScalingSettings: Option[software.amazon.awscdk.services.dynamodb.CfnGlobalTable.CapacityAutoScalingSettingsProperty] = None
  ): software.amazon.awscdk.services.dynamodb.CfnGlobalTable.WriteProvisionedThroughputSettingsProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnGlobalTable.WriteProvisionedThroughputSettingsProperty.Builder)
      .writeCapacityAutoScalingSettings(writeCapacityAutoScalingSettings.orNull)
      .build()
}
