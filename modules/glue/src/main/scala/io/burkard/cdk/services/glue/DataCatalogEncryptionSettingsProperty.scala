package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DataCatalogEncryptionSettingsProperty {

  def apply(
    connectionPasswordEncryption: Option[software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.ConnectionPasswordEncryptionProperty] = None,
    encryptionAtRest: Option[software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.EncryptionAtRestProperty] = None
  ): software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty =
    (new software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty.Builder)
      .connectionPasswordEncryption(connectionPasswordEncryption.orNull)
      .encryptionAtRest(encryptionAtRest.orNull)
      .build()
}
