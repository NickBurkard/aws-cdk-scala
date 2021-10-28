package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InputProperty {

  def apply(
    dataCatalogInputDefinition: Option[software.amazon.awscdk.services.databrew.CfnDataset.DataCatalogInputDefinitionProperty] = None,
    databaseInputDefinition: Option[software.amazon.awscdk.services.databrew.CfnDataset.DatabaseInputDefinitionProperty] = None,
    s3InputDefinition: Option[software.amazon.awscdk.services.databrew.CfnDataset.S3LocationProperty] = None
  ): software.amazon.awscdk.services.databrew.CfnDataset.InputProperty =
    (new software.amazon.awscdk.services.databrew.CfnDataset.InputProperty.Builder)
      .dataCatalogInputDefinition(dataCatalogInputDefinition.orNull)
      .databaseInputDefinition(databaseInputDefinition.orNull)
      .s3InputDefinition(s3InputDefinition.orNull)
      .build()
}
