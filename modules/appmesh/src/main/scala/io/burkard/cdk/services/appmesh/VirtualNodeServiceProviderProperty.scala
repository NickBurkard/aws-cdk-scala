package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualNodeServiceProviderProperty {

  def apply(
    virtualNodeName: String
  ): software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualNodeServiceProviderProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualNodeServiceProviderProperty.Builder)
      .virtualNodeName(virtualNodeName)
      .build()
}
