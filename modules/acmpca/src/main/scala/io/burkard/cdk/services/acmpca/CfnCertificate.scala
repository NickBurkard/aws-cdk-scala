package io.burkard.cdk.services.acmpca

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCertificate {

  def apply(
    internalResourceId: String,
    certificateAuthorityArn: String,
    signingAlgorithm: String,
    validity: software.amazon.awscdk.services.acmpca.CfnCertificate.ValidityProperty,
    certificateSigningRequest: String,
    apiPassthrough: Option[software.amazon.awscdk.services.acmpca.CfnCertificate.ApiPassthroughProperty] = None,
    validityNotBefore: Option[software.amazon.awscdk.services.acmpca.CfnCertificate.ValidityProperty] = None,
    templateArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.acmpca.CfnCertificate =
    software.amazon.awscdk.services.acmpca.CfnCertificate.Builder
      .create(stackCtx, internalResourceId)
      .certificateAuthorityArn(certificateAuthorityArn)
      .signingAlgorithm(signingAlgorithm)
      .validity(validity)
      .certificateSigningRequest(certificateSigningRequest)
      .apiPassthrough(apiPassthrough.orNull)
      .validityNotBefore(validityNotBefore.orNull)
      .templateArn(templateArn.orNull)
      .build()
}
