package io.burkard.cdk.services.acmpca

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCertificateAuthorityActivationProps {

  def apply(
    certificate: Option[String] = None,
    certificateAuthorityArn: Option[String] = None,
    status: Option[String] = None,
    certificateChain: Option[String] = None
  ): software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivationProps =
    (new software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivationProps.Builder)
      .certificate(certificate.orNull)
      .certificateAuthorityArn(certificateAuthorityArn.orNull)
      .status(status.orNull)
      .certificateChain(certificateChain.orNull)
      .build()
}
