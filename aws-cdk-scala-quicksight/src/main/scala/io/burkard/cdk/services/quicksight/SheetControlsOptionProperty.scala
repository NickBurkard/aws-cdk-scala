package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SheetControlsOptionProperty {

  def apply(
    visibilityState: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnDashboard.SheetControlsOptionProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDashboard.SheetControlsOptionProperty.Builder)
      .visibilityState(visibilityState.orNull)
      .build()
}
