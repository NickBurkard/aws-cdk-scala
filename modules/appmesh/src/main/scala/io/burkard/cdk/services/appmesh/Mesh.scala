package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Mesh {

  def apply(
    internalResourceId: String,
    meshName: Option[String] = None,
    egressFilter: Option[software.amazon.awscdk.services.appmesh.MeshFilterType] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appmesh.Mesh =
    software.amazon.awscdk.services.appmesh.Mesh.Builder
      .create(stackCtx, internalResourceId)
      .meshName(meshName.orNull)
      .egressFilter(egressFilter.orNull)
      .build()
}
