package io.burkard.cdk.services.globalaccelerator

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAcceleratorProps {

  def apply(
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    enabled: Option[Boolean] = None,
    ipAddressType: Option[String] = None,
    ipAddresses: Option[List[String]] = None
  ): software.amazon.awscdk.services.globalaccelerator.CfnAcceleratorProps =
    (new software.amazon.awscdk.services.globalaccelerator.CfnAcceleratorProps.Builder)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .ipAddressType(ipAddressType.orNull)
      .ipAddresses(ipAddresses.map(_.asJava).orNull)
      .build()
}
