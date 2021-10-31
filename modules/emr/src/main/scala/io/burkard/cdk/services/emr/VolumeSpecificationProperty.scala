package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VolumeSpecificationProperty {

  def apply(
    volumeType: Option[String] = None,
    iops: Option[Number] = None,
    sizeInGb: Option[Number] = None
  ): software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty =
    (new software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty.Builder)
      .volumeType(volumeType.orNull)
      .iops(iops.orNull)
      .sizeInGb(sizeInGb.orNull)
      .build()
}
