package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualGatewayClientPolicyTlsProperty {

  def apply(
    certificate: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientTlsCertificateProperty] = None,
    ports: Option[List[_ <: Number]] = None,
    enforce: Option[Boolean] = None,
    validation: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientPolicyTlsProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientPolicyTlsProperty.Builder)
      .certificate(certificate.orNull)
      .ports(ports.map(_.asJava).orNull)
      .enforce(enforce.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .validation(validation.orNull)
      .build()
}
