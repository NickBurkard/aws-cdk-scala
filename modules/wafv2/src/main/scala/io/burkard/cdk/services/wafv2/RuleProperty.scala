package io.burkard.cdk.services.wafv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RuleProperty {

  def apply(
    statement: Option[software.amazon.awscdk.services.wafv2.CfnRuleGroup.StatementProperty] = None,
    ruleLabels: Option[List[_]] = None,
    action: Option[software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleActionProperty] = None,
    name: Option[String] = None,
    visibilityConfig: Option[software.amazon.awscdk.services.wafv2.CfnRuleGroup.VisibilityConfigProperty] = None,
    priority: Option[Number] = None
  ): software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleProperty =
    (new software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleProperty.Builder)
      .statement(statement.orNull)
      .ruleLabels(ruleLabels.map(_.asJava).orNull)
      .action(action.orNull)
      .name(name.orNull)
      .visibilityConfig(visibilityConfig.orNull)
      .priority(priority.orNull)
      .build()
}
