package io.burkard.cdk.services.networkfirewall

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRuleGroupProps {

  def apply(
    ruleGroupName: Option[String] = None,
    ruleGroup: Option[software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleGroupProperty] = None,
    `type`: Option[String] = None,
    capacity: Option[Number] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnRuleGroupProps =
    (new software.amazon.awscdk.services.networkfirewall.CfnRuleGroupProps.Builder)
      .ruleGroupName(ruleGroupName.orNull)
      .ruleGroup(ruleGroup.orNull)
      .`type`(`type`.orNull)
      .capacity(capacity.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
