package io.burkard.cdk.services.waf

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SizeConstraintProperty {

  def apply(
    size: Number,
    textTransformation: String,
    comparisonOperator: String,
    fieldToMatch: software.amazon.awscdk.services.waf.CfnSizeConstraintSet.FieldToMatchProperty
  ): software.amazon.awscdk.services.waf.CfnSizeConstraintSet.SizeConstraintProperty =
    (new software.amazon.awscdk.services.waf.CfnSizeConstraintSet.SizeConstraintProperty.Builder)
      .size(size)
      .textTransformation(textTransformation)
      .comparisonOperator(comparisonOperator)
      .fieldToMatch(fieldToMatch)
      .build()
}
