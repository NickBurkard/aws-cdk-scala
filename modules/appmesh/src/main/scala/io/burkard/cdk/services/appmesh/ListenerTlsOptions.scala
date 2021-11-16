package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ListenerTlsOptions {

  def apply(
    certificate: software.amazon.awscdk.services.appmesh.TlsCertificate,
    mode: software.amazon.awscdk.services.appmesh.TlsMode,
    mutualTlsValidation: Option[software.amazon.awscdk.services.appmesh.MutualTlsValidation] = None
  ): software.amazon.awscdk.services.appmesh.ListenerTlsOptions =
    (new software.amazon.awscdk.services.appmesh.ListenerTlsOptions.Builder)
      .certificate(certificate)
      .mode(mode)
      .mutualTlsValidation(mutualTlsValidation.orNull)
      .build()
}
