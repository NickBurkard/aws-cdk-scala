package io.burkard.cdk.services.wafv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RegexPatternSetReferenceStatementProperty {

  def apply(
    arn: String,
    fieldToMatch: software.amazon.awscdk.services.wafv2.CfnRuleGroup.FieldToMatchProperty,
    textTransformations: List[_]
  ): software.amazon.awscdk.services.wafv2.CfnRuleGroup.RegexPatternSetReferenceStatementProperty =
    (new software.amazon.awscdk.services.wafv2.CfnRuleGroup.RegexPatternSetReferenceStatementProperty.Builder)
      .arn(arn)
      .fieldToMatch(fieldToMatch)
      .textTransformations(textTransformations.asJava)
      .build()
}
