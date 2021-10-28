package io.burkard.cdk.services.sagemaker

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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