package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualGatewayTlsValidationContextFileTrustProperty {

  def apply(
    certificateChain: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextFileTrustProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextFileTrustProperty.Builder)
      .certificateChain(certificateChain.orNull)
      .build()
}
