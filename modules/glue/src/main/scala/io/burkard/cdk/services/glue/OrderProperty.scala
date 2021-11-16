package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OrderProperty {

  def apply(
    column: String,
    sortOrder: Option[Number] = None
  ): software.amazon.awscdk.services.glue.CfnPartition.OrderProperty =
    (new software.amazon.awscdk.services.glue.CfnPartition.OrderProperty.Builder)
      .column(column)
      .sortOrder(sortOrder.orNull)
      .build()
}
