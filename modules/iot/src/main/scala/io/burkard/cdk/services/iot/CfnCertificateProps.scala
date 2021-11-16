package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCertificateProps {

  def apply(
    status: String,
    certificateMode: Option[String] = None,
    certificateSigningRequest: Option[String] = None,
    caCertificatePem: Option[String] = None,
    certificatePem: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnCertificateProps =
    (new software.amazon.awscdk.services.iot.CfnCertificateProps.Builder)
      .status(status)
      .certificateMode(certificateMode.orNull)
      .certificateSigningRequest(certificateSigningRequest.orNull)
      .caCertificatePem(caCertificatePem.orNull)
      .certificatePem(certificatePem.orNull)
      .build()
}
