package io.burkard.cdk.services.servicediscovery

sealed abstract class RoutingPolicy(val underlying: software.amazon.awscdk.services.servicediscovery.RoutingPolicy)
  extends Product
    with Serializable

object RoutingPolicy {
  implicit def toAws(value: RoutingPolicy): software.amazon.awscdk.services.servicediscovery.RoutingPolicy =
    Option(value).map(_.underlying).orNull

  case object Multivalue
    extends RoutingPolicy(software.amazon.awscdk.services.servicediscovery.RoutingPolicy.MULTIVALUE)

  case object Weighted
    extends RoutingPolicy(software.amazon.awscdk.services.servicediscovery.RoutingPolicy.WEIGHTED)
}
