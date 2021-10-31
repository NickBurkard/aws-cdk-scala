package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDevice {

  def apply(
    internalResourceId: String,
    deviceFleetName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    device: Option[software.amazon.awscdk.services.sagemaker.CfnDevice.DeviceProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnDevice =
    software.amazon.awscdk.services.sagemaker.CfnDevice.Builder
      .create(stackCtx, internalResourceId)
      .deviceFleetName(deviceFleetName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .device(device.orNull)
      .build()
}
