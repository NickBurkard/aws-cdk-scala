package io.burkard.cdk.services.servicediscovery

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object IpInstanceBaseProps {

  def apply(
    instanceId: Option[String] = None,
    ipv4: Option[String] = None,
    port: Option[Number] = None,
    ipv6: Option[String] = None,
    customAttributes: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.servicediscovery.IpInstanceBaseProps =
    (new software.amazon.awscdk.services.servicediscovery.IpInstanceBaseProps.Builder)
      .instanceId(instanceId.orNull)
      .ipv4(ipv4.orNull)
      .port(port.orNull)
      .ipv6(ipv6.orNull)
      .customAttributes(customAttributes.map(_.asJava).orNull)
      .build()
}
