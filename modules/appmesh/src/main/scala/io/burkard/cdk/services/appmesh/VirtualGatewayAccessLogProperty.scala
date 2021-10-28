package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualGatewayAccessLogProperty {

  def apply(
    file: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayFileAccessLogProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayAccessLogProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayAccessLogProperty.Builder)
      .file(file.orNull)
      .build()
}
