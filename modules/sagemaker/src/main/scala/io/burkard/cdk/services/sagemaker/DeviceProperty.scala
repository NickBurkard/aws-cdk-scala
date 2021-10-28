package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DeviceProperty {

  def apply(
    deviceName: Option[String] = None,
    description: Option[String] = None,
    iotThingName: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnDevice.DeviceProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnDevice.DeviceProperty.Builder)
      .deviceName(deviceName.orNull)
      .description(description.orNull)
      .iotThingName(iotThingName.orNull)
      .build()
}
