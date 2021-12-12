package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BlockDeviceMappingProperty {

  def apply(
    deviceName: Option[String] = None,
    ebs: Option[software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EbsProperty] = None,
    virtualName: Option[String] = None,
    noDevice: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.BlockDeviceMappingProperty =
    (new software.amazon.awscdk.services.ec2.CfnLaunchTemplate.BlockDeviceMappingProperty.Builder)
      .deviceName(deviceName.orNull)
      .ebs(ebs.orNull)
      .virtualName(virtualName.orNull)
      .noDevice(noDevice.orNull)
      .build()
}
