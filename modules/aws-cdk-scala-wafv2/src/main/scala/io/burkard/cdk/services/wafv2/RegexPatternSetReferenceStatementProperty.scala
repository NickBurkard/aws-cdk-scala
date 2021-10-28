package io.burkard.cdk.services.wafv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RegexPatternSetReferenceStatementProperty {

  def apply(
    arn: Option[String] = None,
    fieldToMatch: Option[software.amazon.awscdk.services.wafv2.CfnRuleGroup.FieldToMatchProperty] = None,
    textTransformations: Option[List[_]] = None
  ): software.amazon.awscdk.services.wafv2.CfnRuleGroup.RegexPatternSetReferenceStatementProperty =
    (new software.amazon.awscdk.services.wafv2.CfnRuleGroup.RegexPatternSetReferenceStatementProperty.Builder)
      .arn(arn.orNull)
      .fieldToMatch(fieldToMatch.orNull)
      .textTransformations(textTransformations.map(_.asJava).orNull)
      .build()
}
