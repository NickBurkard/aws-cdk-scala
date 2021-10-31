package io.burkard.cdk.services.networkfirewall

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RulesSourceProperty {

  def apply(
    rulesSourceList: Option[software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceListProperty] = None,
    statelessRulesAndCustomActions: Option[software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRulesAndCustomActionsProperty] = None,
    rulesString: Option[String] = None,
    statefulRules: Option[List[_]] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceProperty.Builder)
      .rulesSourceList(rulesSourceList.orNull)
      .statelessRulesAndCustomActions(statelessRulesAndCustomActions.orNull)
      .rulesString(rulesString.orNull)
      .statefulRules(statefulRules.map(_.asJava).orNull)
      .build()
}
