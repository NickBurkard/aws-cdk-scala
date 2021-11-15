package io.burkard.cdk.services.networkfirewall

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ActionDefinitionProperty {

  def apply(
    publishMetricAction: Option[software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PublishMetricActionProperty] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.ActionDefinitionProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.ActionDefinitionProperty.Builder)
      .publishMetricAction(publishMetricAction.orNull)
      .build()
}
