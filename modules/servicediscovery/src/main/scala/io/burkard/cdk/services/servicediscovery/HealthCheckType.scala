package io.burkard.cdk.services.servicediscovery


sealed abstract class HealthCheckType(val underlying: software.amazon.awscdk.services.servicediscovery.HealthCheckType)
  extends Product
    with Serializable


object HealthCheckType {
  implicit def toAws(value: HealthCheckType): software.amazon.awscdk.services.servicediscovery.HealthCheckType =
    Option(value).map(_.underlying).orNull

  case object Http
    extends HealthCheckType(software.amazon.awscdk.services.servicediscovery.HealthCheckType.HTTP)

  case object Https
    extends HealthCheckType(software.amazon.awscdk.services.servicediscovery.HealthCheckType.HTTPS)

  case object Tcp
    extends HealthCheckType(software.amazon.awscdk.services.servicediscovery.HealthCheckType.TCP)
}
