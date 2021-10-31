package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UIColorPaletteProperty {

  def apply(
    measure: Option[String] = None,
    success: Option[String] = None,
    dimensionForeground: Option[String] = None,
    warning: Option[String] = None,
    accent: Option[String] = None,
    secondaryBackground: Option[String] = None,
    measureForeground: Option[String] = None,
    accentForeground: Option[String] = None,
    successForeground: Option[String] = None,
    dangerForeground: Option[String] = None,
    secondaryForeground: Option[String] = None,
    primaryBackground: Option[String] = None,
    dimension: Option[String] = None,
    primaryForeground: Option[String] = None,
    warningForeground: Option[String] = None,
    danger: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnTheme.UIColorPaletteProperty =
    (new software.amazon.awscdk.services.quicksight.CfnTheme.UIColorPaletteProperty.Builder)
      .measure(measure.orNull)
      .success(success.orNull)
      .dimensionForeground(dimensionForeground.orNull)
      .warning(warning.orNull)
      .accent(accent.orNull)
      .secondaryBackground(secondaryBackground.orNull)
      .measureForeground(measureForeground.orNull)
      .accentForeground(accentForeground.orNull)
      .successForeground(successForeground.orNull)
      .dangerForeground(dangerForeground.orNull)
      .secondaryForeground(secondaryForeground.orNull)
      .primaryBackground(primaryBackground.orNull)
      .dimension(dimension.orNull)
      .primaryForeground(primaryForeground.orNull)
      .warningForeground(warningForeground.orNull)
      .danger(danger.orNull)
      .build()
}
