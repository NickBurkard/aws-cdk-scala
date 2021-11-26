package io.burkard.cdk.services.globalaccelerator

sealed abstract class HealthCheckProtocol(val underlying: software.amazon.awscdk.services.globalaccelerator.HealthCheckProtocol)
  extends Product
    with Serializable

object HealthCheckProtocol {
  implicit def toAws(value: HealthCheckProtocol): software.amazon.awscdk.services.globalaccelerator.HealthCheckProtocol =
    Option(value).map(_.underlying).orNull

  case object Http
    extends HealthCheckProtocol(software.amazon.awscdk.services.globalaccelerator.HealthCheckProtocol.HTTP)

  case object Https
    extends HealthCheckProtocol(software.amazon.awscdk.services.globalaccelerator.HealthCheckProtocol.HTTPS)

  case object Tcp
    extends HealthCheckProtocol(software.amazon.awscdk.services.globalaccelerator.HealthCheckProtocol.TCP)
}
