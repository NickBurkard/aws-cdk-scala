package io.burkard.cdk.services.acmpca

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCertificate {

  def apply(
    internalResourceId: String,
    apiPassthrough: Option[software.amazon.awscdk.services.acmpca.CfnCertificate.ApiPassthroughProperty] = None,
    validityNotBefore: Option[software.amazon.awscdk.services.acmpca.CfnCertificate.ValidityProperty] = None,
    certificateAuthorityArn: Option[String] = None,
    signingAlgorithm: Option[String] = None,
    validity: Option[software.amazon.awscdk.services.acmpca.CfnCertificate.ValidityProperty] = None,
    templateArn: Option[String] = None,
    certificateSigningRequest: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.acmpca.CfnCertificate =
    software.amazon.awscdk.services.acmpca.CfnCertificate.Builder
      .create(stackCtx, internalResourceId)
      .apiPassthrough(apiPassthrough.orNull)
      .validityNotBefore(validityNotBefore.orNull)
      .certificateAuthorityArn(certificateAuthorityArn.orNull)
      .signingAlgorithm(signingAlgorithm.orNull)
      .validity(validity.orNull)
      .templateArn(templateArn.orNull)
      .certificateSigningRequest(certificateSigningRequest.orNull)
      .build()
}
