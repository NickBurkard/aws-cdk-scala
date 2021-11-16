package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClientPolicyTlsProperty {

  def apply(
    validation: software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextProperty,
    certificate: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientTlsCertificateProperty] = None,
    ports: Option[List[_ <: Number]] = None,
    enforce: Option[Boolean] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyTlsProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyTlsProperty.Builder)
      .validation(validation)
      .certificate(certificate.orNull)
      .ports(ports.map(_.asJava).orNull)
      .enforce(enforce.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
