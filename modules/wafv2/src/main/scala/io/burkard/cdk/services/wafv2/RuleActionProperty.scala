package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RuleActionProperty {

  def apply(
    count: Option[AnyRef] = None,
    block: Option[AnyRef] = None,
    allow: Option[AnyRef] = None
  ): software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleActionProperty =
    (new software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleActionProperty.Builder)
      .count(count.orNull)
      .block(block.orNull)
      .allow(allow.orNull)
      .build()
}
