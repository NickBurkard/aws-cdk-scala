package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SnapshotCredentialsFromGeneratedPasswordOptions {

  def apply(
    replicaRegions: Option[List[_ <: software.amazon.awscdk.services.secretsmanager.ReplicaRegion]] = None,
    excludeCharacters: Option[String] = None,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None
  ): software.amazon.awscdk.services.rds.SnapshotCredentialsFromGeneratedPasswordOptions =
    (new software.amazon.awscdk.services.rds.SnapshotCredentialsFromGeneratedPasswordOptions.Builder)
      .replicaRegions(replicaRegions.map(_.asJava).orNull)
      .excludeCharacters(excludeCharacters.orNull)
      .encryptionKey(encryptionKey.orNull)
      .build()
}
