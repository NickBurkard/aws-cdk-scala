package io.burkard.cdk.services.wafv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RuleProperty {

  def apply(
    ruleLabels: Option[List[_]] = None,
    action: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.RuleActionProperty] = None,
    name: Option[String] = None,
    visibilityConfig: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.VisibilityConfigProperty] = None,
    priority: Option[Number] = None,
    overrideAction: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.OverrideActionProperty] = None,
    statement: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.StatementProperty] = None
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.RuleProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.RuleProperty.Builder)
      .ruleLabels(ruleLabels.map(_.asJava).orNull)
      .action(action.orNull)
      .name(name.orNull)
      .visibilityConfig(visibilityConfig.orNull)
      .priority(priority.orNull)
      .overrideAction(overrideAction.orNull)
      .statement(statement.orNull)
      .build()
}
