package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualServiceProviderConfig {

  def apply(
    virtualRouterProvider: Option[software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualRouterServiceProviderProperty] = None,
    virtualNodeProvider: Option[software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualNodeServiceProviderProperty] = None,
    mesh: Option[software.amazon.awscdk.services.appmesh.IMesh] = None
  ): software.amazon.awscdk.services.appmesh.VirtualServiceProviderConfig =
    (new software.amazon.awscdk.services.appmesh.VirtualServiceProviderConfig.Builder)
      .virtualRouterProvider(virtualRouterProvider.orNull)
      .virtualNodeProvider(virtualNodeProvider.orNull)
      .mesh(mesh.orNull)
      .build()
}
