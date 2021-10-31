package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
