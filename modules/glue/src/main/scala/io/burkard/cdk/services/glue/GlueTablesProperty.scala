package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GlueTablesProperty {

  def apply(
    tableName: String,
    databaseName: String,
    connectionName: Option[String] = None,
    catalogId: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnMLTransform.GlueTablesProperty =
    (new software.amazon.awscdk.services.glue.CfnMLTransform.GlueTablesProperty.Builder)
      .tableName(tableName)
      .databaseName(databaseName)
      .connectionName(connectionName.orNull)
      .catalogId(catalogId.orNull)
      .build()
}
