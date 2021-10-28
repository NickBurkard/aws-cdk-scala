package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TransformOperationProperty {

  def apply(
    filterOperation: Option[software.amazon.awscdk.services.quicksight.CfnDataSet.FilterOperationProperty] = None,
    castColumnTypeOperation: Option[software.amazon.awscdk.services.quicksight.CfnDataSet.CastColumnTypeOperationProperty] = None,
    renameColumnOperation: Option[software.amazon.awscdk.services.quicksight.CfnDataSet.RenameColumnOperationProperty] = None,
    createColumnsOperation: Option[software.amazon.awscdk.services.quicksight.CfnDataSet.CreateColumnsOperationProperty] = None,
    projectOperation: Option[software.amazon.awscdk.services.quicksight.CfnDataSet.ProjectOperationProperty] = None,
    tagColumnOperation: Option[software.amazon.awscdk.services.quicksight.CfnDataSet.TagColumnOperationProperty] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.TransformOperationProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.TransformOperationProperty.Builder)
      .filterOperation(filterOperation.orNull)
      .castColumnTypeOperation(castColumnTypeOperation.orNull)
      .renameColumnOperation(renameColumnOperation.orNull)
      .createColumnsOperation(createColumnsOperation.orNull)
      .projectOperation(projectOperation.orNull)
      .tagColumnOperation(tagColumnOperation.orNull)
      .build()
}
