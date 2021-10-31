package io.burkard.cdk.services.wafv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ByteMatchStatementProperty {

  def apply(
    positionalConstraint: Option[String] = None,
    searchStringBase64: Option[String] = None,
    searchString: Option[String] = None,
    fieldToMatch: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.FieldToMatchProperty] = None,
    textTransformations: Option[List[_]] = None
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.ByteMatchStatementProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.ByteMatchStatementProperty.Builder)
      .positionalConstraint(positionalConstraint.orNull)
      .searchStringBase64(searchStringBase64.orNull)
      .searchString(searchString.orNull)
      .fieldToMatch(fieldToMatch.orNull)
      .textTransformations(textTransformations.map(_.asJava).orNull)
      .build()
}
