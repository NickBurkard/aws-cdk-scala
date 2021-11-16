package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualGatewayListenerTlsProperty {

  def apply(
    certificate: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsCertificateProperty,
    mode: String,
    validation: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsProperty.Builder)
      .certificate(certificate)
      .mode(mode)
      .validation(validation.orNull)
      .build()
}
