package io.burkard.cdk.services.cloudfront

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CustomOriginConfigProperty {

  def apply(
    originKeepaliveTimeout: Option[Number] = None,
    httpsPort: Option[Number] = None,
    originSslProtocols: Option[List[String]] = None,
    originReadTimeout: Option[Number] = None,
    originProtocolPolicy: Option[String] = None,
    httpPort: Option[Number] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty.Builder)
      .originKeepaliveTimeout(originKeepaliveTimeout.orNull)
      .httpsPort(httpsPort.orNull)
      .originSslProtocols(originSslProtocols.map(_.asJava).orNull)
      .originReadTimeout(originReadTimeout.orNull)
      .originProtocolPolicy(originProtocolPolicy.orNull)
      .httpPort(httpPort.orNull)
      .build()
}
