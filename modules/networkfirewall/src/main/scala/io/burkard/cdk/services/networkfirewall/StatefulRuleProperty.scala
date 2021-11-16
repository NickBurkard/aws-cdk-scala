package io.burkard.cdk.services.networkfirewall

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StatefulRuleProperty {

  def apply(
    ruleOptions: List[_],
    header: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.HeaderProperty,
    action: String
  ): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleProperty.Builder)
      .ruleOptions(ruleOptions.asJava)
      .header(header)
      .action(action)
      .build()
}
