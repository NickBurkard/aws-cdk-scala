package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualGatewayAttributes {

  def apply(
    mesh: software.amazon.awscdk.services.appmesh.IMesh,
    virtualGatewayName: String
  ): software.amazon.awscdk.services.appmesh.VirtualGatewayAttributes =
    (new software.amazon.awscdk.services.appmesh.VirtualGatewayAttributes.Builder)
      .mesh(mesh)
      .virtualGatewayName(virtualGatewayName)
      .build()
}
