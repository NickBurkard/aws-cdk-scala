package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BlockDeviceProperty {

  def apply(
    volumeType: Option[String] = None,
    encrypted: Option[Boolean] = None,
    iops: Option[Number] = None,
    deleteOnTermination: Option[Boolean] = None,
    throughput: Option[Number] = None,
    volumeSize: Option[Number] = None,
    snapshotId: Option[String] = None
  ): software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty.Builder)
      .volumeType(volumeType.orNull)
      .encrypted(encrypted.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .iops(iops.orNull)
      .deleteOnTermination(deleteOnTermination.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .throughput(throughput.orNull)
      .volumeSize(volumeSize.orNull)
      .snapshotId(snapshotId.orNull)
      .build()
}
