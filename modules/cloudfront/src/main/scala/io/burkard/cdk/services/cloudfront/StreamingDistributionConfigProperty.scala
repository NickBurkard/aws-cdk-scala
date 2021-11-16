package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StreamingDistributionConfigProperty {

  def apply(
    enabled: Boolean,
    trustedSigners: software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.TrustedSignersProperty,
    s3Origin: software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.S3OriginProperty,
    comment: String,
    aliases: Option[List[String]] = None,
    priceClass: Option[String] = None,
    logging: Option[software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.LoggingProperty] = None
  ): software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty.Builder)
      .enabled(enabled)
      .trustedSigners(trustedSigners)
      .s3Origin(s3Origin)
      .comment(comment)
      .aliases(aliases.map(_.asJava).orNull)
      .priceClass(priceClass.orNull)
      .logging(logging.orNull)
      .build()
}
