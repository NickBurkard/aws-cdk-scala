package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationListenerProps {

  def apply(
    name: String,
    sslPolicy: Option[software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy] = None,
    port: Option[Number] = None,
    protocol: Option[software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol] = None,
    certificate: Option[software.amazon.awscdk.services.certificatemanager.ICertificate] = None
  ): software.amazon.awscdk.services.ecs.patterns.ApplicationListenerProps =
    (new software.amazon.awscdk.services.ecs.patterns.ApplicationListenerProps.Builder)
      .name(name)
      .sslPolicy(sslPolicy.orNull)
      .port(port.orNull)
      .protocol(protocol.orNull)
      .certificate(certificate.orNull)
      .build()
}
