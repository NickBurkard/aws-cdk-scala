package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MeshProps {

  def apply(
    meshName: Option[String] = None,
    egressFilter: Option[software.amazon.awscdk.services.appmesh.MeshFilterType] = None
  ): software.amazon.awscdk.services.appmesh.MeshProps =
    (new software.amazon.awscdk.services.appmesh.MeshProps.Builder)
      .meshName(meshName.orNull)
      .egressFilter(egressFilter.orNull)
      .build()
}
