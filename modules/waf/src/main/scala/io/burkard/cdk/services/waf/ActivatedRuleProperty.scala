package io.burkard.cdk.services.waf

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ActivatedRuleProperty {

  def apply(
    priority: Option[Number] = None,
    action: Option[software.amazon.awscdk.services.waf.CfnWebACL.WafActionProperty] = None,
    ruleId: Option[String] = None
  ): software.amazon.awscdk.services.waf.CfnWebACL.ActivatedRuleProperty =
    (new software.amazon.awscdk.services.waf.CfnWebACL.ActivatedRuleProperty.Builder)
      .priority(priority.orNull)
      .action(action.orNull)
      .ruleId(ruleId.orNull)
      .build()
}