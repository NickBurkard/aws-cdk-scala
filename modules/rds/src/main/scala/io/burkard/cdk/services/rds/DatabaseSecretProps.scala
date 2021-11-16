package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DatabaseSecretProps {

  def apply(
    username: String,
    replicaRegions: Option[List[_ <: software.amazon.awscdk.services.secretsmanager.ReplicaRegion]] = None,
    masterSecret: Option[software.amazon.awscdk.services.secretsmanager.ISecret] = None,
    excludeCharacters: Option[String] = None,
    replaceOnPasswordCriteriaChanges: Option[Boolean] = None,
    secretName: Option[String] = None,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None
  ): software.amazon.awscdk.services.rds.DatabaseSecretProps =
    (new software.amazon.awscdk.services.rds.DatabaseSecretProps.Builder)
      .username(username)
      .replicaRegions(replicaRegions.map(_.asJava).orNull)
      .masterSecret(masterSecret.orNull)
      .excludeCharacters(excludeCharacters.orNull)
      .replaceOnPasswordCriteriaChanges(replaceOnPasswordCriteriaChanges.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .secretName(secretName.orNull)
      .encryptionKey(encryptionKey.orNull)
      .build()
}
