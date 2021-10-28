package io.burkard.cdk.services.appmesh

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HttpRouteMatch {

  def apply(
    method: Option[software.amazon.awscdk.services.appmesh.HttpRouteMethod] = None,
    path: Option[software.amazon.awscdk.services.appmesh.HttpRoutePathMatch] = None,
    queryParameters: Option[List[_ <: software.amazon.awscdk.services.appmesh.QueryParameterMatch]] = None,
    headers: Option[List[_ <: software.amazon.awscdk.services.appmesh.HeaderMatch]] = None,
    protocol: Option[software.amazon.awscdk.services.appmesh.HttpRouteProtocol] = None
  ): software.amazon.awscdk.services.appmesh.HttpRouteMatch =
    (new software.amazon.awscdk.services.appmesh.HttpRouteMatch.Builder)
      .method(method.orNull)
      .path(path.orNull)
      .queryParameters(queryParameters.map(_.asJava).orNull)
      .headers(headers.map(_.asJava).orNull)
      .protocol(protocol.orNull)
      .build()
}