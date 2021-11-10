package io.burkard.cdk.services.ec2


sealed abstract class RouterType(val underlying: software.amazon.awscdk.services.ec2.RouterType)
  extends Product
    with Serializable


object RouterType {
  implicit def toAws(value: RouterType): software.amazon.awscdk.services.ec2.RouterType =
    Option(value).map(_.underlying).orNull

  case object EgressOnlyInternetGateway
    extends RouterType(software.amazon.awscdk.services.ec2.RouterType.EGRESS_ONLY_INTERNET_GATEWAY)

  case object Gateway
    extends RouterType(software.amazon.awscdk.services.ec2.RouterType.GATEWAY)

  case object Instance
    extends RouterType(software.amazon.awscdk.services.ec2.RouterType.INSTANCE)

  case object NatGateway
    extends RouterType(software.amazon.awscdk.services.ec2.RouterType.NAT_GATEWAY)

  case object NetworkInterface
    extends RouterType(software.amazon.awscdk.services.ec2.RouterType.NETWORK_INTERFACE)

  case object VpcPeeringConnection
    extends RouterType(software.amazon.awscdk.services.ec2.RouterType.VPC_PEERING_CONNECTION)
}
