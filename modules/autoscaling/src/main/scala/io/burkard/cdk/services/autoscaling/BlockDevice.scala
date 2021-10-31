package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
