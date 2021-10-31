package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ListenerTimeoutProperty {

  def apply(
    grpc: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.GrpcTimeoutProperty] = None,
    tcp: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.TcpTimeoutProperty] = None,
    http2: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.HttpTimeoutProperty] = None,
    http: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.HttpTimeoutProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTimeoutProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTimeoutProperty.Builder)
      .grpc(grpc.orNull)
      .tcp(tcp.orNull)
      .http2(http2.orNull)
      .http(http.orNull)
      .build()
}
