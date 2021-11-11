package io.burkard.cdk.services.globalaccelerator

sealed abstract class ConnectionProtocol(val underlying: software.amazon.awscdk.services.globalaccelerator.ConnectionProtocol)
  extends Product
    with Serializable

object ConnectionProtocol {
  implicit def toAws(value: ConnectionProtocol): software.amazon.awscdk.services.globalaccelerator.ConnectionProtocol =
    Option(value).map(_.underlying).orNull

  case object Tcp
    extends ConnectionProtocol(software.amazon.awscdk.services.globalaccelerator.ConnectionProtocol.TCP)

  case object Udp
    extends ConnectionProtocol(software.amazon.awscdk.services.globalaccelerator.ConnectionProtocol.UDP)
}
