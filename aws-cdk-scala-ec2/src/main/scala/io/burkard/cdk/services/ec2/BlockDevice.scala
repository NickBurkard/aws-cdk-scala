package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BlockDevice {

  def apply(
    deviceName: Option[String] = None,
    mappingEnabled: Option[Boolean] = None,
    volume: Option[software.amazon.awscdk.services.ec2.BlockDeviceVolume] = None
  ): software.amazon.awscdk.services.ec2.BlockDevice =
    (new software.amazon.awscdk.services.ec2.BlockDevice.Builder)
      .deviceName(deviceName.orNull)
      .mappingEnabled(mappingEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .volume(volume.orNull)
      .build()
}
