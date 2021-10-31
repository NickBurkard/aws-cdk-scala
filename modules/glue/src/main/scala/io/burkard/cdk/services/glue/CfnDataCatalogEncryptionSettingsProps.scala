package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDataCatalogEncryptionSettingsProps {

  def apply(
    dataCatalogEncryptionSettings: Option[software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty] = None,
    catalogId: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettingsProps =
    (new software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettingsProps.Builder)
      .dataCatalogEncryptionSettings(dataCatalogEncryptionSettings.orNull)
      .catalogId(catalogId.orNull)
      .build()
}
