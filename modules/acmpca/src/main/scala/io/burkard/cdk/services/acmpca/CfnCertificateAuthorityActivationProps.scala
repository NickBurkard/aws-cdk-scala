package io.burkard.cdk.services.acmpca

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCertificateAuthorityActivationProps {

  def apply(
    certificate: String,
    certificateAuthorityArn: String,
    status: Option[String] = None,
    certificateChain: Option[String] = None
  ): software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivationProps =
    (new software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivationProps.Builder)
      .certificate(certificate)
      .certificateAuthorityArn(certificateAuthorityArn)
      .status(status.orNull)
      .certificateChain(certificateChain.orNull)
      .build()
}
