package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResponseHeadersCorsBehavior {

  def apply(
    accessControlAllowOrigins: List[String],
    accessControlAllowHeaders: List[String],
    accessControlAllowCredentials: Boolean,
    originOverride: Boolean,
    accessControlAllowMethods: List[String],
    accessControlMaxAge: Option[software.amazon.awscdk.Duration] = None,
    accessControlExposeHeaders: Option[List[String]] = None
  ): software.amazon.awscdk.services.cloudfront.ResponseHeadersCorsBehavior =
    (new software.amazon.awscdk.services.cloudfront.ResponseHeadersCorsBehavior.Builder)
      .accessControlAllowOrigins(accessControlAllowOrigins.asJava)
      .accessControlAllowHeaders(accessControlAllowHeaders.asJava)
      .accessControlAllowCredentials(accessControlAllowCredentials)
      .originOverride(originOverride)
      .accessControlAllowMethods(accessControlAllowMethods.asJava)
      .accessControlMaxAge(accessControlMaxAge.orNull)
      .accessControlExposeHeaders(accessControlExposeHeaders.map(_.asJava).orNull)
      .build()
}
