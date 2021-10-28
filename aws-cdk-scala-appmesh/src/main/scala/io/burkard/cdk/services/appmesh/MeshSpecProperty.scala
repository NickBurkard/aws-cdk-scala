package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MeshSpecProperty {

  def apply(
    egressFilter: Option[software.amazon.awscdk.services.appmesh.CfnMesh.EgressFilterProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnMesh.MeshSpecProperty =
    (new software.amazon.awscdk.services.appmesh.CfnMesh.MeshSpecProperty.Builder)
      .egressFilter(egressFilter.orNull)
      .build()
}
