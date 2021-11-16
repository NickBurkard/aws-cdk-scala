package io.burkard.cdk.services.secretsmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ReplicaRegion {

  def apply(
    region: String,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None
  ): software.amazon.awscdk.services.secretsmanager.ReplicaRegion =
    (new software.amazon.awscdk.services.secretsmanager.ReplicaRegion.Builder)
      .region(region)
      .encryptionKey(encryptionKey.orNull)
      .build()
}
