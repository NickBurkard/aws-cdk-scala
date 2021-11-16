package io.burkard.cdk.services.waf

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ActivatedRuleProperty {

  def apply(
    priority: Number,
    ruleId: String,
    action: Option[software.amazon.awscdk.services.waf.CfnWebACL.WafActionProperty] = None
  ): software.amazon.awscdk.services.waf.CfnWebACL.ActivatedRuleProperty =
    (new software.amazon.awscdk.services.waf.CfnWebACL.ActivatedRuleProperty.Builder)
      .priority(priority)
      .ruleId(ruleId)
      .action(action.orNull)
      .build()
}
