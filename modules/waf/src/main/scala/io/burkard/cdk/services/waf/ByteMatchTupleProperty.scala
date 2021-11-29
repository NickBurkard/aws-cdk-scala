package io.burkard.cdk.services.waf

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ByteMatchTupleProperty {

  def apply(
    positionalConstraint: String,
    textTransformation: String,
    fieldToMatch: software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.FieldToMatchProperty,
    targetStringBase64: Option[String] = None,
    targetString: Option[String] = None
  ): software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.ByteMatchTupleProperty =
    (new software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.ByteMatchTupleProperty.Builder)
      .positionalConstraint(positionalConstraint)
      .textTransformation(textTransformation)
      .fieldToMatch(fieldToMatch)
      .targetStringBase64(targetStringBase64.orNull)
      .targetString(targetString.orNull)
      .build()
}
