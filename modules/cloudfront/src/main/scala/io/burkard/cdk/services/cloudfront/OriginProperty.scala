package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OriginProperty {

  def apply(
    domainName: String,
    id: String,
    originShield: Option[software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginShieldProperty] = None,
    customOriginConfig: Option[software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty] = None,
    connectionTimeout: Option[Number] = None,
    connectionAttempts: Option[Number] = None,
    originPath: Option[String] = None,
    s3OriginConfig: Option[software.amazon.awscdk.services.cloudfront.CfnDistribution.S3OriginConfigProperty] = None,
    originCustomHeaders: Option[List[_]] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty.Builder)
      .domainName(domainName)
      .id(id)
      .originShield(originShield.orNull)
      .customOriginConfig(customOriginConfig.orNull)
      .connectionTimeout(connectionTimeout.orNull)
      .connectionAttempts(connectionAttempts.orNull)
      .originPath(originPath.orNull)
      .s3OriginConfig(s3OriginConfig.orNull)
      .originCustomHeaders(originCustomHeaders.map(_.asJava).orNull)
      .build()
}
