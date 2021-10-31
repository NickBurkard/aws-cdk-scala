package io.burkard.cdk.services.cassandra

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClusteringKeyColumnProperty {

  def apply(
    orderBy: Option[String] = None,
    column: Option[software.amazon.awscdk.services.cassandra.CfnTable.ColumnProperty] = None
  ): software.amazon.awscdk.services.cassandra.CfnTable.ClusteringKeyColumnProperty =
    (new software.amazon.awscdk.services.cassandra.CfnTable.ClusteringKeyColumnProperty.Builder)
      .orderBy(orderBy.orNull)
      .column(column.orNull)
      .build()
}
