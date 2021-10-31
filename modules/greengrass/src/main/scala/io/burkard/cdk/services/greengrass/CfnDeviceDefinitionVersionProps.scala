package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
