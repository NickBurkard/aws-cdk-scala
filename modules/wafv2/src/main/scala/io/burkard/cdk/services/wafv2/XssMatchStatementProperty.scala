package io.burkard.cdk.services.wafv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object XssMatchStatementProperty {

  def apply(
    fieldToMatch: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.FieldToMatchProperty] = None,
    textTransformations: Option[List[_]] = None
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.XssMatchStatementProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.XssMatchStatementProperty.Builder)
      .fieldToMatch(fieldToMatch.orNull)
      .textTransformations(textTransformations.map(_.asJava).orNull)
      .build()
}
