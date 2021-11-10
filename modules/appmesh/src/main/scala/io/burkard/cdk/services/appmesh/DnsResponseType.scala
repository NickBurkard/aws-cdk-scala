package io.burkard.cdk.services.appmesh


sealed abstract class DnsResponseType(val underlying: software.amazon.awscdk.services.appmesh.DnsResponseType)
  extends Product
    with Serializable


object DnsResponseType {
  implicit def toAws(value: DnsResponseType): software.amazon.awscdk.services.appmesh.DnsResponseType =
    Option(value).map(_.underlying).orNull

  case object LoadBalancer
    extends DnsResponseType(software.amazon.awscdk.services.appmesh.DnsResponseType.LOAD_BALANCER)

  case object Endpoints
    extends DnsResponseType(software.amazon.awscdk.services.appmesh.DnsResponseType.ENDPOINTS)
}
