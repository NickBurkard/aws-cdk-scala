package io.burkard.cdk.services.networkfirewall

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StatefulRuleProperty {

  def apply(
    ruleOptions: Option[List[_]] = None,
    header: Option[software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.HeaderProperty] = None,
    action: Option[String] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleProperty.Builder)
      .ruleOptions(ruleOptions.map(_.asJava).orNull)
      .header(header.orNull)
      .action(action.orNull)
      .build()
}
