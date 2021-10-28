package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualRouterAttributes {

  def apply(
    virtualRouterName: Option[String] = None,
    mesh: Option[software.amazon.awscdk.services.appmesh.IMesh] = None
  ): software.amazon.awscdk.services.appmesh.VirtualRouterAttributes =
    (new software.amazon.awscdk.services.appmesh.VirtualRouterAttributes.Builder)
      .virtualRouterName(virtualRouterName.orNull)
      .mesh(mesh.orNull)
      .build()
}
