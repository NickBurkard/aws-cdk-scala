package io.burkard.cdk.services.iotwireless

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnWirelessGateway {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    loRaWan: Option[software.amazon.awscdk.services.iotwireless.CfnWirelessGateway.LoRaWANGatewayProperty] = None,
    thingArn: Option[String] = None,
    lastUplinkReceivedAt: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotwireless.CfnWirelessGateway =
    software.amazon.awscdk.services.iotwireless.CfnWirelessGateway.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .loRaWan(loRaWan.orNull)
      .thingArn(thingArn.orNull)
      .lastUplinkReceivedAt(lastUplinkReceivedAt.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
