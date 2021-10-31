package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ListenerTlsProperty {

  def apply(
    certificate: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsCertificateProperty] = None,
    mode: Option[String] = None,
    validation: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsProperty.Builder)
      .certificate(certificate.orNull)
      .mode(mode.orNull)
      .validation(validation.orNull)
      .build()
}
