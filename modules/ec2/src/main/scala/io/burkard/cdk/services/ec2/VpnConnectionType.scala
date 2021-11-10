package io.burkard.cdk.services.ec2


sealed abstract class VpnConnectionType(val underlying: software.amazon.awscdk.services.ec2.VpnConnectionType)
  extends Product
    with Serializable


object VpnConnectionType {
  implicit def toAws(value: VpnConnectionType): software.amazon.awscdk.services.ec2.VpnConnectionType =
    Option(value).map(_.underlying).orNull

  case object Ipsec1
    extends VpnConnectionType(software.amazon.awscdk.services.ec2.VpnConnectionType.IPSEC_1)

  case object Dummy
    extends VpnConnectionType(software.amazon.awscdk.services.ec2.VpnConnectionType.DUMMY)
}
