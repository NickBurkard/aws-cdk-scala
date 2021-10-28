package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GatewayRouteMetadataMatchProperty {

  def apply(
    regex: Option[String] = None,
    prefix: Option[String] = None,
    suffix: Option[String] = None,
    exact: Option[String] = None,
    range: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteRangeMatchProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteMetadataMatchProperty =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteMetadataMatchProperty.Builder)
      .regex(regex.orNull)
      .prefix(prefix.orNull)
      .suffix(suffix.orNull)
      .exact(exact.orNull)
      .range(range.orNull)
      .build()
}
