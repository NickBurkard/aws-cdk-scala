package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VolumeAttributes {

  def apply(
    availabilityZone: Option[String] = None,
    volumeId: Option[String] = None,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None
  ): software.amazon.awscdk.services.ec2.VolumeAttributes =
    (new software.amazon.awscdk.services.ec2.VolumeAttributes.Builder)
      .availabilityZone(availabilityZone.orNull)
      .volumeId(volumeId.orNull)
      .encryptionKey(encryptionKey.orNull)
      .build()
}
