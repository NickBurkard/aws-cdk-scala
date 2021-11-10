package io.burkard.cdk.services.elasticloadbalancingv2


sealed abstract class IpAddressType(val underlying: software.amazon.awscdk.services.elasticloadbalancingv2.IpAddressType)
  extends Product
    with Serializable


object IpAddressType {
  implicit def toAws(value: IpAddressType): software.amazon.awscdk.services.elasticloadbalancingv2.IpAddressType =
    Option(value).map(_.underlying).orNull

  case object Ipv4
    extends IpAddressType(software.amazon.awscdk.services.elasticloadbalancingv2.IpAddressType.IPV4)

  case object DualStack
    extends IpAddressType(software.amazon.awscdk.services.elasticloadbalancingv2.IpAddressType.DUAL_STACK)
}
