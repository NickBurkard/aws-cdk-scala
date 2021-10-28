package io.burkard.cdk.services.networkfirewall

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FirewallPolicyProperty {

  def apply(
    statelessRuleGroupReferences: Option[List[_]] = None,
    statelessDefaultActions: Option[List[String]] = None,
    statefulRuleGroupReferences: Option[List[_]] = None,
    statelessFragmentDefaultActions: Option[List[String]] = None,
    statelessCustomActions: Option[List[_]] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.FirewallPolicyProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.FirewallPolicyProperty.Builder)
      .statelessRuleGroupReferences(statelessRuleGroupReferences.map(_.asJava).orNull)
      .statelessDefaultActions(statelessDefaultActions.map(_.asJava).orNull)
      .statefulRuleGroupReferences(statefulRuleGroupReferences.map(_.asJava).orNull)
      .statelessFragmentDefaultActions(statelessFragmentDefaultActions.map(_.asJava).orNull)
      .statelessCustomActions(statelessCustomActions.map(_.asJava).orNull)
      .build()
}
