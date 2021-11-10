package io.burkard.cdk.services.docdb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DatabaseSecretProps {

  def apply(
    username: Option[String] = None,
    masterSecret: Option[software.amazon.awscdk.services.secretsmanager.ISecret] = None,
    excludeCharacters: Option[String] = None,
    secretName: Option[String] = None,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None
  ): software.amazon.awscdk.services.docdb.DatabaseSecretProps =
    (new software.amazon.awscdk.services.docdb.DatabaseSecretProps.Builder)
      .username(username.orNull)
      .masterSecret(masterSecret.orNull)
      .excludeCharacters(excludeCharacters.orNull)
      .secretName(secretName.orNull)
      .encryptionKey(encryptionKey.orNull)
      .build()
}
