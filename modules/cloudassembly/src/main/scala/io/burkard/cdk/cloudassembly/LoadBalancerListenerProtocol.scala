package io.burkard.cdk.cloudassembly


sealed abstract class LoadBalancerListenerProtocol(val underlying: software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerProtocol)
  extends Product
    with Serializable


object LoadBalancerListenerProtocol {
  implicit def toAws(value: LoadBalancerListenerProtocol): software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerProtocol =
    Option(value).map(_.underlying).orNull

  case object Http
    extends LoadBalancerListenerProtocol(software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerProtocol.HTTP)

  case object Https
    extends LoadBalancerListenerProtocol(software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerProtocol.HTTPS)

  case object Tcp
    extends LoadBalancerListenerProtocol(software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerProtocol.TCP)

  case object Tls
    extends LoadBalancerListenerProtocol(software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerProtocol.TLS)

  case object Udp
    extends LoadBalancerListenerProtocol(software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerProtocol.UDP)

  case object TcpUdp
    extends LoadBalancerListenerProtocol(software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerProtocol.TCP_UDP)
}
