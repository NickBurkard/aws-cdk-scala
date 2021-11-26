package io.burkard.cdk.services.waf

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object XssMatchTupleProperty {

  def apply(
    textTransformation: String,
    fieldToMatch: software.amazon.awscdk.services.waf.CfnXssMatchSet.FieldToMatchProperty
  ): software.amazon.awscdk.services.waf.CfnXssMatchSet.XssMatchTupleProperty =
    (new software.amazon.awscdk.services.waf.CfnXssMatchSet.XssMatchTupleProperty.Builder)
      .textTransformation(textTransformation)
      .fieldToMatch(fieldToMatch)
      .build()
}
