package io.burkard.cdk.services.cloudfront

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3OriginConfig {

  def apply(
    s3BucketSource: Option[software.amazon.awscdk.services.s3.IBucket] = None,
    originAccessIdentity: Option[software.amazon.awscdk.services.cloudfront.IOriginAccessIdentity] = None,
    originShieldRegion: Option[String] = None,
    originHeaders: Option[Map[String, String]] = None,
    originPath: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.S3OriginConfig =
    (new software.amazon.awscdk.services.cloudfront.S3OriginConfig.Builder)
      .s3BucketSource(s3BucketSource.orNull)
      .originAccessIdentity(originAccessIdentity.orNull)
      .originShieldRegion(originShieldRegion.orNull)
      .originHeaders(originHeaders.map(_.asJava).orNull)
      .originPath(originPath.orNull)
      .build()
}
