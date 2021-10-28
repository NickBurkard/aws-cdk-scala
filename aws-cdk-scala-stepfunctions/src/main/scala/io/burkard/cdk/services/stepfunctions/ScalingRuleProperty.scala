package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ScalingRuleProperty {

  def apply(
    name: Option[String] = None,
    description: Option[String] = None,
    action: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingActionProperty] = None,
    trigger: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingTriggerProperty] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingRuleProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingRuleProperty.Builder)
      .name(name.orNull)
      .description(description.orNull)
      .action(action.orNull)
      .trigger(trigger.orNull)
      .build()
}
