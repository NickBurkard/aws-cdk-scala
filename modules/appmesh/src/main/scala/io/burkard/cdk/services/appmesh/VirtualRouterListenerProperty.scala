package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualRouterListenerProperty {

  def apply(
    portMapping: software.amazon.awscdk.services.appmesh.CfnVirtualRouter.PortMappingProperty
  ): software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterListenerProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterListenerProperty.Builder)
      .portMapping(portMapping)
      .build()
}
