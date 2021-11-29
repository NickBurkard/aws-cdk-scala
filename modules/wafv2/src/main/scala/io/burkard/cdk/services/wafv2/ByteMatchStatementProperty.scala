package io.burkard.cdk.services.wafv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ByteMatchStatementProperty {

  def apply(
    positionalConstraint: String,
    fieldToMatch: software.amazon.awscdk.services.wafv2.CfnRuleGroup.FieldToMatchProperty,
    textTransformations: List[_],
    searchStringBase64: Option[String] = None,
    searchString: Option[String] = None
  ): software.amazon.awscdk.services.wafv2.CfnRuleGroup.ByteMatchStatementProperty =
    (new software.amazon.awscdk.services.wafv2.CfnRuleGroup.ByteMatchStatementProperty.Builder)
      .positionalConstraint(positionalConstraint)
      .fieldToMatch(fieldToMatch)
      .textTransformations(textTransformations.asJava)
      .searchStringBase64(searchStringBase64.orNull)
      .searchString(searchString.orNull)
      .build()
}
