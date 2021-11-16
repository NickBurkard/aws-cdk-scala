package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTable {

  def apply(
    internalResourceId: String,
    catalogId: String,
    tableInput: software.amazon.awscdk.services.glue.CfnTable.TableInputProperty,
    databaseName: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.glue.CfnTable =
    software.amazon.awscdk.services.glue.CfnTable.Builder
      .create(stackCtx, internalResourceId)
      .catalogId(catalogId)
      .tableInput(tableInput)
      .databaseName(databaseName)
      .build()
}
