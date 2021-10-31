package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3OriginProps {

  def apply(
    originAccessIdentity: Option[software.amazon.awscdk.services.cloudfront.IOriginAccessIdentity] = None,
    originShieldRegion: Option[String] = None,
    connectionTimeout: Option[software.amazon.awscdk.Duration] = None,
    customHeaders: Option[Map[String, String]] = None,
    connectionAttempts: Option[Number] = None,
    originPath: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.origins.S3OriginProps =
    (new software.amazon.awscdk.services.cloudfront.origins.S3OriginProps.Builder)
      .originAccessIdentity(originAccessIdentity.orNull)
      .originShieldRegion(originShieldRegion.orNull)
      .connectionTimeout(connectionTimeout.orNull)
      .customHeaders(customHeaders.map(_.asJava).orNull)
      .connectionAttempts(connectionAttempts.orNull)
      .originPath(originPath.orNull)
      .build()
}
