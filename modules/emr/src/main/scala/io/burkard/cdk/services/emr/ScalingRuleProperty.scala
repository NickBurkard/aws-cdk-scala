package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScalingRuleProperty {

  def apply(
    name: String,
    action: software.amazon.awscdk.services.emr.CfnCluster.ScalingActionProperty,
    trigger: software.amazon.awscdk.services.emr.CfnCluster.ScalingTriggerProperty,
    description: Option[String] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.ScalingRuleProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.ScalingRuleProperty.Builder)
      .name(name)
      .action(action)
      .trigger(trigger)
      .description(description.orNull)
      .build()
}
