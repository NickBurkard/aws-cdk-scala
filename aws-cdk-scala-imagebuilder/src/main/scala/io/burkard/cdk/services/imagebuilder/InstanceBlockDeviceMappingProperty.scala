package io.burkard.cdk.services.imagebuilder

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InstanceBlockDeviceMappingProperty {

  def apply(
    deviceName: Option[String] = None,
    ebs: Option[software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.EbsInstanceBlockDeviceSpecificationProperty] = None,
    virtualName: Option[String] = None,
    noDevice: Option[String] = None
  ): software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceBlockDeviceMappingProperty =
    (new software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceBlockDeviceMappingProperty.Builder)
      .deviceName(deviceName.orNull)
      .ebs(ebs.orNull)
      .virtualName(virtualName.orNull)
      .noDevice(noDevice.orNull)
      .build()
}
