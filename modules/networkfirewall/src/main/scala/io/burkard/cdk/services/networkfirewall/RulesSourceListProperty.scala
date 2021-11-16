package io.burkard.cdk.services.networkfirewall

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RulesSourceListProperty {

  def apply(
    targetTypes: List[String],
    targets: List[String],
    generatedRulesType: String
  ): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceListProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceListProperty.Builder)
      .targetTypes(targetTypes.asJava)
      .targets(targets.asJava)
      .generatedRulesType(generatedRulesType)
      .build()
}
