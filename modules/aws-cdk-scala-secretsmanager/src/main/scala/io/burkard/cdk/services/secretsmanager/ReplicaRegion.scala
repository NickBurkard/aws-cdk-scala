package io.burkard.cdk.services.secretsmanager

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ReplicaRegion {

  def apply(
    region: Option[String] = None,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None
  ): software.amazon.awscdk.services.secretsmanager.ReplicaRegion =
    (new software.amazon.awscdk.services.secretsmanager.ReplicaRegion.Builder)
      .region(region.orNull)
      .encryptionKey(encryptionKey.orNull)
      .build()
}
