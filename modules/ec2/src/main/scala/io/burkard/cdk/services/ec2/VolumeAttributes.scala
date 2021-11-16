package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VolumeAttributes {

  def apply(
    availabilityZone: String,
    volumeId: String,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None
  ): software.amazon.awscdk.services.ec2.VolumeAttributes =
    (new software.amazon.awscdk.services.ec2.VolumeAttributes.Builder)
      .availabilityZone(availabilityZone)
      .volumeId(volumeId)
      .encryptionKey(encryptionKey.orNull)
      .build()
}
