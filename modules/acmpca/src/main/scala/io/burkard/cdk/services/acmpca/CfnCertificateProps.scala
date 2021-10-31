package io.burkard.cdk.services.acmpca

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCertificateProps {

  def apply(
    apiPassthrough: Option[software.amazon.awscdk.services.acmpca.CfnCertificate.ApiPassthroughProperty] = None,
    validityNotBefore: Option[software.amazon.awscdk.services.acmpca.CfnCertificate.ValidityProperty] = None,
    certificateAuthorityArn: Option[String] = None,
    signingAlgorithm: Option[String] = None,
    validity: Option[software.amazon.awscdk.services.acmpca.CfnCertificate.ValidityProperty] = None,
    templateArn: Option[String] = None,
    certificateSigningRequest: Option[String] = None
  ): software.amazon.awscdk.services.acmpca.CfnCertificateProps =
    (new software.amazon.awscdk.services.acmpca.CfnCertificateProps.Builder)
      .apiPassthrough(apiPassthrough.orNull)
      .validityNotBefore(validityNotBefore.orNull)
      .certificateAuthorityArn(certificateAuthorityArn.orNull)
      .signingAlgorithm(signingAlgorithm.orNull)
      .validity(validity.orNull)
      .templateArn(templateArn.orNull)
      .certificateSigningRequest(certificateSigningRequest.orNull)
      .build()
}
