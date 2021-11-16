package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualGatewayListenerTlsFileCertificateProperty {

  def apply(
    privateKey: String,
    certificateChain: String
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsFileCertificateProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsFileCertificateProperty.Builder)
      .privateKey(privateKey)
      .certificateChain(certificateChain)
      .build()
}
