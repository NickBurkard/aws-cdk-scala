package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SheetStyleProperty {

  def apply(
    tileLayout: Option[software.amazon.awscdk.services.quicksight.CfnTheme.TileLayoutStyleProperty] = None,
    tile: Option[software.amazon.awscdk.services.quicksight.CfnTheme.TileStyleProperty] = None
  ): software.amazon.awscdk.services.quicksight.CfnTheme.SheetStyleProperty =
    (new software.amazon.awscdk.services.quicksight.CfnTheme.SheetStyleProperty.Builder)
      .tileLayout(tileLayout.orNull)
      .tile(tile.orNull)
      .build()
}
