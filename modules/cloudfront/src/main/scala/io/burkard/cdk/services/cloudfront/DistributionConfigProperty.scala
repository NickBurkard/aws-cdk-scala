package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DistributionConfigProperty {

  def apply(
    aliases: Option[List[String]] = None,
    cacheBehaviors: Option[List[_]] = None,
    enabled: Option[Boolean] = None,
    restrictions: Option[software.amazon.awscdk.services.cloudfront.CfnDistribution.RestrictionsProperty] = None,
    customErrorResponses: Option[List[_]] = None,
    viewerCertificate: Option[software.amazon.awscdk.services.cloudfront.CfnDistribution.ViewerCertificateProperty] = None,
    webAclId: Option[String] = None,
    defaultCacheBehavior: Option[software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty] = None,
    customOrigin: Option[software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyCustomOriginProperty] = None,
    httpVersion: Option[String] = None,
    priceClass: Option[String] = None,
    ipv6Enabled: Option[Boolean] = None,
    logging: Option[software.amazon.awscdk.services.cloudfront.CfnDistribution.LoggingProperty] = None,
    s3Origin: Option[software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyS3OriginProperty] = None,
    comment: Option[String] = None,
    originGroups: Option[software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupsProperty] = None,
    origins: Option[List[_]] = None,
    cnamEs: Option[List[String]] = None,
    defaultRootObject: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder)
      .aliases(aliases.map(_.asJava).orNull)
      .cacheBehaviors(cacheBehaviors.map(_.asJava).orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .restrictions(restrictions.orNull)
      .customErrorResponses(customErrorResponses.map(_.asJava).orNull)
      .viewerCertificate(viewerCertificate.orNull)
      .webAclId(webAclId.orNull)
      .defaultCacheBehavior(defaultCacheBehavior.orNull)
      .customOrigin(customOrigin.orNull)
      .httpVersion(httpVersion.orNull)
      .priceClass(priceClass.orNull)
      .ipv6Enabled(ipv6Enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .logging(logging.orNull)
      .s3Origin(s3Origin.orNull)
      .comment(comment.orNull)
      .originGroups(originGroups.orNull)
      .origins(origins.map(_.asJava).orNull)
      .cnamEs(cnamEs.map(_.asJava).orNull)
      .defaultRootObject(defaultRootObject.orNull)
      .build()
}
