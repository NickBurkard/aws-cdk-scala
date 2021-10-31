package io.burkard.cdk.services.route53recoverycontrol

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSafetyRule {

  def apply(
    internalResourceId: String,
    ruleConfig: Option[software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.RuleConfigProperty] = None,
    assertionRule: Option[software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.AssertionRuleProperty] = None,
    controlPanelArn: Option[String] = None,
    name: Option[String] = None,
    gatingRule: Option[software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.GatingRuleProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule =
    software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.Builder
      .create(stackCtx, internalResourceId)
      .ruleConfig(ruleConfig.orNull)
      .assertionRule(assertionRule.orNull)
      .controlPanelArn(controlPanelArn.orNull)
      .name(name.orNull)
      .gatingRule(gatingRule.orNull)
      .build()
}
