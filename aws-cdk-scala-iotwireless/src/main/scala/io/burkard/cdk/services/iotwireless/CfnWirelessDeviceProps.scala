package io.burkard.cdk.services.iotwireless

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnWirelessDeviceProps {

  def apply(
    name: Option[String] = None,
    loRaWan: Option[software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.LoRaWANDeviceProperty] = None,
    destinationName: Option[String] = None,
    thingArn: Option[String] = None,
    lastUplinkReceivedAt: Option[String] = None,
    `type`: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceProps =
    (new software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceProps.Builder)
      .name(name.orNull)
      .loRaWan(loRaWan.orNull)
      .destinationName(destinationName.orNull)
      .thingArn(thingArn.orNull)
      .lastUplinkReceivedAt(lastUplinkReceivedAt.orNull)
      .`type`(`type`.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
