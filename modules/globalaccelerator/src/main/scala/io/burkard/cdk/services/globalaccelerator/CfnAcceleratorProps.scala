package io.burkard.cdk.services.globalaccelerator

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAcceleratorProps {

  def apply(
    name: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    enabled: Option[Boolean] = None,
    ipAddressType: Option[String] = None,
    ipAddresses: Option[List[String]] = None
  ): software.amazon.awscdk.services.globalaccelerator.CfnAcceleratorProps =
    (new software.amazon.awscdk.services.globalaccelerator.CfnAcceleratorProps.Builder)
      .name(name)
      .tags(tags.map(_.asJava).orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .ipAddressType(ipAddressType.orNull)
      .ipAddresses(ipAddresses.map(_.asJava).orNull)
      .build()
}
