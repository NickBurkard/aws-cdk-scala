package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HorizontalAnnotation {

  def apply(
    visible: Option[Boolean] = None,
    label: Option[String] = None,
    color: Option[String] = None,
    fill: Option[software.amazon.awscdk.services.cloudwatch.Shading] = None,
    value: Option[Number] = None
  ): software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation =
    (new software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation.Builder)
      .visible(visible.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .label(label.orNull)
      .color(color.orNull)
      .fill(fill.orNull)
      .value(value.orNull)
      .build()
}
