package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EbsBlockDeviceConfigProperty {

  def apply(
    volumesPerInstance: Option[Number] = None,
    volumeSpecification: Option[software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty] = None
  ): software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty =
    (new software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty.Builder)
      .volumesPerInstance(volumesPerInstance.orNull)
      .volumeSpecification(volumeSpecification.orNull)
      .build()
}
