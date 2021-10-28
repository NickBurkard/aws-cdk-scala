package io.burkard.cdk.services.appmesh

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HttpGatewayRouteMatchProperty {

  def apply(
    method: Option[String] = None,
    prefix: Option[String] = None,
    queryParameters: Option[List[_]] = None,
    headers: Option[List[_]] = None,
    path: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpPathMatchProperty] = None,
    hostname: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameMatchProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteMatchProperty =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteMatchProperty.Builder)
      .method(method.orNull)
      .prefix(prefix.orNull)
      .queryParameters(queryParameters.map(_.asJava).orNull)
      .headers(headers.map(_.asJava).orNull)
      .path(path.orNull)
      .hostname(hostname.orNull)
      .build()
}
