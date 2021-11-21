package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScalingTriggerProperty {

  def apply(
    cloudWatchAlarmDefinition: software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty
  ): software.amazon.awscdk.services.emr.CfnCluster.ScalingTriggerProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.ScalingTriggerProperty.Builder)
      .cloudWatchAlarmDefinition(cloudWatchAlarmDefinition)
      .build()
}
