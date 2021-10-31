package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConnectionPasswordEncryptionProperty {

  def apply(
    returnConnectionPasswordEncrypted: Option[Boolean] = None,
    kmsKeyId: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.ConnectionPasswordEncryptionProperty =
    (new software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.ConnectionPasswordEncryptionProperty.Builder)
      .returnConnectionPasswordEncrypted(returnConnectionPasswordEncrypted.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .kmsKeyId(kmsKeyId.orNull)
      .build()
}
