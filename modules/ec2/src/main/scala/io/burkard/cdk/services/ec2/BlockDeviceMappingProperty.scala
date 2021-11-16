package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BlockDeviceMappingProperty {

  def apply(
    deviceName: String,
    ebs: Option[software.amazon.awscdk.services.ec2.CfnInstance.EbsProperty] = None,
    virtualName: Option[String] = None,
    noDevice: Option[software.amazon.awscdk.services.ec2.CfnInstance.NoDeviceProperty] = None
  ): software.amazon.awscdk.services.ec2.CfnInstance.BlockDeviceMappingProperty =
    (new software.amazon.awscdk.services.ec2.CfnInstance.BlockDeviceMappingProperty.Builder)
      .deviceName(deviceName)
      .ebs(ebs.orNull)
      .virtualName(virtualName.orNull)
      .noDevice(noDevice.orNull)
      .build()
}
