package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualRouterServiceProviderProperty {

  def apply(
    virtualRouterName: String
  ): software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualRouterServiceProviderProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualRouterServiceProviderProperty.Builder)
      .virtualRouterName(virtualRouterName)
      .build()
}
