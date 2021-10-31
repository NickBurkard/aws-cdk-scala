package io.burkard.cdk.services.mediastore

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CorsRuleProperty {

  def apply(
    allowedMethods: Option[List[String]] = None,
    exposeHeaders: Option[List[String]] = None,
    allowedOrigins: Option[List[String]] = None,
    maxAgeSeconds: Option[Number] = None,
    allowedHeaders: Option[List[String]] = None
  ): software.amazon.awscdk.services.mediastore.CfnContainer.CorsRuleProperty =
    (new software.amazon.awscdk.services.mediastore.CfnContainer.CorsRuleProperty.Builder)
      .allowedMethods(allowedMethods.map(_.asJava).orNull)
      .exposeHeaders(exposeHeaders.map(_.asJava).orNull)
      .allowedOrigins(allowedOrigins.map(_.asJava).orNull)
      .maxAgeSeconds(maxAgeSeconds.orNull)
      .allowedHeaders(allowedHeaders.map(_.asJava).orNull)
      .build()
}
