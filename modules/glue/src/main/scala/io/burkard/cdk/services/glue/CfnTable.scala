package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTable {

  def apply(
    internalResourceId: String,
    catalogId: Option[String] = None,
    tableInput: Option[software.amazon.awscdk.services.glue.CfnTable.TableInputProperty] = None,
    databaseName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.glue.CfnTable =
    software.amazon.awscdk.services.glue.CfnTable.Builder
      .create(stackCtx, internalResourceId)
      .catalogId(catalogId.orNull)
      .tableInput(tableInput.orNull)
      .databaseName(databaseName.orNull)
      .build()
}
