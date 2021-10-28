package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ListenerTlsOptions {

  def apply(
    certificate: Option[software.amazon.awscdk.services.appmesh.TlsCertificate] = None,
    mutualTlsValidation: Option[software.amazon.awscdk.services.appmesh.MutualTlsValidation] = None,
    mode: Option[software.amazon.awscdk.services.appmesh.TlsMode] = None
  ): software.amazon.awscdk.services.appmesh.ListenerTlsOptions =
    (new software.amazon.awscdk.services.appmesh.ListenerTlsOptions.Builder)
      .certificate(certificate.orNull)
      .mutualTlsValidation(mutualTlsValidation.orNull)
      .mode(mode.orNull)
      .build()
}
