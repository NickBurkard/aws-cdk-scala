package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EbsProperty {

  def apply(
    volumeType: Option[String] = None,
    encrypted: Option[Boolean] = None,
    iops: Option[Number] = None,
    deleteOnTermination: Option[Boolean] = None,
    kmsKeyId: Option[String] = None,
    volumeSize: Option[Number] = None,
    snapshotId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnInstance.EbsProperty =
    (new software.amazon.awscdk.services.ec2.CfnInstance.EbsProperty.Builder)
      .volumeType(volumeType.orNull)
      .encrypted(encrypted.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .iops(iops.orNull)
      .deleteOnTermination(deleteOnTermination.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .kmsKeyId(kmsKeyId.orNull)
      .volumeSize(volumeSize.orNull)
      .snapshotId(snapshotId.orNull)
      .build()
}
