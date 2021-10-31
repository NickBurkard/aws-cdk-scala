package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualGatewayTlsValidationContextAcmTrustProperty {

  def apply(
    certificateAuthorityArns: Option[List[String]] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextAcmTrustProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextAcmTrustProperty.Builder)
      .certificateAuthorityArns(certificateAuthorityArns.map(_.asJava).orNull)
      .build()
}
