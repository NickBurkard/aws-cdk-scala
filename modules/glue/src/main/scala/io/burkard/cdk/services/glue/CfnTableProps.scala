package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTableProps {

  def apply(
    catalogId: String,
    tableInput: software.amazon.awscdk.services.glue.CfnTable.TableInputProperty,
    databaseName: String
  ): software.amazon.awscdk.services.glue.CfnTableProps =
    (new software.amazon.awscdk.services.glue.CfnTableProps.Builder)
      .catalogId(catalogId)
      .tableInput(tableInput)
      .databaseName(databaseName)
      .build()
}
