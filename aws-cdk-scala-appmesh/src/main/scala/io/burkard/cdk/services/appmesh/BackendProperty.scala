package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BackendProperty {

  def apply(
    virtualService: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualServiceBackendProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendProperty.Builder)
      .virtualService(virtualService.orNull)
      .build()
}
