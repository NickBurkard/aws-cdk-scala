package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DeviceDefinitionVersionProperty {

  def apply(
    devices: Option[List[_]] = None
  ): software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceDefinitionVersionProperty =
    (new software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceDefinitionVersionProperty.Builder)
      .devices(devices.map(_.asJava).orNull)
      .build()
}
