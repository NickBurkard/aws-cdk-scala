package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDeviceDefinitionVersion {

  def apply(
    internalResourceId: String,
    deviceDefinitionId: String,
    devices: List[_]
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion =
    software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion.Builder
      .create(stackCtx, internalResourceId)
      .deviceDefinitionId(deviceDefinitionId)
      .devices(devices.asJava)
      .build()
}
