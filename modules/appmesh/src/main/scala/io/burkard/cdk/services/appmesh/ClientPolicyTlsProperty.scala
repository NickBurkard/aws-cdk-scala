package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ClientPolicyTlsProperty {

  def apply(
    certificate: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientTlsCertificateProperty] = None,
    ports: Option[List[_ <: Number]] = None,
    enforce: Option[Boolean] = None,
    validation: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyTlsProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyTlsProperty.Builder)
      .certificate(certificate.orNull)
      .ports(ports.map(_.asJava).orNull)
      .enforce(enforce.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .validation(validation.orNull)
      .build()
}
