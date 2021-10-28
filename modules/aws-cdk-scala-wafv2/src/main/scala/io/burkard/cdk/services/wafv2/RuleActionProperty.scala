package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RuleActionProperty {

  def apply(
    count: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.CountActionProperty] = None,
    block: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.BlockActionProperty] = None,
    allow: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.AllowActionProperty] = None
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.RuleActionProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.RuleActionProperty.Builder)
      .count(count.orNull)
      .block(block.orNull)
      .allow(allow.orNull)
      .build()
}
