package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3OriginConfig {

  def apply(
    s3BucketSource: software.amazon.awscdk.services.s3.IBucket,
    originAccessIdentity: Option[software.amazon.awscdk.services.cloudfront.IOriginAccessIdentity] = None,
    originShieldRegion: Option[String] = None,
    originHeaders: Option[Map[String, String]] = None,
    originPath: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.S3OriginConfig =
    (new software.amazon.awscdk.services.cloudfront.S3OriginConfig.Builder)
      .s3BucketSource(s3BucketSource)
      .originAccessIdentity(originAccessIdentity.orNull)
      .originShieldRegion(originShieldRegion.orNull)
      .originHeaders(originHeaders.map(_.asJava).orNull)
      .originPath(originPath.orNull)
      .build()
}
