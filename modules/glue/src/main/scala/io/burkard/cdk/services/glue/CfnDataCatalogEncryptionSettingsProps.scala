package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDataCatalogEncryptionSettingsProps {

  def apply(
    dataCatalogEncryptionSettings: software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty,
    catalogId: String
  ): software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettingsProps =
    (new software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettingsProps.Builder)
      .dataCatalogEncryptionSettings(dataCatalogEncryptionSettings)
      .catalogId(catalogId)
      .build()
}
