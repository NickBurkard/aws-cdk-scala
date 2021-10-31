package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDataCatalogEncryptionSettings {

  def apply(
    internalResourceId: String,
    dataCatalogEncryptionSettings: Option[software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty] = None,
    catalogId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings =
    software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.Builder
      .create(stackCtx, internalResourceId)
      .dataCatalogEncryptionSettings(dataCatalogEncryptionSettings.orNull)
      .catalogId(catalogId.orNull)
      .build()
}
