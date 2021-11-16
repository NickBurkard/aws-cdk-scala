package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CalculatedColumnProperty {

  def apply(
    columnName: String,
    columnId: String,
    expression: String
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.CalculatedColumnProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.CalculatedColumnProperty.Builder)
      .columnName(columnName)
      .columnId(columnId)
      .expression(expression)
      .build()
}
