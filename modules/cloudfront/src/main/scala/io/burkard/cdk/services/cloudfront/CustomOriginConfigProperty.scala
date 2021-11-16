package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomOriginConfigProperty {

  def apply(
    originProtocolPolicy: String,
    originKeepaliveTimeout: Option[Number] = None,
    httpsPort: Option[Number] = None,
    originSslProtocols: Option[List[String]] = None,
    originReadTimeout: Option[Number] = None,
    httpPort: Option[Number] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty.Builder)
      .originProtocolPolicy(originProtocolPolicy)
      .originKeepaliveTimeout(originKeepaliveTimeout.orNull)
      .httpsPort(httpsPort.orNull)
      .originSslProtocols(originSslProtocols.map(_.asJava).orNull)
      .originReadTimeout(originReadTimeout.orNull)
      .httpPort(httpPort.orNull)
      .build()
}
