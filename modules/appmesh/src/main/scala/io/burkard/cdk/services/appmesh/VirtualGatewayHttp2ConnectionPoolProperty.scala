package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualGatewayHttp2ConnectionPoolProperty {

  def apply(
    maxRequests: Number
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty.Builder)
      .maxRequests(maxRequests)
      .build()
}
