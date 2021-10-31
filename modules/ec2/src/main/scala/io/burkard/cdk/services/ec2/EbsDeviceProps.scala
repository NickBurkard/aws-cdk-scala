package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EbsDeviceProps {

  def apply(
    volumeType: Option[software.amazon.awscdk.services.ec2.EbsDeviceVolumeType] = None,
    iops: Option[Number] = None,
    deleteOnTermination: Option[Boolean] = None,
    volumeSize: Option[Number] = None,
    snapshotId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.EbsDeviceProps =
    (new software.amazon.awscdk.services.ec2.EbsDeviceProps.Builder)
      .volumeType(volumeType.orNull)
      .iops(iops.orNull)
      .deleteOnTermination(deleteOnTermination.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .volumeSize(volumeSize.orNull)
      .snapshotId(snapshotId.orNull)
      .build()
}
