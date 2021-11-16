package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DistributionProps {

  def apply(
    defaultBehavior: software.amazon.awscdk.services.cloudfront.BehaviorOptions,
    domainNames: Option[List[String]] = None,
    logIncludesCookies: Option[Boolean] = None,
    enabled: Option[Boolean] = None,
    errorResponses: Option[List[_ <: software.amazon.awscdk.services.cloudfront.ErrorResponse]] = None,
    logFilePrefix: Option[String] = None,
    geoRestriction: Option[software.amazon.awscdk.services.cloudfront.GeoRestriction] = None,
    logBucket: Option[software.amazon.awscdk.services.s3.IBucket] = None,
    defaultRootObject: Option[String] = None,
    minimumProtocolVersion: Option[software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol] = None,
    enableIpv6: Option[Boolean] = None,
    certificate: Option[software.amazon.awscdk.services.certificatemanager.ICertificate] = None,
    httpVersion: Option[software.amazon.awscdk.services.cloudfront.HttpVersion] = None,
    priceClass: Option[software.amazon.awscdk.services.cloudfront.PriceClass] = None,
    webAclId: Option[String] = None,
    additionalBehaviors: Option[Map[String, _ <: software.amazon.awscdk.services.cloudfront.BehaviorOptions]] = None,
    comment: Option[String] = None,
    enableLogging: Option[Boolean] = None
  ): software.amazon.awscdk.services.cloudfront.DistributionProps =
    (new software.amazon.awscdk.services.cloudfront.DistributionProps.Builder)
      .defaultBehavior(defaultBehavior)
      .domainNames(domainNames.map(_.asJava).orNull)
      .logIncludesCookies(logIncludesCookies.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .errorResponses(errorResponses.map(_.asJava).orNull)
      .logFilePrefix(logFilePrefix.orNull)
      .geoRestriction(geoRestriction.orNull)
      .logBucket(logBucket.orNull)
      .defaultRootObject(defaultRootObject.orNull)
      .minimumProtocolVersion(minimumProtocolVersion.orNull)
      .enableIpv6(enableIpv6.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .certificate(certificate.orNull)
      .httpVersion(httpVersion.orNull)
      .priceClass(priceClass.orNull)
      .webAclId(webAclId.orNull)
      .additionalBehaviors(additionalBehaviors.map(_.asJava).orNull)
      .comment(comment.orNull)
      .enableLogging(enableLogging.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
