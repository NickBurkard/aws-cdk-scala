package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CastColumnTypeOperationProperty {

  def apply(
    columnName: String,
    newColumnType: String,
    format: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.CastColumnTypeOperationProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.CastColumnTypeOperationProperty.Builder)
      .columnName(columnName)
      .newColumnType(newColumnType)
      .format(format.orNull)
      .build()
}
