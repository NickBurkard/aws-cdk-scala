package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VolumeSpecificationProperty {

  def apply(
    volumeType: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType] = None,
    iops: Option[Number] = None,
    volumeSize: Option[software.amazon.awscdk.Size] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.VolumeSpecificationProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.VolumeSpecificationProperty.Builder)
      .volumeType(volumeType.orNull)
      .iops(iops.orNull)
      .volumeSize(volumeSize.orNull)
      .build()
}
