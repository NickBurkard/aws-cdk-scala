package io.burkard.cdk.services.waf

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object XssMatchTupleProperty {

  def apply(
    textTransformation: Option[String] = None,
    fieldToMatch: Option[software.amazon.awscdk.services.waf.CfnXssMatchSet.FieldToMatchProperty] = None
  ): software.amazon.awscdk.services.waf.CfnXssMatchSet.XssMatchTupleProperty =
    (new software.amazon.awscdk.services.waf.CfnXssMatchSet.XssMatchTupleProperty.Builder)
      .textTransformation(textTransformation.orNull)
      .fieldToMatch(fieldToMatch.orNull)
      .build()
}
