package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DataCatalogOutputProperty {

  def apply(
    tableName: Option[String] = None,
    s3Options: Option[software.amazon.awscdk.services.databrew.CfnJob.S3TableOutputOptionsProperty] = None,
    catalogId: Option[String] = None,
    databaseOptions: Option[software.amazon.awscdk.services.databrew.CfnJob.DatabaseTableOutputOptionsProperty] = None,
    databaseName: Option[String] = None,
    overwrite: Option[Boolean] = None
  ): software.amazon.awscdk.services.databrew.CfnJob.DataCatalogOutputProperty =
    (new software.amazon.awscdk.services.databrew.CfnJob.DataCatalogOutputProperty.Builder)
      .tableName(tableName.orNull)
      .s3Options(s3Options.orNull)
      .catalogId(catalogId.orNull)
      .databaseOptions(databaseOptions.orNull)
      .databaseName(databaseName.orNull)
      .overwrite(overwrite.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
