package io.burkard.cdk.services.networkfirewall

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRuleGroup {

  def apply(
    internalResourceId: String,
    ruleGroupName: String,
    `type`: String,
    capacity: Number,
    ruleGroup: Option[software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleGroupProperty] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup =
    software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.Builder
      .create(stackCtx, internalResourceId)
      .ruleGroupName(ruleGroupName)
      .`type`(`type`)
      .capacity(capacity)
      .ruleGroup(ruleGroup.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
