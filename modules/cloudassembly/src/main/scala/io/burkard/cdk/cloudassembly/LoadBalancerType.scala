package io.burkard.cdk.cloudassembly


sealed abstract class LoadBalancerType(val underlying: software.amazon.awscdk.cloudassembly.schema.LoadBalancerType)
  extends Product
    with Serializable


object LoadBalancerType {
  implicit def toAws(value: LoadBalancerType): software.amazon.awscdk.cloudassembly.schema.LoadBalancerType =
    Option(value).map(_.underlying).orNull

  case object Network
    extends LoadBalancerType(software.amazon.awscdk.cloudassembly.schema.LoadBalancerType.NETWORK)

  case object Application
    extends LoadBalancerType(software.amazon.awscdk.cloudassembly.schema.LoadBalancerType.APPLICATION)
}
