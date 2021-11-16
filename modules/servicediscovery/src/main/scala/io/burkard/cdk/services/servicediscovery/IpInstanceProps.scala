package io.burkard.cdk.services.servicediscovery

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IpInstanceProps {

  def apply(
    service: software.amazon.awscdk.services.servicediscovery.IService,
    instanceId: Option[String] = None,
    ipv4: Option[String] = None,
    port: Option[Number] = None,
    ipv6: Option[String] = None,
    customAttributes: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.servicediscovery.IpInstanceProps =
    (new software.amazon.awscdk.services.servicediscovery.IpInstanceProps.Builder)
      .service(service)
      .instanceId(instanceId.orNull)
      .ipv4(ipv4.orNull)
      .port(port.orNull)
      .ipv6(ipv6.orNull)
      .customAttributes(customAttributes.map(_.asJava).orNull)
      .build()
}
