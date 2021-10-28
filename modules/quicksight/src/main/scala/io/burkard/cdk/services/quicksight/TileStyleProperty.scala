package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TileStyleProperty {

  def apply(
    border: Option[software.amazon.awscdk.services.quicksight.CfnTheme.BorderStyleProperty] = None
  ): software.amazon.awscdk.services.quicksight.CfnTheme.TileStyleProperty =
    (new software.amazon.awscdk.services.quicksight.CfnTheme.TileStyleProperty.Builder)
      .border(border.orNull)
      .build()
}
