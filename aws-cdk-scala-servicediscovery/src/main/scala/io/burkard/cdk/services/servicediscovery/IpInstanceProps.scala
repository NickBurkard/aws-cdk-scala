package io.burkard.cdk.services.servicediscovery

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object IpInstanceProps {

  def apply(
    instanceId: Option[String] = None,
    ipv4: Option[String] = None,
    service: Option[software.amazon.awscdk.services.servicediscovery.IService] = None,
    port: Option[Number] = None,
    ipv6: Option[String] = None,
    customAttributes: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.servicediscovery.IpInstanceProps =
    (new software.amazon.awscdk.services.servicediscovery.IpInstanceProps.Builder)
      .instanceId(instanceId.orNull)
      .ipv4(ipv4.orNull)
      .service(service.orNull)
      .port(port.orNull)
      .ipv6(ipv6.orNull)
      .customAttributes(customAttributes.map(_.asJava).orNull)
      .build()
}
