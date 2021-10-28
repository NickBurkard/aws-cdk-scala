package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BlockDevice {

  def apply(
    deviceName: Option[String] = None,
    volume: Option[software.amazon.awscdk.services.autoscaling.BlockDeviceVolume] = None
  ): software.amazon.awscdk.services.autoscaling.BlockDevice =
    (new software.amazon.awscdk.services.autoscaling.BlockDevice.Builder)
      .deviceName(deviceName.orNull)
      .volume(volume.orNull)
      .build()
}
