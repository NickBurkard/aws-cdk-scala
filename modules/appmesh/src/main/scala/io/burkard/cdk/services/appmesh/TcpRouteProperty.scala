package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TcpRouteProperty {

  def apply(
    action: software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteActionProperty,
    timeout: Option[software.amazon.awscdk.services.appmesh.CfnRoute.TcpTimeoutProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteProperty =
    (new software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteProperty.Builder)
      .action(action)
      .timeout(timeout.orNull)
      .build()
}
