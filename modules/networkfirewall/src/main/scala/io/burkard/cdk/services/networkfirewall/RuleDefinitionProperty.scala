package io.burkard.cdk.services.networkfirewall

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RuleDefinitionProperty {

  def apply(
    matchAttributes: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.MatchAttributesProperty,
    actions: List[String]
  ): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleDefinitionProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleDefinitionProperty.Builder)
      .matchAttributes(matchAttributes)
      .actions(actions.asJava)
      .build()
}
