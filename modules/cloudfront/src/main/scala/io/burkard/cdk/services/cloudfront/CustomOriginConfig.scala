package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomOriginConfig {

  def apply(
    domainName: String,
    httpsPort: Option[Number] = None,
    originReadTimeout: Option[software.amazon.awscdk.Duration] = None,
    originShieldRegion: Option[String] = None,
    originHeaders: Option[Map[String, String]] = None,
    originPath: Option[String] = None,
    allowedOriginSslVersions: Option[List[_ <: software.amazon.awscdk.services.cloudfront.OriginSslPolicy]] = None,
    originKeepaliveTimeout: Option[software.amazon.awscdk.Duration] = None,
    originProtocolPolicy: Option[software.amazon.awscdk.services.cloudfront.OriginProtocolPolicy] = None,
    httpPort: Option[Number] = None
  ): software.amazon.awscdk.services.cloudfront.CustomOriginConfig =
    (new software.amazon.awscdk.services.cloudfront.CustomOriginConfig.Builder)
      .domainName(domainName)
      .httpsPort(httpsPort.orNull)
      .originReadTimeout(originReadTimeout.orNull)
      .originShieldRegion(originShieldRegion.orNull)
      .originHeaders(originHeaders.map(_.asJava).orNull)
      .originPath(originPath.orNull)
      .allowedOriginSslVersions(allowedOriginSslVersions.map(_.asJava).orNull)
      .originKeepaliveTimeout(originKeepaliveTimeout.orNull)
      .originProtocolPolicy(originProtocolPolicy.orNull)
      .httpPort(httpPort.orNull)
      .build()
}
