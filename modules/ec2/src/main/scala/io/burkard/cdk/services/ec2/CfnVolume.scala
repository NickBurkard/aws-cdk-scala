package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnVolume {

  def apply(
    internalResourceId: String,
    size: Option[Number] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    availabilityZone: Option[String] = None,
    volumeType: Option[String] = None,
    autoEnableIo: Option[Boolean] = None,
    encrypted: Option[Boolean] = None,
    multiAttachEnabled: Option[Boolean] = None,
    kmsKeyId: Option[String] = None,
    throughput: Option[Number] = None,
    snapshotId: Option[String] = None,
    outpostArn: Option[String] = None,
    iops: Option[Number] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnVolume =
    software.amazon.awscdk.services.ec2.CfnVolume.Builder
      .create(stackCtx, internalResourceId)
      .size(size.orNull)
      .tags(tags.map(_.asJava).orNull)
      .availabilityZone(availabilityZone.orNull)
      .volumeType(volumeType.orNull)
      .autoEnableIo(autoEnableIo.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .encrypted(encrypted.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .multiAttachEnabled(multiAttachEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .kmsKeyId(kmsKeyId.orNull)
      .throughput(throughput.orNull)
      .snapshotId(snapshotId.orNull)
      .outpostArn(outpostArn.orNull)
      .iops(iops.orNull)
      .build()
}
