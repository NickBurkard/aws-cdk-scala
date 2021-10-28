package io.burkard.cdk.services.cloudfront

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OriginProperty {

  def apply(
    originShield: Option[software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginShieldProperty] = None,
    domainName: Option[String] = None,
    id: Option[String] = None,
    customOriginConfig: Option[software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty] = None,
    connectionTimeout: Option[Number] = None,
    connectionAttempts: Option[Number] = None,
    originPath: Option[String] = None,
    s3OriginConfig: Option[software.amazon.awscdk.services.cloudfront.CfnDistribution.S3OriginConfigProperty] = None,
    originCustomHeaders: Option[List[_]] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty.Builder)
      .originShield(originShield.orNull)
      .domainName(domainName.orNull)
      .id(id.orNull)
      .customOriginConfig(customOriginConfig.orNull)
      .connectionTimeout(connectionTimeout.orNull)
      .connectionAttempts(connectionAttempts.orNull)
      .originPath(originPath.orNull)
      .s3OriginConfig(s3OriginConfig.orNull)
      .originCustomHeaders(originCustomHeaders.map(_.asJava).orNull)
      .build()
}
