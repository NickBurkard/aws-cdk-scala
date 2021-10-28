package io.burkard.cdk.services.opsworks

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BlockDeviceMappingProperty {

  def apply(
    deviceName: Option[String] = None,
    ebs: Option[software.amazon.awscdk.services.opsworks.CfnInstance.EbsBlockDeviceProperty] = None,
    virtualName: Option[String] = None,
    noDevice: Option[String] = None
  ): software.amazon.awscdk.services.opsworks.CfnInstance.BlockDeviceMappingProperty =
    (new software.amazon.awscdk.services.opsworks.CfnInstance.BlockDeviceMappingProperty.Builder)
      .deviceName(deviceName.orNull)
      .ebs(ebs.orNull)
      .virtualName(virtualName.orNull)
      .noDevice(noDevice.orNull)
      .build()
}
