package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DeviceDefinitionVersionProperty {

  def apply(
    devices: Option[List[_]] = None
  ): software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceDefinitionVersionProperty =
    (new software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceDefinitionVersionProperty.Builder)
      .devices(devices.map(_.asJava).orNull)
      .build()
}
