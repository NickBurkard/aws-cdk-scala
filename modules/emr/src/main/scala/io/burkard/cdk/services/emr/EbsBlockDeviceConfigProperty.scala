package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EbsBlockDeviceConfigProperty {

  def apply(
    volumeSpecification: software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.VolumeSpecificationProperty,
    volumesPerInstance: Option[Number] = None
  ): software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsBlockDeviceConfigProperty =
    (new software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsBlockDeviceConfigProperty.Builder)
      .volumeSpecification(volumeSpecification)
      .volumesPerInstance(volumesPerInstance.orNull)
      .build()
}
