package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualGatewayTlsValidationContextSdsTrustProperty {

  def apply(
    secretName: String
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextSdsTrustProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextSdsTrustProperty.Builder)
      .secretName(secretName)
      .build()
}
