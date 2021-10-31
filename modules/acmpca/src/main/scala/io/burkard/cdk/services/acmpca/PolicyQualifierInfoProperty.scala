package io.burkard.cdk.services.acmpca

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PolicyQualifierInfoProperty {

  def apply(
    policyQualifierId: Option[String] = None,
    qualifier: Option[software.amazon.awscdk.services.acmpca.CfnCertificate.QualifierProperty] = None
  ): software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyQualifierInfoProperty =
    (new software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyQualifierInfoProperty.Builder)
      .policyQualifierId(policyQualifierId.orNull)
      .qualifier(qualifier.orNull)
      .build()
}
