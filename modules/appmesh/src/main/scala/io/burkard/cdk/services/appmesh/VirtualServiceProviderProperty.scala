package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualServiceProviderProperty {

  def apply(
    virtualNode: Option[software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualNodeServiceProviderProperty] = None,
    virtualRouter: Option[software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualRouterServiceProviderProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceProviderProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceProviderProperty.Builder)
      .virtualNode(virtualNode.orNull)
      .virtualRouter(virtualRouter.orNull)
      .build()
}
