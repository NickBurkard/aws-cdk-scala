package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EbsBlockDeviceConfigProperty {

  def apply(
    volumesPerInstance: Option[Number] = None,
    volumeSpecification: Option[software.amazon.awscdk.services.emr.CfnCluster.VolumeSpecificationProperty] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.EbsBlockDeviceConfigProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.EbsBlockDeviceConfigProperty.Builder)
      .volumesPerInstance(volumesPerInstance.orNull)
      .volumeSpecification(volumeSpecification.orNull)
      .build()
}
