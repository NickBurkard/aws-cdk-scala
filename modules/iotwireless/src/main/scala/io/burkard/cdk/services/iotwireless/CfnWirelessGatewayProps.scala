package io.burkard.cdk.services.iotwireless

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnWirelessGatewayProps {

  def apply(
    name: Option[String] = None,
    loRaWan: Option[software.amazon.awscdk.services.iotwireless.CfnWirelessGateway.LoRaWANGatewayProperty] = None,
    thingArn: Option[String] = None,
    lastUplinkReceivedAt: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.iotwireless.CfnWirelessGatewayProps =
    (new software.amazon.awscdk.services.iotwireless.CfnWirelessGatewayProps.Builder)
      .name(name.orNull)
      .loRaWan(loRaWan.orNull)
      .thingArn(thingArn.orNull)
      .lastUplinkReceivedAt(lastUplinkReceivedAt.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
