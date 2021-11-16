package io.burkard.cdk.services.wafv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SizeConstraintStatementProperty {

  def apply(
    size: Number,
    comparisonOperator: String,
    fieldToMatch: software.amazon.awscdk.services.wafv2.CfnWebACL.FieldToMatchProperty,
    textTransformations: List[_]
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.SizeConstraintStatementProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.SizeConstraintStatementProperty.Builder)
      .size(size)
      .comparisonOperator(comparisonOperator)
      .fieldToMatch(fieldToMatch)
      .textTransformations(textTransformations.asJava)
      .build()
}
