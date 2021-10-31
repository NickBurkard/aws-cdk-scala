package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualGatewayListenerTlsProperty {

  def apply(
    certificate: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsCertificateProperty] = None,
    mode: Option[String] = None,
    validation: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsProperty.Builder)
      .certificate(certificate.orNull)
      .mode(mode.orNull)
      .validation(validation.orNull)
      .build()
}
