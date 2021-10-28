package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualGatewayAttributes {

  def apply(
    mesh: Option[software.amazon.awscdk.services.appmesh.IMesh] = None,
    virtualGatewayName: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.VirtualGatewayAttributes =
    (new software.amazon.awscdk.services.appmesh.VirtualGatewayAttributes.Builder)
      .mesh(mesh.orNull)
      .virtualGatewayName(virtualGatewayName.orNull)
      .build()
}
