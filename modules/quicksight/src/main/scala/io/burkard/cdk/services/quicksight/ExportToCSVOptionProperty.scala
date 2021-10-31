package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ExportToCSVOptionProperty {

  def apply(
    availabilityStatus: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnDashboard.ExportToCSVOptionProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDashboard.ExportToCSVOptionProperty.Builder)
      .availabilityStatus(availabilityStatus.orNull)
      .build()
}
