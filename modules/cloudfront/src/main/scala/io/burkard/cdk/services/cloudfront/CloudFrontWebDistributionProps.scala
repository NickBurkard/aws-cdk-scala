package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CloudFrontWebDistributionProps {

  def apply(
    originConfigs: Option[List[_ <: software.amazon.awscdk.services.cloudfront.SourceConfiguration]] = None,
    enabled: Option[Boolean] = None,
    errorConfigurations: Option[List[_ <: software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomErrorResponseProperty]] = None,
    comment: Option[String] = None,
    loggingConfig: Option[software.amazon.awscdk.services.cloudfront.LoggingConfiguration] = None,
    defaultRootObject: Option[String] = None,
    enableIpV6: Option[Boolean] = None,
    httpVersion: Option[software.amazon.awscdk.services.cloudfront.HttpVersion] = None,
    priceClass: Option[software.amazon.awscdk.services.cloudfront.PriceClass] = None,
    geoRestriction: Option[software.amazon.awscdk.services.cloudfront.GeoRestriction] = None,
    viewerCertificate: Option[software.amazon.awscdk.services.cloudfront.ViewerCertificate] = None,
    webAclId: Option[String] = None,
    viewerProtocolPolicy: Option[software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy] = None
  ): software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps =
    (new software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps.Builder)
      .originConfigs(originConfigs.map(_.asJava).orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .errorConfigurations(errorConfigurations.map(_.asJava).orNull)
      .comment(comment.orNull)
      .loggingConfig(loggingConfig.orNull)
      .defaultRootObject(defaultRootObject.orNull)
      .enableIpV6(enableIpV6.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .httpVersion(httpVersion.orNull)
      .priceClass(priceClass.orNull)
      .geoRestriction(geoRestriction.orNull)
      .viewerCertificate(viewerCertificate.orNull)
      .webAclId(webAclId.orNull)
      .viewerProtocolPolicy(viewerProtocolPolicy.orNull)
      .build()
}
