package io.burkard.cdk.services.acmpca

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
