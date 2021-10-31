package io.burkard.cdk.services.opensearchservice

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EncryptionAtRestOptionsProperty {

  def apply(
    enabled: Option[Boolean] = None,
    kmsKeyId: Option[String] = None
  ): software.amazon.awscdk.services.opensearchservice.CfnDomain.EncryptionAtRestOptionsProperty =
    (new software.amazon.awscdk.services.opensearchservice.CfnDomain.EncryptionAtRestOptionsProperty.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .kmsKeyId(kmsKeyId.orNull)
      .build()
}
