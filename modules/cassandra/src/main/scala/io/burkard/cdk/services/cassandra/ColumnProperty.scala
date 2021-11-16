package io.burkard.cdk.services.cassandra

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ColumnProperty {

  def apply(
    columnName: String,
    columnType: String
  ): software.amazon.awscdk.services.cassandra.CfnTable.ColumnProperty =
    (new software.amazon.awscdk.services.cassandra.CfnTable.ColumnProperty.Builder)
      .columnName(columnName)
      .columnType(columnType)
      .build()
}
