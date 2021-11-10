package io.burkard.cdk.services.route53recoverycontrol

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSafetyRuleProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    ruleConfig: Option[software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.RuleConfigProperty] = None,
    assertionRule: Option[software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.AssertionRuleProperty] = None,
    controlPanelArn: Option[String] = None,
    name: Option[String] = None,
    gatingRule: Option[software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.GatingRuleProperty] = None
  ): software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRuleProps =
    (new software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRuleProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .ruleConfig(ruleConfig.orNull)
      .assertionRule(assertionRule.orNull)
      .controlPanelArn(controlPanelArn.orNull)
      .name(name.orNull)
      .gatingRule(gatingRule.orNull)
      .build()
}
