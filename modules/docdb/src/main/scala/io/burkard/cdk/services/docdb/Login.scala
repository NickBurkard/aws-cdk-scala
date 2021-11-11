package io.burkard.cdk.services.docdb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Login {

  def apply(
    kmsKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    username: Option[String] = None,
    excludeCharacters: Option[String] = None,
    password: Option[software.amazon.awscdk.SecretValue] = None
  ): software.amazon.awscdk.services.docdb.Login =
    (new software.amazon.awscdk.services.docdb.Login.Builder)
      .kmsKey(kmsKey.orNull)
      .username(username.orNull)
      .excludeCharacters(excludeCharacters.orNull)
      .password(password.orNull)
      .build()
}
