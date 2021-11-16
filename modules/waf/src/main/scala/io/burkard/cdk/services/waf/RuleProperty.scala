package io.burkard.cdk.services.waf

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RuleProperty {

  def apply(
    priority: Number,
    action: software.amazon.awscdk.services.waf.regional.CfnWebACL.ActionProperty,
    ruleId: String
  ): software.amazon.awscdk.services.waf.regional.CfnWebACL.RuleProperty =
    (new software.amazon.awscdk.services.waf.regional.CfnWebACL.RuleProperty.Builder)
      .priority(priority)
      .action(action)
      .ruleId(ruleId)
      .build()
}
