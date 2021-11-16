package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualGatewayHttpConnectionPoolProperty {

  def apply(
    maxConnections: Number,
    maxPendingRequests: Option[Number] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttpConnectionPoolProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttpConnectionPoolProperty.Builder)
      .maxConnections(maxConnections)
      .maxPendingRequests(maxPendingRequests.orNull)
      .build()
}
