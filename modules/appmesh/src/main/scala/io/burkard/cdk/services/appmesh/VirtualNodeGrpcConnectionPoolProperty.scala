package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualNodeGrpcConnectionPoolProperty {

  def apply(
    maxRequests: Option[Number] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty.Builder)
      .maxRequests(maxRequests.orNull)
      .build()
}
