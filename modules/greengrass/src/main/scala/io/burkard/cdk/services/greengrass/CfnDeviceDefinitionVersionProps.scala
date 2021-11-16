package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDeviceDefinitionVersionProps {

  def apply(
    deviceDefinitionId: String,
    devices: List[_]
  ): software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersionProps =
    (new software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersionProps.Builder)
      .deviceDefinitionId(deviceDefinitionId)
      .devices(devices.asJava)
      .build()
}
