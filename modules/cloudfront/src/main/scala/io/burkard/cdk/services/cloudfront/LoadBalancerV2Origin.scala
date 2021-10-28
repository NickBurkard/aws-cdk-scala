package io.burkard.cdk.services.cloudfront

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LoadBalancerV2Origin {

  def apply(
    loadBalancer: software.amazon.awscdk.services.elasticloadbalancingv2.ILoadBalancerV2,
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
  ): software.amazon.awscdk.services.cloudfront.origins.LoadBalancerV2Origin =
    software.amazon.awscdk.services.cloudfront.origins.LoadBalancerV2Origin.Builder
      .create(loadBalancer)
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
