package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ThemeConfigurationProperty {

  def apply(
    sheet: Option[software.amazon.awscdk.services.quicksight.CfnTheme.SheetStyleProperty] = None,
    typography: Option[software.amazon.awscdk.services.quicksight.CfnTheme.TypographyProperty] = None,
    uiColorPalette: Option[software.amazon.awscdk.services.quicksight.CfnTheme.UIColorPaletteProperty] = None,
    dataColorPalette: Option[software.amazon.awscdk.services.quicksight.CfnTheme.DataColorPaletteProperty] = None
  ): software.amazon.awscdk.services.quicksight.CfnTheme.ThemeConfigurationProperty =
    (new software.amazon.awscdk.services.quicksight.CfnTheme.ThemeConfigurationProperty.Builder)
      .sheet(sheet.orNull)
      .typography(typography.orNull)
      .uiColorPalette(uiColorPalette.orNull)
      .dataColorPalette(dataColorPalette.orNull)
      .build()
}
