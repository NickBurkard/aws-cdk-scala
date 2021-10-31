package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualServiceAttributes {

  def apply(
    mesh: Option[software.amazon.awscdk.services.appmesh.IMesh] = None,
    virtualServiceName: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.VirtualServiceAttributes =
    (new software.amazon.awscdk.services.appmesh.VirtualServiceAttributes.Builder)
      .mesh(mesh.orNull)
      .virtualServiceName(virtualServiceName.orNull)
      .build()
}
