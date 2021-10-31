package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BackendProperty {

  def apply(
    virtualService: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualServiceBackendProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendProperty.Builder)
      .virtualService(virtualService.orNull)
      .build()
}
