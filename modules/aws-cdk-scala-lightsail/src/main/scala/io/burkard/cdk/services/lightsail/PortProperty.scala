package io.burkard.cdk.services.lightsail

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PortProperty {

  def apply(
    accessType: Option[String] = None,
    cidrListAliases: Option[List[String]] = None,
    toPort: Option[Number] = None,
    commonName: Option[String] = None,
    cidrs: Option[List[String]] = None,
    accessFrom: Option[String] = None,
    fromPort: Option[Number] = None,
    accessDirection: Option[String] = None,
    ipv6Cidrs: Option[List[String]] = None,
    protocol: Option[String] = None
  ): software.amazon.awscdk.services.lightsail.CfnInstance.PortProperty =
    (new software.amazon.awscdk.services.lightsail.CfnInstance.PortProperty.Builder)
      .accessType(accessType.orNull)
      .cidrListAliases(cidrListAliases.map(_.asJava).orNull)
      .toPort(toPort.orNull)
      .commonName(commonName.orNull)
      .cidrs(cidrs.map(_.asJava).orNull)
      .accessFrom(accessFrom.orNull)
      .fromPort(fromPort.orNull)
      .accessDirection(accessDirection.orNull)
      .ipv6Cidrs(ipv6Cidrs.map(_.asJava).orNull)
      .protocol(protocol.orNull)
      .build()
}
