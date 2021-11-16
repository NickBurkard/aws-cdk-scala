package io.burkard.cdk.services.acmpca

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCertificateProps {

  def apply(
    certificateAuthorityArn: String,
    signingAlgorithm: String,
    validity: software.amazon.awscdk.services.acmpca.CfnCertificate.ValidityProperty,
    certificateSigningRequest: String,
    apiPassthrough: Option[software.amazon.awscdk.services.acmpca.CfnCertificate.ApiPassthroughProperty] = None,
    validityNotBefore: Option[software.amazon.awscdk.services.acmpca.CfnCertificate.ValidityProperty] = None,
    templateArn: Option[String] = None
  ): software.amazon.awscdk.services.acmpca.CfnCertificateProps =
    (new software.amazon.awscdk.services.acmpca.CfnCertificateProps.Builder)
      .certificateAuthorityArn(certificateAuthorityArn)
      .signingAlgorithm(signingAlgorithm)
      .validity(validity)
      .certificateSigningRequest(certificateSigningRequest)
      .apiPassthrough(apiPassthrough.orNull)
      .validityNotBefore(validityNotBefore.orNull)
      .templateArn(templateArn.orNull)
      .build()
}
