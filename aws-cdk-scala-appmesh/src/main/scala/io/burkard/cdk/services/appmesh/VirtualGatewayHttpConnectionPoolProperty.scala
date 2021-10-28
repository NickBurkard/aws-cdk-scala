package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualGatewayHttpConnectionPoolProperty {

  def apply(
    maxConnections: Option[Number] = None,
    maxPendingRequests: Option[Number] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttpConnectionPoolProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttpConnectionPoolProperty.Builder)
      .maxConnections(maxConnections.orNull)
      .maxPendingRequests(maxPendingRequests.orNull)
      .build()
}
