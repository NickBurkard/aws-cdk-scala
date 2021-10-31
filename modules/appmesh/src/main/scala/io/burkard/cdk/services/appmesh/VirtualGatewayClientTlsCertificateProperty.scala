package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualGatewayClientTlsCertificateProperty {

  def apply(
    sds: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsSdsCertificateProperty] = None,
    file: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsFileCertificateProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientTlsCertificateProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientTlsCertificateProperty.Builder)
      .sds(sds.orNull)
      .file(file.orNull)
      .build()
}
