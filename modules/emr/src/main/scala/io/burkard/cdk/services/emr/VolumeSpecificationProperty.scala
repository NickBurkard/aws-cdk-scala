package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VolumeSpecificationProperty {

  def apply(
    volumeType: String,
    sizeInGb: Number,
    iops: Option[Number] = None
  ): software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.VolumeSpecificationProperty =
    (new software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.VolumeSpecificationProperty.Builder)
      .volumeType(volumeType)
      .sizeInGb(sizeInGb)
      .iops(iops.orNull)
      .build()
}
