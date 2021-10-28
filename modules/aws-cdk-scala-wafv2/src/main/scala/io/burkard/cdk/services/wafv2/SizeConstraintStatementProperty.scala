package io.burkard.cdk.services.wafv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SizeConstraintStatementProperty {

  def apply(
    size: Option[Number] = None,
    comparisonOperator: Option[String] = None,
    fieldToMatch: Option[software.amazon.awscdk.services.wafv2.CfnRuleGroup.FieldToMatchProperty] = None,
    textTransformations: Option[List[_]] = None
  ): software.amazon.awscdk.services.wafv2.CfnRuleGroup.SizeConstraintStatementProperty =
    (new software.amazon.awscdk.services.wafv2.CfnRuleGroup.SizeConstraintStatementProperty.Builder)
      .size(size.orNull)
      .comparisonOperator(comparisonOperator.orNull)
      .fieldToMatch(fieldToMatch.orNull)
      .textTransformations(textTransformations.map(_.asJava).orNull)
      .build()
}
