package io.burkard.cdk.services.docdb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Login {

  def apply(
    username: String,
    kmsKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    excludeCharacters: Option[String] = None,
    secretName: Option[String] = None,
    password: Option[software.amazon.awscdk.SecretValue] = None
  ): software.amazon.awscdk.services.docdb.Login =
    (new software.amazon.awscdk.services.docdb.Login.Builder)
      .username(username)
      .kmsKey(kmsKey.orNull)
      .excludeCharacters(excludeCharacters.orNull)
      .secretName(secretName.orNull)
      .password(password.orNull)
      .build()
}
