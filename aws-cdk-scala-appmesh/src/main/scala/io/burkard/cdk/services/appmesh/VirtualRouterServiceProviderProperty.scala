package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualRouterServiceProviderProperty {

  def apply(
    virtualRouterName: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualRouterServiceProviderProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualRouterServiceProviderProperty.Builder)
      .virtualRouterName(virtualRouterName.orNull)
      .build()
}
