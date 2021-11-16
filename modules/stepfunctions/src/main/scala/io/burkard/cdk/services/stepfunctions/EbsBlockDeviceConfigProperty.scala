package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EbsBlockDeviceConfigProperty {

  def apply(
    volumeSpecification: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.VolumeSpecificationProperty,
    volumesPerInstance: Option[Number] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceConfigProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceConfigProperty.Builder)
      .volumeSpecification(volumeSpecification)
      .volumesPerInstance(volumesPerInstance.orNull)
      .build()
}
