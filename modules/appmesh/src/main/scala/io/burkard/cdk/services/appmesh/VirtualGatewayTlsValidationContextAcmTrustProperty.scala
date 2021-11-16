package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualGatewayTlsValidationContextAcmTrustProperty {

  def apply(
    certificateAuthorityArns: List[String]
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextAcmTrustProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextAcmTrustProperty.Builder)
      .certificateAuthorityArns(certificateAuthorityArns.asJava)
      .build()
}
