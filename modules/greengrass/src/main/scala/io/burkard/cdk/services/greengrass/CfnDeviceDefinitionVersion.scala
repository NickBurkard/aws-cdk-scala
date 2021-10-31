package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDeviceDefinitionVersion {

  def apply(
    internalResourceId: String,
    deviceDefinitionId: Option[String] = None,
    devices: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion =
    software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion.Builder
      .create(stackCtx, internalResourceId)
      .deviceDefinitionId(deviceDefinitionId.orNull)
      .devices(devices.map(_.asJava).orNull)
      .build()
}
