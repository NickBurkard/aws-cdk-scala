package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OrderProperty {

  def apply(
    sortOrder: Number,
    column: String
  ): software.amazon.awscdk.services.glue.CfnTable.OrderProperty =
    (new software.amazon.awscdk.services.glue.CfnTable.OrderProperty.Builder)
      .sortOrder(sortOrder)
      .column(column)
      .build()
}
