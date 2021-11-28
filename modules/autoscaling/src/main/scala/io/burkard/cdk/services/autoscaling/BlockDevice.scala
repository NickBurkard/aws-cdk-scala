package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BlockDevice {

  def apply(
    deviceName: String,
    volume: software.amazon.awscdk.services.autoscaling.BlockDeviceVolume
  ): software.amazon.awscdk.services.autoscaling.BlockDevice =
    (new software.amazon.awscdk.services.autoscaling.BlockDevice.Builder)
      .deviceName(deviceName)
      .volume(volume)
      .build()
}
