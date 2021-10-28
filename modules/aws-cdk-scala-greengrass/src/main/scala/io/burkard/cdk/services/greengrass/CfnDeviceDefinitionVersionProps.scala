package io.burkard.cdk.services.greengrass

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDeviceDefinitionVersionProps {

  def apply(
    deviceDefinitionId: Option[String] = None,
    devices: Option[List[_]] = None
  ): software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersionProps =
    (new software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersionProps.Builder)
      .deviceDefinitionId(deviceDefinitionId.orNull)
      .devices(devices.map(_.asJava).orNull)
      .build()
}
