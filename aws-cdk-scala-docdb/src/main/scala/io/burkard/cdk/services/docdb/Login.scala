package io.burkard.cdk.services.docdb

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Login {

  def apply(
    kmsKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    username: Option[String] = None,
    password: Option[software.amazon.awscdk.SecretValue] = None
  ): software.amazon.awscdk.services.docdb.Login =
    (new software.amazon.awscdk.services.docdb.Login.Builder)
      .kmsKey(kmsKey.orNull)
      .username(username.orNull)
      .password(password.orNull)
      .build()
}
