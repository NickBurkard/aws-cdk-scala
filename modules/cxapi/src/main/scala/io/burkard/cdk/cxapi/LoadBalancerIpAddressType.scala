package io.burkard.cdk.cxapi


sealed abstract class LoadBalancerIpAddressType(val underlying: software.amazon.awscdk.cxapi.LoadBalancerIpAddressType)
  extends Product
    with Serializable


object LoadBalancerIpAddressType {
  implicit def toAws(value: LoadBalancerIpAddressType): software.amazon.awscdk.cxapi.LoadBalancerIpAddressType =
    Option(value).map(_.underlying).orNull

  case object Ipv4
    extends LoadBalancerIpAddressType(software.amazon.awscdk.cxapi.LoadBalancerIpAddressType.IPV4)

  case object DualStack
    extends LoadBalancerIpAddressType(software.amazon.awscdk.cxapi.LoadBalancerIpAddressType.DUAL_STACK)
}
