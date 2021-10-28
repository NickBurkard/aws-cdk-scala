package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualGatewayFileAccessLogProperty {

  def apply(
    path: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayFileAccessLogProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayFileAccessLogProperty.Builder)
      .path(path.orNull)
      .build()
}
