package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DashboardSourceEntityProperty {

  def apply(
    sourceTemplate: Option[software.amazon.awscdk.services.quicksight.CfnDashboard.DashboardSourceTemplateProperty] = None
  ): software.amazon.awscdk.services.quicksight.CfnDashboard.DashboardSourceEntityProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDashboard.DashboardSourceEntityProperty.Builder)
      .sourceTemplate(sourceTemplate.orNull)
      .build()
}
