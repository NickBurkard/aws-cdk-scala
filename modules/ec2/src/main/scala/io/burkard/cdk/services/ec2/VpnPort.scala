package io.burkard.cdk.services.ec2

sealed abstract class VpnPort(val underlying: software.amazon.awscdk.services.ec2.VpnPort)
  extends Product
    with Serializable

object VpnPort {
  implicit def toAws(value: VpnPort): software.amazon.awscdk.services.ec2.VpnPort =
    Option(value).map(_.underlying).orNull

  case object Https
    extends VpnPort(software.amazon.awscdk.services.ec2.VpnPort.HTTPS)

  case object Openvpn
    extends VpnPort(software.amazon.awscdk.services.ec2.VpnPort.OPENVPN)
}
