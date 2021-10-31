package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EbsDeviceSnapshotOptions {

  def apply(
    volumeType: Option[software.amazon.awscdk.services.autoscaling.EbsDeviceVolumeType] = None,
    iops: Option[Number] = None,
    deleteOnTermination: Option[Boolean] = None,
    volumeSize: Option[Number] = None
  ): software.amazon.awscdk.services.autoscaling.EbsDeviceSnapshotOptions =
    (new software.amazon.awscdk.services.autoscaling.EbsDeviceSnapshotOptions.Builder)
      .volumeType(volumeType.orNull)
      .iops(iops.orNull)
      .deleteOnTermination(deleteOnTermination.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .volumeSize(volumeSize.orNull)
      .build()
}
