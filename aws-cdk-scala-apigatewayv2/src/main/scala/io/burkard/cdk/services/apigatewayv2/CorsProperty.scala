package io.burkard.cdk.services.apigatewayv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CorsProperty {

  def apply(
    allowHeaders: Option[List[String]] = None,
    exposeHeaders: Option[List[String]] = None,
    allowCredentials: Option[Boolean] = None,
    allowOrigins: Option[List[String]] = None,
    allowMethods: Option[List[String]] = None,
    maxAge: Option[Number] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnApi.CorsProperty =
    (new software.amazon.awscdk.services.apigatewayv2.CfnApi.CorsProperty.Builder)
      .allowHeaders(allowHeaders.map(_.asJava).orNull)
      .exposeHeaders(exposeHeaders.map(_.asJava).orNull)
      .allowCredentials(allowCredentials.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .allowOrigins(allowOrigins.map(_.asJava).orNull)
      .allowMethods(allowMethods.map(_.asJava).orNull)
      .maxAge(maxAge.orNull)
      .build()
}
