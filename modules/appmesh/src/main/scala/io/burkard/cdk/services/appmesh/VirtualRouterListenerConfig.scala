package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualRouterListenerConfig {

  def apply(
    listener: software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterListenerProperty
  ): software.amazon.awscdk.services.appmesh.VirtualRouterListenerConfig =
    (new software.amazon.awscdk.services.appmesh.VirtualRouterListenerConfig.Builder)
      .listener(listener)
      .build()
}
