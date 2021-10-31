package io.burkard.cdk.services.wafv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RegexPatternSetReferenceStatementProperty {

  def apply(
    arn: Option[String] = None,
    fieldToMatch: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.FieldToMatchProperty] = None,
    textTransformations: Option[List[_]] = None
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.RegexPatternSetReferenceStatementProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.RegexPatternSetReferenceStatementProperty.Builder)
      .arn(arn.orNull)
      .fieldToMatch(fieldToMatch.orNull)
      .textTransformations(textTransformations.map(_.asJava).orNull)
      .build()
}
