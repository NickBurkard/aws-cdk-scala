package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualNodeHttpConnectionPoolProperty {

  def apply(
    maxConnections: Option[Number] = None,
    maxPendingRequests: Option[Number] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttpConnectionPoolProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttpConnectionPoolProperty.Builder)
      .maxConnections(maxConnections.orNull)
      .maxPendingRequests(maxPendingRequests.orNull)
      .build()
}
