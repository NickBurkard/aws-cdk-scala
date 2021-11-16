package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScalingRuleProperty {

  def apply(
    name: String,
    action: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty,
    trigger: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty,
    description: Option[String] = None
  ): software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty =
    (new software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty.Builder)
      .name(name)
      .action(action)
      .trigger(trigger)
      .description(description.orNull)
      .build()
}
