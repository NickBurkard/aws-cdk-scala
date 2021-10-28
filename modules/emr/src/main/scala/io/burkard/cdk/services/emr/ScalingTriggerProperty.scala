package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ScalingTriggerProperty {

  def apply(
    cloudWatchAlarmDefinition: Option[software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty] = None
  ): software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty =
    (new software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty.Builder)
      .cloudWatchAlarmDefinition(cloudWatchAlarmDefinition.orNull)
      .build()
}
