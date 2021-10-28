package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualGatewayListenerTlsFileCertificateProperty {

  def apply(
    privateKey: Option[String] = None,
    certificateChain: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsFileCertificateProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsFileCertificateProperty.Builder)
      .privateKey(privateKey.orNull)
      .certificateChain(certificateChain.orNull)
      .build()
}
