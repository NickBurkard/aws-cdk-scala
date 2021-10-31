package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScalingRuleProperty {

  def apply(
    name: Option[String] = None,
    description: Option[String] = None,
    action: Option[software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty] = None,
    trigger: Option[software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty] = None
  ): software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty =
    (new software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty.Builder)
      .name(name.orNull)
      .description(description.orNull)
      .action(action.orNull)
      .trigger(trigger.orNull)
      .build()
}
