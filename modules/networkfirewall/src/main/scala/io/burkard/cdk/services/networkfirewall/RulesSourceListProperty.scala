package io.burkard.cdk.services.networkfirewall

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RulesSourceListProperty {

  def apply(
    targetTypes: Option[List[String]] = None,
    targets: Option[List[String]] = None,
    generatedRulesType: Option[String] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceListProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceListProperty.Builder)
      .targetTypes(targetTypes.map(_.asJava).orNull)
      .targets(targets.map(_.asJava).orNull)
      .generatedRulesType(generatedRulesType.orNull)
      .build()
}
