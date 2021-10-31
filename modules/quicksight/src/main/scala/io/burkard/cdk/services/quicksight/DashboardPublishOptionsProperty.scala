package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DashboardPublishOptionsProperty {

  def apply(
    sheetControlsOption: Option[software.amazon.awscdk.services.quicksight.CfnDashboard.SheetControlsOptionProperty] = None,
    adHocFilteringOption: Option[software.amazon.awscdk.services.quicksight.CfnDashboard.AdHocFilteringOptionProperty] = None,
    exportToCsvOption: Option[software.amazon.awscdk.services.quicksight.CfnDashboard.ExportToCSVOptionProperty] = None
  ): software.amazon.awscdk.services.quicksight.CfnDashboard.DashboardPublishOptionsProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDashboard.DashboardPublishOptionsProperty.Builder)
      .sheetControlsOption(sheetControlsOption.orNull)
      .adHocFilteringOption(adHocFilteringOption.orNull)
      .exportToCsvOption(exportToCsvOption.orNull)
      .build()
}
