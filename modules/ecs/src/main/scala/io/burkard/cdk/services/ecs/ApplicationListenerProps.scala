package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationListenerProps {

  def apply(
    sslPolicy: Option[software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy] = None,
    port: Option[Number] = None,
    protocol: Option[software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol] = None,
    name: Option[String] = None,
    certificate: Option[software.amazon.awscdk.services.certificatemanager.ICertificate] = None
  ): software.amazon.awscdk.services.ecs.patterns.ApplicationListenerProps =
    (new software.amazon.awscdk.services.ecs.patterns.ApplicationListenerProps.Builder)
      .sslPolicy(sslPolicy.orNull)
      .port(port.orNull)
      .protocol(protocol.orNull)
      .name(name.orNull)
      .certificate(certificate.orNull)
      .build()
}
