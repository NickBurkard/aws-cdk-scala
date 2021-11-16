package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualNodeHttp2ConnectionPoolProperty {

  def apply(
    maxRequests: Number
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty.Builder)
      .maxRequests(maxRequests)
      .build()
}
