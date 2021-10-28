package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTableProps {

  def apply(
    catalogId: Option[String] = None,
    tableInput: Option[software.amazon.awscdk.services.glue.CfnTable.TableInputProperty] = None,
    databaseName: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnTableProps =
    (new software.amazon.awscdk.services.glue.CfnTableProps.Builder)
      .catalogId(catalogId.orNull)
      .tableInput(tableInput.orNull)
      .databaseName(databaseName.orNull)
      .build()
}
