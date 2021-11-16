package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCertificate {

  def apply(
    internalResourceId: String,
    status: String,
    certificateMode: Option[String] = None,
    certificateSigningRequest: Option[String] = None,
    caCertificatePem: Option[String] = None,
    certificatePem: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot.CfnCertificate =
    software.amazon.awscdk.services.iot.CfnCertificate.Builder
      .create(stackCtx, internalResourceId)
      .status(status)
      .certificateMode(certificateMode.orNull)
      .certificateSigningRequest(certificateSigningRequest.orNull)
      .caCertificatePem(caCertificatePem.orNull)
      .certificatePem(certificatePem.orNull)
      .build()
}
