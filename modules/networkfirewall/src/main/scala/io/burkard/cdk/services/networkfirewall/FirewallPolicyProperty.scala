package io.burkard.cdk.services.networkfirewall

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FirewallPolicyProperty {

  def apply(
    statelessDefaultActions: List[String],
    statelessFragmentDefaultActions: List[String],
    statelessRuleGroupReferences: Option[List[_]] = None,
    statefulRuleGroupReferences: Option[List[_]] = None,
    statefulEngineOptions: Option[software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulEngineOptionsProperty] = None,
    statelessCustomActions: Option[List[_]] = None,
    statefulDefaultActions: Option[List[String]] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.FirewallPolicyProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.FirewallPolicyProperty.Builder)
      .statelessDefaultActions(statelessDefaultActions.asJava)
      .statelessFragmentDefaultActions(statelessFragmentDefaultActions.asJava)
      .statelessRuleGroupReferences(statelessRuleGroupReferences.map(_.asJava).orNull)
      .statefulRuleGroupReferences(statefulRuleGroupReferences.map(_.asJava).orNull)
      .statefulEngineOptions(statefulEngineOptions.orNull)
      .statelessCustomActions(statelessCustomActions.map(_.asJava).orNull)
      .statefulDefaultActions(statefulDefaultActions.map(_.asJava).orNull)
      .build()
}
