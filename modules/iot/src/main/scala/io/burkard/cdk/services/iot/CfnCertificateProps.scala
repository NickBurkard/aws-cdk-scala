package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCertificateProps {

  def apply(
    certificateMode: Option[String] = None,
    certificateSigningRequest: Option[String] = None,
    status: Option[String] = None,
    caCertificatePem: Option[String] = None,
    certificatePem: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnCertificateProps =
    (new software.amazon.awscdk.services.iot.CfnCertificateProps.Builder)
      .certificateMode(certificateMode.orNull)
      .certificateSigningRequest(certificateSigningRequest.orNull)
      .status(status.orNull)
      .caCertificatePem(caCertificatePem.orNull)
      .certificatePem(certificatePem.orNull)
      .build()
}
