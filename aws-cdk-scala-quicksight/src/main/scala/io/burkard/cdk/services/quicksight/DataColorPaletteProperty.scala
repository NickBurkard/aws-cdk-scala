package io.burkard.cdk.services.quicksight

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DataColorPaletteProperty {

  def apply(
    colors: Option[List[String]] = None,
    emptyFillColor: Option[String] = None,
    minMaxGradient: Option[List[String]] = None
  ): software.amazon.awscdk.services.quicksight.CfnTheme.DataColorPaletteProperty =
    (new software.amazon.awscdk.services.quicksight.CfnTheme.DataColorPaletteProperty.Builder)
      .colors(colors.map(_.asJava).orNull)
      .emptyFillColor(emptyFillColor.orNull)
      .minMaxGradient(minMaxGradient.map(_.asJava).orNull)
      .build()
}
