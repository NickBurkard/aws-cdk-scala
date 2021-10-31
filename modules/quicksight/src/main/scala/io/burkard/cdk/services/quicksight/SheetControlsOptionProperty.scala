package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SheetControlsOptionProperty {

  def apply(
    visibilityState: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnDashboard.SheetControlsOptionProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDashboard.SheetControlsOptionProperty.Builder)
      .visibilityState(visibilityState.orNull)
      .build()
}
