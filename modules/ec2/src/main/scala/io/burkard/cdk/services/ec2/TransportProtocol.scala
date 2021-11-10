package io.burkard.cdk.services.ec2


sealed abstract class TransportProtocol(val underlying: software.amazon.awscdk.services.ec2.TransportProtocol)
  extends Product
    with Serializable


object TransportProtocol {
  implicit def toAws(value: TransportProtocol): software.amazon.awscdk.services.ec2.TransportProtocol =
    Option(value).map(_.underlying).orNull

  case object Tcp
    extends TransportProtocol(software.amazon.awscdk.services.ec2.TransportProtocol.TCP)

  case object Udp
    extends TransportProtocol(software.amazon.awscdk.services.ec2.TransportProtocol.UDP)
}
