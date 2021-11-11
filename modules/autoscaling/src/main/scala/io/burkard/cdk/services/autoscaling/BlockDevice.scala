package io.burkard.cdk.services.autoscaling

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BlockDevice {

  def apply(
    deviceName: Option[String] = None,
    mappingEnabled: Option[Boolean] = None,
    volume: Option[software.amazon.awscdk.services.autoscaling.BlockDeviceVolume] = None
  ): software.amazon.awscdk.services.autoscaling.BlockDevice =
    (new software.amazon.awscdk.services.autoscaling.BlockDevice.Builder)
      .deviceName(deviceName.orNull)
      .mappingEnabled(mappingEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .volume(volume.orNull)
      .build()
}
