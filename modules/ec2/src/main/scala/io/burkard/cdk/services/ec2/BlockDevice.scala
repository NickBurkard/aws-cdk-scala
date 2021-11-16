package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BlockDevice {

  def apply(
    deviceName: String,
    volume: software.amazon.awscdk.services.ec2.BlockDeviceVolume,
    mappingEnabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.BlockDevice =
    (new software.amazon.awscdk.services.ec2.BlockDevice.Builder)
      .deviceName(deviceName)
      .volume(volume)
      .mappingEnabled(mappingEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
