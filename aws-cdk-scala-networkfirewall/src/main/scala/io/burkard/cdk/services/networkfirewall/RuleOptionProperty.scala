package io.burkard.cdk.services.networkfirewall

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RuleOptionProperty {

  def apply(
    keyword: Option[String] = None,
    settings: Option[List[String]] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleOptionProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleOptionProperty.Builder)
      .keyword(keyword.orNull)
      .settings(settings.map(_.asJava).orNull)
      .build()
}
