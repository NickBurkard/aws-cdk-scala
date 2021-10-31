package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TlsValidationContextAcmTrustProperty {

  def apply(
    certificateAuthorityArns: Option[List[String]] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextAcmTrustProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextAcmTrustProperty.Builder)
      .certificateAuthorityArns(certificateAuthorityArns.map(_.asJava).orNull)
      .build()
}
