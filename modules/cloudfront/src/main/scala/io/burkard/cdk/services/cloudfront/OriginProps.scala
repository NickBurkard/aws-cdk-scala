package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OriginProps {

  def apply(
    originShieldRegion: Option[String] = None,
    connectionTimeout: Option[software.amazon.awscdk.Duration] = None,
    customHeaders: Option[Map[String, String]] = None,
    connectionAttempts: Option[Number] = None,
    originPath: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.OriginProps =
    (new software.amazon.awscdk.services.cloudfront.OriginProps.Builder)
      .originShieldRegion(originShieldRegion.orNull)
      .connectionTimeout(connectionTimeout.orNull)
      .customHeaders(customHeaders.map(_.asJava).orNull)
      .connectionAttempts(connectionAttempts.orNull)
      .originPath(originPath.orNull)
      .build()
}
