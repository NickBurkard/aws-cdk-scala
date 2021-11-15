package io.burkard.cdk.services.waf

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ByteMatchTupleProperty {

  def apply(
    targetStringBase64: Option[String] = None,
    targetString: Option[String] = None,
    positionalConstraint: Option[String] = None,
    textTransformation: Option[String] = None,
    fieldToMatch: Option[software.amazon.awscdk.services.waf.CfnByteMatchSet.FieldToMatchProperty] = None
  ): software.amazon.awscdk.services.waf.CfnByteMatchSet.ByteMatchTupleProperty =
    (new software.amazon.awscdk.services.waf.CfnByteMatchSet.ByteMatchTupleProperty.Builder)
      .targetStringBase64(targetStringBase64.orNull)
      .targetString(targetString.orNull)
      .positionalConstraint(positionalConstraint.orNull)
      .textTransformation(textTransformation.orNull)
      .fieldToMatch(fieldToMatch.orNull)
      .build()
}
