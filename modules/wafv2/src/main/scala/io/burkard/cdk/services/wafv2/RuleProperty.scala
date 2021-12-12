package io.burkard.cdk.services.wafv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RuleProperty {

  def apply(
    statement: software.amazon.awscdk.services.wafv2.CfnRuleGroup.StatementProperty,
    name: String,
    visibilityConfig: software.amazon.awscdk.services.wafv2.CfnRuleGroup.VisibilityConfigProperty,
    priority: Number,
    ruleLabels: Option[List[_]] = None,
    action: Option[software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleActionProperty] = None
  ): software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleProperty =
    (new software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleProperty.Builder)
      .statement(statement)
      .name(name)
      .visibilityConfig(visibilityConfig)
      .priority(priority)
      .ruleLabels(ruleLabels.map(_.asJava).orNull)
      .action(action.orNull)
      .build()
}
