package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoadBalancerV2OriginProps {

  def apply(
    keepaliveTimeout: Option[software.amazon.awscdk.Duration] = None,
    httpsPort: Option[Number] = None,
    originSslProtocols: Option[List[_ <: software.amazon.awscdk.services.cloudfront.OriginSslPolicy]] = None,
    originShieldRegion: Option[String] = None,
    httpPort: Option[Number] = None,
    connectionTimeout: Option[software.amazon.awscdk.Duration] = None,
    customHeaders: Option[Map[String, String]] = None,
    connectionAttempts: Option[Number] = None,
    originPath: Option[String] = None,
    readTimeout: Option[software.amazon.awscdk.Duration] = None,
    protocolPolicy: Option[software.amazon.awscdk.services.cloudfront.OriginProtocolPolicy] = None
  ): software.amazon.awscdk.services.cloudfront.origins.LoadBalancerV2OriginProps =
    (new software.amazon.awscdk.services.cloudfront.origins.LoadBalancerV2OriginProps.Builder)
      .keepaliveTimeout(keepaliveTimeout.orNull)
      .httpsPort(httpsPort.orNull)
      .originSslProtocols(originSslProtocols.map(_.asJava).orNull)
      .originShieldRegion(originShieldRegion.orNull)
      .httpPort(httpPort.orNull)
      .connectionTimeout(connectionTimeout.orNull)
      .customHeaders(customHeaders.map(_.asJava).orNull)
      .connectionAttempts(connectionAttempts.orNull)
      .originPath(originPath.orNull)
      .readTimeout(readTimeout.orNull)
      .protocolPolicy(protocolPolicy.orNull)
      .build()
}
