package io.burkard.cdk.services.iotwireless

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnWirelessDevice {

  def apply(
    internalResourceId: String,
    destinationName: String,
    `type`: String,
    name: Option[String] = None,
    loRaWan: Option[software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.LoRaWANDeviceProperty] = None,
    thingArn: Option[String] = None,
    lastUplinkReceivedAt: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotwireless.CfnWirelessDevice =
    software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.Builder
      .create(stackCtx, internalResourceId)
      .destinationName(destinationName)
      .`type`(`type`)
      .name(name.orNull)
      .loRaWan(loRaWan.orNull)
      .thingArn(thingArn.orNull)
      .lastUplinkReceivedAt(lastUplinkReceivedAt.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
