package io.burkard.cdk.services.imagebuilder

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EbsInstanceBlockDeviceSpecificationProperty {

  def apply(
    volumeType: Option[String] = None,
    encrypted: Option[Boolean] = None,
    iops: Option[Number] = None,
    deleteOnTermination: Option[Boolean] = None,
    kmsKeyId: Option[String] = None,
    throughput: Option[Number] = None,
    volumeSize: Option[Number] = None,
    snapshotId: Option[String] = None
  ): software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.EbsInstanceBlockDeviceSpecificationProperty =
    (new software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.EbsInstanceBlockDeviceSpecificationProperty.Builder)
      .volumeType(volumeType.orNull)
      .encrypted(encrypted.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .iops(iops.orNull)
      .deleteOnTermination(deleteOnTermination.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .kmsKeyId(kmsKeyId.orNull)
      .throughput(throughput.orNull)
      .volumeSize(volumeSize.orNull)
      .snapshotId(snapshotId.orNull)
      .build()
}
