package io.burkard.cdk.services.cassandra

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ColumnProperty {

  def apply(
    columnName: Option[String] = None,
    columnType: Option[String] = None
  ): software.amazon.awscdk.services.cassandra.CfnTable.ColumnProperty =
    (new software.amazon.awscdk.services.cassandra.CfnTable.ColumnProperty.Builder)
      .columnName(columnName.orNull)
      .columnType(columnType.orNull)
      .build()
}
