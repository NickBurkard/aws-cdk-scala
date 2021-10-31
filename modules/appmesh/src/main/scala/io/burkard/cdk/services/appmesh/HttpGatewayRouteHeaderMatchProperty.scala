package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpGatewayRouteHeaderMatchProperty {

  def apply(
    regex: Option[String] = None,
    prefix: Option[String] = None,
    suffix: Option[String] = None,
    exact: Option[String] = None,
    range: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteRangeMatchProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteHeaderMatchProperty =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteHeaderMatchProperty.Builder)
      .regex(regex.orNull)
      .prefix(prefix.orNull)
      .suffix(suffix.orNull)
      .exact(exact.orNull)
      .range(range.orNull)
      .build()
}
