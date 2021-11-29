package io.burkard.cdk.services.databrew

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RuleProperty {

  def apply(
    checkExpression: String,
    name: String,
    threshold: Option[software.amazon.awscdk.services.databrew.CfnRuleset.ThresholdProperty] = None,
    columnSelectors: Option[List[_]] = None,
    disabled: Option[Boolean] = None,
    substitutionMap: Option[List[_]] = None
  ): software.amazon.awscdk.services.databrew.CfnRuleset.RuleProperty =
    (new software.amazon.awscdk.services.databrew.CfnRuleset.RuleProperty.Builder)
      .checkExpression(checkExpression)
      .name(name)
      .threshold(threshold.orNull)
      .columnSelectors(columnSelectors.map(_.asJava).orNull)
      .disabled(disabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .substitutionMap(substitutionMap.map(_.asJava).orNull)
      .build()
}
