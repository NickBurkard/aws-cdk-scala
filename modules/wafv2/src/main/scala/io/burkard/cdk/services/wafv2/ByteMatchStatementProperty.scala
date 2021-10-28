package io.burkard.cdk.services.wafv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
