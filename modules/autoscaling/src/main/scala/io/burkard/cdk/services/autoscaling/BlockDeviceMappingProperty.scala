package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BlockDeviceMappingProperty {

  def apply(
    deviceName: Option[String] = None,
    ebs: Option[software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty] = None,
    virtualName: Option[String] = None,
    noDevice: Option[Boolean] = None
  ): software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceMappingProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceMappingProperty.Builder)
      .deviceName(deviceName.orNull)
      .ebs(ebs.orNull)
      .virtualName(virtualName.orNull)
      .noDevice(noDevice.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
