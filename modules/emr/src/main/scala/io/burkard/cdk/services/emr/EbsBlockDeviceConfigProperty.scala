package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EbsBlockDeviceConfigProperty {

  def apply(
    volumeSpecification: software.amazon.awscdk.services.emr.CfnCluster.VolumeSpecificationProperty,
    volumesPerInstance: Option[Number] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.EbsBlockDeviceConfigProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.EbsBlockDeviceConfigProperty.Builder)
      .volumeSpecification(volumeSpecification)
      .volumesPerInstance(volumesPerInstance.orNull)
      .build()
}
