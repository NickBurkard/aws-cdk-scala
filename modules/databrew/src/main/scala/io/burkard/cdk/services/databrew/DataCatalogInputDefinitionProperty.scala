package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DataCatalogInputDefinitionProperty {

  def apply(
    tempDirectory: Option[software.amazon.awscdk.services.databrew.CfnDataset.S3LocationProperty] = None,
    tableName: Option[String] = None,
    catalogId: Option[String] = None,
    databaseName: Option[String] = None
  ): software.amazon.awscdk.services.databrew.CfnDataset.DataCatalogInputDefinitionProperty =
    (new software.amazon.awscdk.services.databrew.CfnDataset.DataCatalogInputDefinitionProperty.Builder)
      .tempDirectory(tempDirectory.orNull)
      .tableName(tableName.orNull)
      .catalogId(catalogId.orNull)
      .databaseName(databaseName.orNull)
      .build()
}
