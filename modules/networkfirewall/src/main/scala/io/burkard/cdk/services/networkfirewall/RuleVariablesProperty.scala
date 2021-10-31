package io.burkard.cdk.services.networkfirewall

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
