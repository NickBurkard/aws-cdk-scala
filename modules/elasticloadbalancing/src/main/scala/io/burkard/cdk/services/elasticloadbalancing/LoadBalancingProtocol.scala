package io.burkard.cdk.services.elasticloadbalancing

sealed abstract class LoadBalancingProtocol(val underlying: software.amazon.awscdk.services.elasticloadbalancing.LoadBalancingProtocol)
  extends Product
    with Serializable

object LoadBalancingProtocol {
  implicit def toAws(value: LoadBalancingProtocol): software.amazon.awscdk.services.elasticloadbalancing.LoadBalancingProtocol =
    Option(value).map(_.underlying).orNull

  case object Http
    extends LoadBalancingProtocol(software.amazon.awscdk.services.elasticloadbalancing.LoadBalancingProtocol.HTTP)

  case object Https
    extends LoadBalancingProtocol(software.amazon.awscdk.services.elasticloadbalancing.LoadBalancingProtocol.HTTPS)

  case object Ssl
    extends LoadBalancingProtocol(software.amazon.awscdk.services.elasticloadbalancing.LoadBalancingProtocol.SSL)

  case object Tcp
    extends LoadBalancingProtocol(software.amazon.awscdk.services.elasticloadbalancing.LoadBalancingProtocol.TCP)
}
