package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VolumeSpecificationProperty {

  def apply(
    volumeType: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType,
    volumeSize: software.amazon.awscdk.Size,
    iops: Option[Number] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.VolumeSpecificationProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.VolumeSpecificationProperty.Builder)
      .volumeType(volumeType)
      .volumeSize(volumeSize)
      .iops(iops.orNull)
      .build()
}
