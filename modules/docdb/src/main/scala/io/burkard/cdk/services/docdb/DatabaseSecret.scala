package io.burkard.cdk.services.docdb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DatabaseSecret {

  def apply(
    internalResourceId: String,
    username: Option[String] = None,
    masterSecret: Option[software.amazon.awscdk.services.secretsmanager.ISecret] = None,
    secretName: Option[String] = None,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.docdb.DatabaseSecret =
    software.amazon.awscdk.services.docdb.DatabaseSecret.Builder
      .create(stackCtx, internalResourceId)
      .username(username.orNull)
      .masterSecret(masterSecret.orNull)
      .secretName(secretName.orNull)
      .encryptionKey(encryptionKey.orNull)
      .build()
}
