package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RenameColumnOperationProperty {

  def apply(
    columnName: String,
    newColumnName: String
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.RenameColumnOperationProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.RenameColumnOperationProperty.Builder)
      .columnName(columnName)
      .newColumnName(newColumnName)
      .build()
}
