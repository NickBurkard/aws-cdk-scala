package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ColumnTagProperty {

  def apply(
    columnDescription: Option[software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnDescriptionProperty] = None,
    columnGeographicRole: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnTagProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnTagProperty.Builder)
      .columnDescription(columnDescription.orNull)
      .columnGeographicRole(columnGeographicRole.orNull)
      .build()
}
