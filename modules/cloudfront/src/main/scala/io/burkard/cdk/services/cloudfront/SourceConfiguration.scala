package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SourceConfiguration {

  def apply(
    behaviors: List[_ <: software.amazon.awscdk.services.cloudfront.Behavior],
    failoverCriteriaStatusCodes: Option[List[_ <: software.amazon.awscdk.services.cloudfront.FailoverStatusCode]] = None,
    customOriginSource: Option[software.amazon.awscdk.services.cloudfront.CustomOriginConfig] = None,
    s3OriginSource: Option[software.amazon.awscdk.services.cloudfront.S3OriginConfig] = None,
    originShieldRegion: Option[String] = None,
    connectionTimeout: Option[software.amazon.awscdk.Duration] = None,
    originHeaders: Option[Map[String, String]] = None,
    failoverCustomOriginSource: Option[software.amazon.awscdk.services.cloudfront.CustomOriginConfig] = None,
    originPath: Option[String] = None,
    failoverS3OriginSource: Option[software.amazon.awscdk.services.cloudfront.S3OriginConfig] = None,
    connectionAttempts: Option[Number] = None
  ): software.amazon.awscdk.services.cloudfront.SourceConfiguration =
    (new software.amazon.awscdk.services.cloudfront.SourceConfiguration.Builder)
      .behaviors(behaviors.asJava)
      .failoverCriteriaStatusCodes(failoverCriteriaStatusCodes.map(_.asJava).orNull)
      .customOriginSource(customOriginSource.orNull)
      .s3OriginSource(s3OriginSource.orNull)
      .originShieldRegion(originShieldRegion.orNull)
      .connectionTimeout(connectionTimeout.orNull)
      .originHeaders(originHeaders.map(_.asJava).orNull)
      .failoverCustomOriginSource(failoverCustomOriginSource.orNull)
      .originPath(originPath.orNull)
      .failoverS3OriginSource(failoverS3OriginSource.orNull)
      .connectionAttempts(connectionAttempts.orNull)
      .build()
}
