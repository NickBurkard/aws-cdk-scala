package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DatabaseInputDefinitionProperty {

  def apply(
    glueConnectionName: String,
    databaseTableName: Option[String] = None,
    tempDirectory: Option[software.amazon.awscdk.services.databrew.CfnDataset.S3LocationProperty] = None,
    queryString: Option[String] = None
  ): software.amazon.awscdk.services.databrew.CfnDataset.DatabaseInputDefinitionProperty =
    (new software.amazon.awscdk.services.databrew.CfnDataset.DatabaseInputDefinitionProperty.Builder)
      .glueConnectionName(glueConnectionName)
      .databaseTableName(databaseTableName.orNull)
      .tempDirectory(tempDirectory.orNull)
      .queryString(queryString.orNull)
      .build()
}
