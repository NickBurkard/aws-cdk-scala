package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualRouterAttributes {

  def apply(
    virtualRouterName: String,
    mesh: software.amazon.awscdk.services.appmesh.IMesh
  ): software.amazon.awscdk.services.appmesh.VirtualRouterAttributes =
    (new software.amazon.awscdk.services.appmesh.VirtualRouterAttributes.Builder)
      .virtualRouterName(virtualRouterName)
      .mesh(mesh)
      .build()
}
