package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDeviceProps {

  def apply(
    deviceFleetName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    device: Option[software.amazon.awscdk.services.sagemaker.CfnDevice.DeviceProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnDeviceProps =
    (new software.amazon.awscdk.services.sagemaker.CfnDeviceProps.Builder)
      .deviceFleetName(deviceFleetName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .device(device.orNull)
      .build()
}
