package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScalingTriggerProperty {

  def apply(
    cloudWatchAlarmDefinition: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmDefinitionProperty
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingTriggerProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingTriggerProperty.Builder)
      .cloudWatchAlarmDefinition(cloudWatchAlarmDefinition)
      .build()
}
