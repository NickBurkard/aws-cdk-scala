package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CastColumnTypeOperationProperty {

  def apply(
    format: Option[String] = None,
    columnName: Option[String] = None,
    newColumnType: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.CastColumnTypeOperationProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.CastColumnTypeOperationProperty.Builder)
      .format(format.orNull)
      .columnName(columnName.orNull)
      .newColumnType(newColumnType.orNull)
      .build()
}
