package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualGatewayListenerTlsSdsCertificateProperty {

  def apply(
    secretName: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsSdsCertificateProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsSdsCertificateProperty.Builder)
      .secretName(secretName.orNull)
      .build()
}
