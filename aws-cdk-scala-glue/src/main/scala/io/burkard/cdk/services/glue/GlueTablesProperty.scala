package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GlueTablesProperty {

  def apply(
    connectionName: Option[String] = None,
    tableName: Option[String] = None,
    catalogId: Option[String] = None,
    databaseName: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnMLTransform.GlueTablesProperty =
    (new software.amazon.awscdk.services.glue.CfnMLTransform.GlueTablesProperty.Builder)
      .connectionName(connectionName.orNull)
      .tableName(tableName.orNull)
      .catalogId(catalogId.orNull)
      .databaseName(databaseName.orNull)
      .build()
}
