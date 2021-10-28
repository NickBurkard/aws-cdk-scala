package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TcpRouteProperty {

  def apply(
    timeout: Option[software.amazon.awscdk.services.appmesh.CfnRoute.TcpTimeoutProperty] = None,
    action: Option[software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteActionProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteProperty =
    (new software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteProperty.Builder)
      .timeout(timeout.orNull)
      .action(action.orNull)
      .build()
}
