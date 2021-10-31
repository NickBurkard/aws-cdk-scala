package io.burkard.cdk.services.elasticsearch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EncryptionAtRestOptions {

  def apply(
    kmsKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.elasticsearch.EncryptionAtRestOptions =
    (new software.amazon.awscdk.services.elasticsearch.EncryptionAtRestOptions.Builder)
      .kmsKey(kmsKey.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
