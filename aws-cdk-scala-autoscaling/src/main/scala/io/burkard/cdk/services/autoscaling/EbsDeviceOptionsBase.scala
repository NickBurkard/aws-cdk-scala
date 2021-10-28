package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EbsDeviceOptionsBase {

  def apply(
    volumeType: Option[software.amazon.awscdk.services.autoscaling.EbsDeviceVolumeType] = None,
    iops: Option[Number] = None,
    deleteOnTermination: Option[Boolean] = None
  ): software.amazon.awscdk.services.autoscaling.EbsDeviceOptionsBase =
    (new software.amazon.awscdk.services.autoscaling.EbsDeviceOptionsBase.Builder)
      .volumeType(volumeType.orNull)
      .iops(iops.orNull)
      .deleteOnTermination(deleteOnTermination.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
