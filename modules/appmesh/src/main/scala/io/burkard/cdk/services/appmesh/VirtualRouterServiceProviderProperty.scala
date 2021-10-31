package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualRouterServiceProviderProperty {

  def apply(
    virtualRouterName: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualRouterServiceProviderProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualRouterServiceProviderProperty.Builder)
      .virtualRouterName(virtualRouterName.orNull)
      .build()
}
