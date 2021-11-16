package io.burkard.cdk.services.route53recoverycontrol

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSafetyRuleProps {

  def apply(
    ruleConfig: software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.RuleConfigProperty,
    controlPanelArn: String,
    name: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    assertionRule: Option[software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.AssertionRuleProperty] = None,
    gatingRule: Option[software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.GatingRuleProperty] = None
  ): software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRuleProps =
    (new software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRuleProps.Builder)
      .ruleConfig(ruleConfig)
      .controlPanelArn(controlPanelArn)
      .name(name)
      .tags(tags.map(_.asJava).orNull)
      .assertionRule(assertionRule.orNull)
      .gatingRule(gatingRule.orNull)
      .build()
}
