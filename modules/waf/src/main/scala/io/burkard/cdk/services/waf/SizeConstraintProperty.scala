package io.burkard.cdk.services.waf

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SizeConstraintProperty {

  def apply(
    size: Option[Number] = None,
    textTransformation: Option[String] = None,
    comparisonOperator: Option[String] = None,
    fieldToMatch: Option[software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.FieldToMatchProperty] = None
  ): software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.SizeConstraintProperty =
    (new software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.SizeConstraintProperty.Builder)
      .size(size.orNull)
      .textTransformation(textTransformation.orNull)
      .comparisonOperator(comparisonOperator.orNull)
      .fieldToMatch(fieldToMatch.orNull)
      .build()
}
