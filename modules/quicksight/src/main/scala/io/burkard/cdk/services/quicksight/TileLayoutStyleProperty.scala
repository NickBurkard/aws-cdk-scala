package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TileLayoutStyleProperty {

  def apply(
    margin: Option[software.amazon.awscdk.services.quicksight.CfnTheme.MarginStyleProperty] = None,
    gutter: Option[software.amazon.awscdk.services.quicksight.CfnTheme.GutterStyleProperty] = None
  ): software.amazon.awscdk.services.quicksight.CfnTheme.TileLayoutStyleProperty =
    (new software.amazon.awscdk.services.quicksight.CfnTheme.TileLayoutStyleProperty.Builder)
      .margin(margin.orNull)
      .gutter(gutter.orNull)
      .build()
}
