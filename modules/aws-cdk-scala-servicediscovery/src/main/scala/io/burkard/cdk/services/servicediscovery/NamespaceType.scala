package io.burkard.cdk.services.servicediscovery

sealed abstract class NamespaceType(val underlying: software.amazon.awscdk.services.servicediscovery.NamespaceType)
  extends Product
    with Serializable

object NamespaceType {
  implicit def toAws(value: NamespaceType): software.amazon.awscdk.services.servicediscovery.NamespaceType =
    Option(value).map(_.underlying).orNull

  case object Http
    extends NamespaceType(software.amazon.awscdk.services.servicediscovery.NamespaceType.HTTP)

  case object DnsPrivate
    extends NamespaceType(software.amazon.awscdk.services.servicediscovery.NamespaceType.DNS_PRIVATE)

  case object DnsPublic
    extends NamespaceType(software.amazon.awscdk.services.servicediscovery.NamespaceType.DNS_PUBLIC)
}
