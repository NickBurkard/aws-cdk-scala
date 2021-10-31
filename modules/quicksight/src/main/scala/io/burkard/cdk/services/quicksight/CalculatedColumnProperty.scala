package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CalculatedColumnProperty {

  def apply(
    columnName: Option[String] = None,
    columnId: Option[String] = None,
    expression: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.CalculatedColumnProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.CalculatedColumnProperty.Builder)
      .columnName(columnName.orNull)
      .columnId(columnId.orNull)
      .expression(expression.orNull)
      .build()
}
