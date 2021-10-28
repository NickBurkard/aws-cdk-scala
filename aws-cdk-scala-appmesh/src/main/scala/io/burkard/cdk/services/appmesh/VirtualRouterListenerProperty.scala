package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualRouterListenerProperty {

  def apply(
    portMapping: Option[software.amazon.awscdk.services.appmesh.CfnVirtualRouter.PortMappingProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterListenerProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterListenerProperty.Builder)
      .portMapping(portMapping.orNull)
      .build()
}
