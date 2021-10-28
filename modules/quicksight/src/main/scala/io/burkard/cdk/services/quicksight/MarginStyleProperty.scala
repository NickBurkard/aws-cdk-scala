package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MarginStyleProperty {

  def apply(
    show: Option[Boolean] = None
  ): software.amazon.awscdk.services.quicksight.CfnTheme.MarginStyleProperty =
    (new software.amazon.awscdk.services.quicksight.CfnTheme.MarginStyleProperty.Builder)
      .show(show.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}