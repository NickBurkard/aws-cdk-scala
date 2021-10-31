package io.burkard.cdk.services.networkfirewall

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RuleDefinitionProperty {

  def apply(
    matchAttributes: Option[software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.MatchAttributesProperty] = None,
    actions: Option[List[String]] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleDefinitionProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleDefinitionProperty.Builder)
      .matchAttributes(matchAttributes.orNull)
      .actions(actions.map(_.asJava).orNull)
      .build()
}
