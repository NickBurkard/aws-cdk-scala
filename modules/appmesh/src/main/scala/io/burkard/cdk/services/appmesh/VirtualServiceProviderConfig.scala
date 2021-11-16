package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualServiceProviderConfig {

  def apply(
    mesh: software.amazon.awscdk.services.appmesh.IMesh,
    virtualRouterProvider: Option[software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualRouterServiceProviderProperty] = None,
    virtualNodeProvider: Option[software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualNodeServiceProviderProperty] = None
  ): software.amazon.awscdk.services.appmesh.VirtualServiceProviderConfig =
    (new software.amazon.awscdk.services.appmesh.VirtualServiceProviderConfig.Builder)
      .mesh(mesh)
      .virtualRouterProvider(virtualRouterProvider.orNull)
      .virtualNodeProvider(virtualNodeProvider.orNull)
      .build()
}
