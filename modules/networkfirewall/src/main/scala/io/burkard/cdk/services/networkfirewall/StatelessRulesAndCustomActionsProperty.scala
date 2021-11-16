package io.burkard.cdk.services.networkfirewall

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StatelessRulesAndCustomActionsProperty {

  def apply(
    statelessRules: List[_],
    customActions: Option[List[_]] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRulesAndCustomActionsProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRulesAndCustomActionsProperty.Builder)
      .statelessRules(statelessRules.asJava)
      .customActions(customActions.map(_.asJava).orNull)
      .build()
}
