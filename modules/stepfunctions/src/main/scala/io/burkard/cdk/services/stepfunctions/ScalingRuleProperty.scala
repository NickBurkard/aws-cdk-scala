package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScalingRuleProperty {

  def apply(
    name: String,
    action: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingActionProperty,
    trigger: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingTriggerProperty,
    description: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingRuleProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingRuleProperty.Builder)
      .name(name)
      .action(action)
      .trigger(trigger)
      .description(description.orNull)
      .build()
}
