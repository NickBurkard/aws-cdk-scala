package io.burkard.cdk.services.iotwireless

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDeviceProfileProps {

  def apply(
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    loRaWan: Option[software.amazon.awscdk.services.iotwireless.CfnDeviceProfile.LoRaWANDeviceProfileProperty] = None
  ): software.amazon.awscdk.services.iotwireless.CfnDeviceProfileProps =
    (new software.amazon.awscdk.services.iotwireless.CfnDeviceProfileProps.Builder)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .loRaWan(loRaWan.orNull)
      .build()
}
