package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualNodeAttributes {

  def apply(
    mesh: software.amazon.awscdk.services.appmesh.IMesh,
    virtualNodeName: String
  ): software.amazon.awscdk.services.appmesh.VirtualNodeAttributes =
    (new software.amazon.awscdk.services.appmesh.VirtualNodeAttributes.Builder)
      .mesh(mesh)
      .virtualNodeName(virtualNodeName)
      .build()
}
