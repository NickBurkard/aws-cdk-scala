package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DatabaseInputDefinitionProperty {

  def apply(
    databaseTableName: Option[String] = None,
    tempDirectory: Option[software.amazon.awscdk.services.databrew.CfnDataset.S3LocationProperty] = None,
    glueConnectionName: Option[String] = None
  ): software.amazon.awscdk.services.databrew.CfnDataset.DatabaseInputDefinitionProperty =
    (new software.amazon.awscdk.services.databrew.CfnDataset.DatabaseInputDefinitionProperty.Builder)
      .databaseTableName(databaseTableName.orNull)
      .tempDirectory(tempDirectory.orNull)
      .glueConnectionName(glueConnectionName.orNull)
      .build()
}
