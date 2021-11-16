package io.burkard.cdk.services.acmpca

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCertificateAuthorityActivation {

  def apply(
    internalResourceId: String,
    certificate: String,
    certificateAuthorityArn: String,
    status: Option[String] = None,
    certificateChain: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivation =
    software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivation.Builder
      .create(stackCtx, internalResourceId)
      .certificate(certificate)
      .certificateAuthorityArn(certificateAuthorityArn)
      .status(status.orNull)
      .certificateChain(certificateChain.orNull)
      .build()
}
