package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualServiceAttributes {

  def apply(
    mesh: software.amazon.awscdk.services.appmesh.IMesh,
    virtualServiceName: String
  ): software.amazon.awscdk.services.appmesh.VirtualServiceAttributes =
    (new software.amazon.awscdk.services.appmesh.VirtualServiceAttributes.Builder)
      .mesh(mesh)
      .virtualServiceName(virtualServiceName)
      .build()
}
