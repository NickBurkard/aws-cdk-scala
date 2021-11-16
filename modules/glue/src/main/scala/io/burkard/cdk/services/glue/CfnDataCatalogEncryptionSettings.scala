package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDataCatalogEncryptionSettings {

  def apply(
    internalResourceId: String,
    dataCatalogEncryptionSettings: software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty,
    catalogId: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings =
    software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.Builder
      .create(stackCtx, internalResourceId)
      .dataCatalogEncryptionSettings(dataCatalogEncryptionSettings)
      .catalogId(catalogId)
      .build()
}
