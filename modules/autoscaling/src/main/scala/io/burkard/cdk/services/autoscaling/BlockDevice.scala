package io.burkard.cdk.services.autoscaling

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BlockDevice {

  def apply(
    deviceName: String,
    volume: software.amazon.awscdk.services.autoscaling.BlockDeviceVolume,
    mappingEnabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.autoscaling.BlockDevice =
    (new software.amazon.awscdk.services.autoscaling.BlockDevice.Builder)
      .deviceName(deviceName)
      .volume(volume)
      .mappingEnabled(mappingEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
