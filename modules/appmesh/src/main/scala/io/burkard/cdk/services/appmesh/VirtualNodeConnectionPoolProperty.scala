package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualNodeConnectionPoolProperty {

  def apply(
    grpc: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty] = None,
    tcp: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty] = None,
    http2: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty] = None,
    http: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttpConnectionPoolProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeConnectionPoolProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeConnectionPoolProperty.Builder)
      .grpc(grpc.orNull)
      .tcp(tcp.orNull)
      .http2(http2.orNull)
      .http(http.orNull)
      .build()
}
