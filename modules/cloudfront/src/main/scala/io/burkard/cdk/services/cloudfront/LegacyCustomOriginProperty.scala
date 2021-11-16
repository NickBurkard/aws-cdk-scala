package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LegacyCustomOriginProperty {

  def apply(
    originSslProtocols: List[String],
    dnsName: String,
    originProtocolPolicy: String,
    httpsPort: Option[Number] = None,
    httpPort: Option[Number] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyCustomOriginProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyCustomOriginProperty.Builder)
      .originSslProtocols(originSslProtocols.asJava)
      .dnsName(dnsName)
      .originProtocolPolicy(originProtocolPolicy)
      .httpsPort(httpsPort.orNull)
      .httpPort(httpPort.orNull)
      .build()
}
