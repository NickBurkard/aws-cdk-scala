package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CorsOptions {

  def apply(
    statusCode: Option[Number] = None,
    disableCache: Option[Boolean] = None,
    allowHeaders: Option[List[String]] = None,
    exposeHeaders: Option[List[String]] = None,
    allowCredentials: Option[Boolean] = None,
    allowOrigins: Option[List[String]] = None,
    allowMethods: Option[List[String]] = None,
    maxAge: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.apigateway.CorsOptions =
    (new software.amazon.awscdk.services.apigateway.CorsOptions.Builder)
      .statusCode(statusCode.orNull)
      .disableCache(disableCache.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .allowHeaders(allowHeaders.map(_.asJava).orNull)
      .exposeHeaders(exposeHeaders.map(_.asJava).orNull)
      .allowCredentials(allowCredentials.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .allowOrigins(allowOrigins.map(_.asJava).orNull)
      .allowMethods(allowMethods.map(_.asJava).orNull)
      .maxAge(maxAge.orNull)
      .build()
}
