package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HorizontalAnnotation {

  def apply(
    value: Number,
    visible: Option[Boolean] = None,
    label: Option[String] = None,
    color: Option[String] = None,
    fill: Option[software.amazon.awscdk.services.cloudwatch.Shading] = None
  ): software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation =
    (new software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation.Builder)
      .value(value)
      .visible(visible.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .label(label.orNull)
      .color(color.orNull)
      .fill(fill.orNull)
      .build()
}
