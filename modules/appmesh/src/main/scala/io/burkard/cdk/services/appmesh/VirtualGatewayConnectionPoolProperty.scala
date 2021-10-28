package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualGatewayConnectionPoolProperty {

  def apply(
    grpc: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayGrpcConnectionPoolProperty] = None,
    http2: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty] = None,
    http: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttpConnectionPoolProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayConnectionPoolProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayConnectionPoolProperty.Builder)
      .grpc(grpc.orNull)
      .http2(http2.orNull)
      .http(http.orNull)
      .build()
}
