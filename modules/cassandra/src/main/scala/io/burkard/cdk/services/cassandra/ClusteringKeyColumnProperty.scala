package io.burkard.cdk.services.cassandra

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClusteringKeyColumnProperty {

  def apply(
    column: software.amazon.awscdk.services.cassandra.CfnTable.ColumnProperty,
    orderBy: Option[String] = None
  ): software.amazon.awscdk.services.cassandra.CfnTable.ClusteringKeyColumnProperty =
    (new software.amazon.awscdk.services.cassandra.CfnTable.ClusteringKeyColumnProperty.Builder)
      .column(column)
      .orderBy(orderBy.orNull)
      .build()
}
