package io.burkard.cdk.services.imagebuilder

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InstanceBlockDeviceMappingProperty {

  def apply(
    deviceName: Option[String] = None,
    ebs: Option[software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.EbsInstanceBlockDeviceSpecificationProperty] = None,
    virtualName: Option[String] = None,
    noDevice: Option[String] = None
  ): software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.InstanceBlockDeviceMappingProperty =
    (new software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.InstanceBlockDeviceMappingProperty.Builder)
      .deviceName(deviceName.orNull)
      .ebs(ebs.orNull)
      .virtualName(virtualName.orNull)
      .noDevice(noDevice.orNull)
      .build()
}
