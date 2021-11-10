package io.burkard.cdk.services.elasticloadbalancingv2


sealed abstract class Protocol(val underlying: software.amazon.awscdk.services.elasticloadbalancingv2.Protocol)
  extends Product
    with Serializable


object Protocol {
  implicit def toAws(value: Protocol): software.amazon.awscdk.services.elasticloadbalancingv2.Protocol =
    Option(value).map(_.underlying).orNull

  case object Http
    extends Protocol(software.amazon.awscdk.services.elasticloadbalancingv2.Protocol.HTTP)

  case object Https
    extends Protocol(software.amazon.awscdk.services.elasticloadbalancingv2.Protocol.HTTPS)

  case object Tcp
    extends Protocol(software.amazon.awscdk.services.elasticloadbalancingv2.Protocol.TCP)

  case object Tls
    extends Protocol(software.amazon.awscdk.services.elasticloadbalancingv2.Protocol.TLS)

  case object Udp
    extends Protocol(software.amazon.awscdk.services.elasticloadbalancingv2.Protocol.UDP)

  case object TcpUdp
    extends Protocol(software.amazon.awscdk.services.elasticloadbalancingv2.Protocol.TCP_UDP)
}
