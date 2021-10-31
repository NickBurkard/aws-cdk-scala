package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LegacyCustomOriginProperty {

  def apply(
    httpsPort: Option[Number] = None,
    originSslProtocols: Option[List[String]] = None,
    dnsName: Option[String] = None,
    originProtocolPolicy: Option[String] = None,
    httpPort: Option[Number] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyCustomOriginProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyCustomOriginProperty.Builder)
      .httpsPort(httpsPort.orNull)
      .originSslProtocols(originSslProtocols.map(_.asJava).orNull)
      .dnsName(dnsName.orNull)
      .originProtocolPolicy(originProtocolPolicy.orNull)
      .httpPort(httpPort.orNull)
      .build()
}
