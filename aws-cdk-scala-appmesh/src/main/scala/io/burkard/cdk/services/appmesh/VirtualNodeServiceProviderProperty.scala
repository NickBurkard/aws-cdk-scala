package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualNodeServiceProviderProperty {

  def apply(
    virtualNodeName: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualNodeServiceProviderProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualNodeServiceProviderProperty.Builder)
      .virtualNodeName(virtualNodeName.orNull)
      .build()
}
