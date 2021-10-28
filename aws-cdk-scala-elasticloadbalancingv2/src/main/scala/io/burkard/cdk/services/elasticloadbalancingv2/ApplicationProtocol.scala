package io.burkard.cdk.services.elasticloadbalancingv2

sealed abstract class ApplicationProtocol(val underlying: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol)
  extends Product
    with Serializable

object ApplicationProtocol {
  implicit def toAws(value: ApplicationProtocol): software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol =
    Option(value).map(_.underlying).orNull

  case object Http
    extends ApplicationProtocol(software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol.HTTP)

  case object Https
    extends ApplicationProtocol(software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol.HTTPS)
}
