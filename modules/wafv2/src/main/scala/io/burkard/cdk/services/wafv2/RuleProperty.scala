package io.burkard.cdk.services.wafv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RuleProperty {

  def apply(
    name: String,
    visibilityConfig: software.amazon.awscdk.services.wafv2.CfnWebACL.VisibilityConfigProperty,
    priority: Number,
    statement: software.amazon.awscdk.services.wafv2.CfnWebACL.StatementProperty,
    ruleLabels: Option[List[_]] = None,
    action: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.RuleActionProperty] = None,
    overrideAction: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.OverrideActionProperty] = None
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.RuleProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.RuleProperty.Builder)
      .name(name)
      .visibilityConfig(visibilityConfig)
      .priority(priority)
      .statement(statement)
      .ruleLabels(ruleLabels.map(_.asJava).orNull)
      .action(action.orNull)
      .overrideAction(overrideAction.orNull)
      .build()
}
