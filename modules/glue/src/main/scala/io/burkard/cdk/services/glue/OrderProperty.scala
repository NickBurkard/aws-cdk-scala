package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OrderProperty {

  def apply(
    sortOrder: Option[Number] = None,
    column: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnPartition.OrderProperty =
    (new software.amazon.awscdk.services.glue.CfnPartition.OrderProperty.Builder)
      .sortOrder(sortOrder.orNull)
      .column(column.orNull)
      .build()
}
