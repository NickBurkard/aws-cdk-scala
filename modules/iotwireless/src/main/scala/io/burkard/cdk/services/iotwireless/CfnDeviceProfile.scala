package io.burkard.cdk.services.iotwireless

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDeviceProfile {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    loRaWan: Option[software.amazon.awscdk.services.iotwireless.CfnDeviceProfile.LoRaWANDeviceProfileProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotwireless.CfnDeviceProfile =
    software.amazon.awscdk.services.iotwireless.CfnDeviceProfile.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .loRaWan(loRaWan.orNull)
      .build()
}
