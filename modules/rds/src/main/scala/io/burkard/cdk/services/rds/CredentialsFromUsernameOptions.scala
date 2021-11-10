package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CredentialsFromUsernameOptions {

  def apply(
    replicaRegions: Option[List[_ <: software.amazon.awscdk.services.secretsmanager.ReplicaRegion]] = None,
    excludeCharacters: Option[String] = None,
    secretName: Option[String] = None,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    password: Option[software.amazon.awscdk.SecretValue] = None
  ): software.amazon.awscdk.services.rds.CredentialsFromUsernameOptions =
    (new software.amazon.awscdk.services.rds.CredentialsFromUsernameOptions.Builder)
      .replicaRegions(replicaRegions.map(_.asJava).orNull)
      .excludeCharacters(excludeCharacters.orNull)
      .secretName(secretName.orNull)
      .encryptionKey(encryptionKey.orNull)
      .password(password.orNull)
      .build()
}
