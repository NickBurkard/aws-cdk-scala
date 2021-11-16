package io.burkard.cdk.services.acmpca

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PolicyQualifierInfoProperty {

  def apply(
    policyQualifierId: String,
    qualifier: software.amazon.awscdk.services.acmpca.CfnCertificate.QualifierProperty
  ): software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyQualifierInfoProperty =
    (new software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyQualifierInfoProperty.Builder)
      .policyQualifierId(policyQualifierId)
      .qualifier(qualifier)
      .build()
}
