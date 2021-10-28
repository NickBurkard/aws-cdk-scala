package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualGatewayHttp2ConnectionPoolProperty {

  def apply(
    maxRequests: Option[Number] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty.Builder)
      .maxRequests(maxRequests.orNull)
      .build()
}
