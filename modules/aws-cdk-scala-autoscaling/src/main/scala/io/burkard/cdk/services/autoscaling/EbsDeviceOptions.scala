package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EbsDeviceOptions {

  def apply(
    volumeType: Option[software.amazon.awscdk.services.autoscaling.EbsDeviceVolumeType] = None,
    encrypted: Option[Boolean] = None,
    iops: Option[Number] = None,
    deleteOnTermination: Option[Boolean] = None
  ): software.amazon.awscdk.services.autoscaling.EbsDeviceOptions =
    (new software.amazon.awscdk.services.autoscaling.EbsDeviceOptions.Builder)
      .volumeType(volumeType.orNull)
      .encrypted(encrypted.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .iops(iops.orNull)
      .deleteOnTermination(deleteOnTermination.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
