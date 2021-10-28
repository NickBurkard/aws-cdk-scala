package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EbsDeviceProps {

  def apply(
    volumeType: Option[software.amazon.awscdk.services.autoscaling.EbsDeviceVolumeType] = None,
    iops: Option[Number] = None,
    deleteOnTermination: Option[Boolean] = None,
    volumeSize: Option[Number] = None,
    snapshotId: Option[String] = None
  ): software.amazon.awscdk.services.autoscaling.EbsDeviceProps =
    (new software.amazon.awscdk.services.autoscaling.EbsDeviceProps.Builder)
      .volumeType(volumeType.orNull)
      .iops(iops.orNull)
      .deleteOnTermination(deleteOnTermination.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .volumeSize(volumeSize.orNull)
      .snapshotId(snapshotId.orNull)
      .build()
}
