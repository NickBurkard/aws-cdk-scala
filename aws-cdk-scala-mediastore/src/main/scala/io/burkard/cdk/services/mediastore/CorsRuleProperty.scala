package io.burkard.cdk.services.mediastore

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
