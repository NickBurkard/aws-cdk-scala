package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EncryptionAtRestProperty {

  def apply(
    catalogEncryptionMode: Option[String] = None,
    sseAwsKmsKeyId: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.EncryptionAtRestProperty =
    (new software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.EncryptionAtRestProperty.Builder)
      .catalogEncryptionMode(catalogEncryptionMode.orNull)
      .sseAwsKmsKeyId(sseAwsKmsKeyId.orNull)
      .build()
}
