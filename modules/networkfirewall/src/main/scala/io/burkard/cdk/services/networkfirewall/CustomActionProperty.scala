package io.burkard.cdk.services.networkfirewall

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomActionProperty {

  def apply(
    actionDefinition: Option[software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.ActionDefinitionProperty] = None,
    actionName: Option[String] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.CustomActionProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.CustomActionProperty.Builder)
      .actionDefinition(actionDefinition.orNull)
      .actionName(actionName.orNull)
      .build()
}
