package io.burkard.cdk.services.waf

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RuleProperty {

  def apply(
    priority: Option[Number] = None,
    action: Option[software.amazon.awscdk.services.waf.regional.CfnWebACL.ActionProperty] = None,
    ruleId: Option[String] = None
  ): software.amazon.awscdk.services.waf.regional.CfnWebACL.RuleProperty =
    (new software.amazon.awscdk.services.waf.regional.CfnWebACL.RuleProperty.Builder)
      .priority(priority.orNull)
      .action(action.orNull)
      .ruleId(ruleId.orNull)
      .build()
}
