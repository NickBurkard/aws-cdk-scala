package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VolumeSpecificationProperty {

  def apply(
    volumeType: Option[String] = None,
    iops: Option[Number] = None,
    sizeInGb: Option[Number] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.VolumeSpecificationProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.VolumeSpecificationProperty.Builder)
      .volumeType(volumeType.orNull)
      .iops(iops.orNull)
      .sizeInGb(sizeInGb.orNull)
      .build()
}
