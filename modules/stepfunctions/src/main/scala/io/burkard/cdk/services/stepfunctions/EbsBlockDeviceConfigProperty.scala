package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EbsBlockDeviceConfigProperty {

  def apply(
    volumesPerInstance: Option[Number] = None,
    volumeSpecification: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.VolumeSpecificationProperty] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceConfigProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceConfigProperty.Builder)
      .volumesPerInstance(volumesPerInstance.orNull)
      .volumeSpecification(volumeSpecification.orNull)
      .build()
}
