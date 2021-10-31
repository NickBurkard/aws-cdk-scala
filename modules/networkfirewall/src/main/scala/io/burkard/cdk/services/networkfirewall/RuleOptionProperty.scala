package io.burkard.cdk.services.networkfirewall

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
