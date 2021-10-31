package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualGatewayGrpcConnectionPoolProperty {

  def apply(
    maxRequests: Option[Number] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayGrpcConnectionPoolProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayGrpcConnectionPoolProperty.Builder)
      .maxRequests(maxRequests.orNull)
      .build()
}
