package io.burkard.cdk.services.s3

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CorsRuleProperty {

  def apply(
    allowedMethods: Option[List[String]] = None,
    exposedHeaders: Option[List[String]] = None,
    id: Option[String] = None,
    allowedHeaders: Option[List[String]] = None,
    maxAge: Option[Number] = None,
    allowedOrigins: Option[List[String]] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.CorsRuleProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.CorsRuleProperty.Builder)
      .allowedMethods(allowedMethods.map(_.asJava).orNull)
      .exposedHeaders(exposedHeaders.map(_.asJava).orNull)
      .id(id.orNull)
      .allowedHeaders(allowedHeaders.map(_.asJava).orNull)
      .maxAge(maxAge.orNull)
      .allowedOrigins(allowedOrigins.map(_.asJava).orNull)
      .build()
}
