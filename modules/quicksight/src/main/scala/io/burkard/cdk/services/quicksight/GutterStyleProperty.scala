package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GutterStyleProperty {

  def apply(
    show: Option[Boolean] = None
  ): software.amazon.awscdk.services.quicksight.CfnTheme.GutterStyleProperty =
    (new software.amazon.awscdk.services.quicksight.CfnTheme.GutterStyleProperty.Builder)
      .show(show.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}