package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpGatewayRouteMatch {

  def apply(
    method: Option[software.amazon.awscdk.services.appmesh.HttpRouteMethod] = None,
    queryParameters: Option[List[_ <: software.amazon.awscdk.services.appmesh.QueryParameterMatch]] = None,
    headers: Option[List[_ <: software.amazon.awscdk.services.appmesh.HeaderMatch]] = None,
    path: Option[software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatch] = None,
    hostname: Option[software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatch] = None,
    rewriteRequestHostname: Option[Boolean] = None
  ): software.amazon.awscdk.services.appmesh.HttpGatewayRouteMatch =
    (new software.amazon.awscdk.services.appmesh.HttpGatewayRouteMatch.Builder)
      .method(method.orNull)
      .queryParameters(queryParameters.map(_.asJava).orNull)
      .headers(headers.map(_.asJava).orNull)
      .path(path.orNull)
      .hostname(hostname.orNull)
      .rewriteRequestHostname(rewriteRequestHostname.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
