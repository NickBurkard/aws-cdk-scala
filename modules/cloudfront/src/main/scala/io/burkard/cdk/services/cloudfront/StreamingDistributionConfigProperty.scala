package io.burkard.cdk.services.cloudfront

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StreamingDistributionConfigProperty {

  def apply(
    aliases: Option[List[String]] = None,
    priceClass: Option[String] = None,
    logging: Option[software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.LoggingProperty] = None,
    enabled: Option[Boolean] = None,
    trustedSigners: Option[software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.TrustedSignersProperty] = None,
    s3Origin: Option[software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.S3OriginProperty] = None,
    comment: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty.Builder)
      .aliases(aliases.map(_.asJava).orNull)
      .priceClass(priceClass.orNull)
      .logging(logging.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .trustedSigners(trustedSigners.orNull)
      .s3Origin(s3Origin.orNull)
      .comment(comment.orNull)
      .build()
}
