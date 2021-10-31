package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HttpRouteMatchProperty {

  def apply(
    method: Option[String] = None,
    path: Option[software.amazon.awscdk.services.appmesh.CfnRoute.HttpPathMatchProperty] = None,
    prefix: Option[String] = None,
    scheme: Option[String] = None,
    queryParameters: Option[List[_]] = None,
    headers: Option[List[_]] = None
  ): software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteMatchProperty =
    (new software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteMatchProperty.Builder)
      .method(method.orNull)
      .path(path.orNull)
      .prefix(prefix.orNull)
      .scheme(scheme.orNull)
      .queryParameters(queryParameters.map(_.asJava).orNull)
      .headers(headers.map(_.asJava).orNull)
      .build()
}
