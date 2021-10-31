package io.burkard.cdk.services.networkfirewall

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StatelessRulesAndCustomActionsProperty {

  def apply(
    statelessRules: Option[List[_]] = None,
    customActions: Option[List[_]] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRulesAndCustomActionsProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRulesAndCustomActionsProperty.Builder)
      .statelessRules(statelessRules.map(_.asJava).orNull)
      .customActions(customActions.map(_.asJava).orNull)
      .build()
}
