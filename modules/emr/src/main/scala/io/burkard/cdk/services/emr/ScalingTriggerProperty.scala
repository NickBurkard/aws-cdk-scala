package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScalingTriggerProperty {

  def apply(
    cloudWatchAlarmDefinition: Option[software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty] = None
  ): software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty =
    (new software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty.Builder)
      .cloudWatchAlarmDefinition(cloudWatchAlarmDefinition.orNull)
      .build()
}
