package io.burkard.cdk.services.networkfirewall

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RuleVariablesProperty {

  def apply(
    ipSets: Option[Map[String, _]] = None,
    portSets: Option[Map[String, _]] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleVariablesProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleVariablesProperty.Builder)
      .ipSets(ipSets.map(_.asJava).orNull)
      .portSets(portSets.map(_.asJava).orNull)
      .build()
}
