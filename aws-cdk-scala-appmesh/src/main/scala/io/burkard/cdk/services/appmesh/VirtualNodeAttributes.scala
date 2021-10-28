package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualNodeAttributes {

  def apply(
    mesh: Option[software.amazon.awscdk.services.appmesh.IMesh] = None,
    virtualNodeName: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.VirtualNodeAttributes =
    (new software.amazon.awscdk.services.appmesh.VirtualNodeAttributes.Builder)
      .mesh(mesh.orNull)
      .virtualNodeName(virtualNodeName.orNull)
      .build()
}
