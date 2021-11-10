package io.burkard.cdk.services.cloudwatch

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricRenderingProperties {

  def apply(
    color: Option[String] = None,
    period: Option[Number] = None,
    stat: Option[String] = None,
    label: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.MetricRenderingProperties =
    (new software.amazon.awscdk.services.cloudwatch.MetricRenderingProperties.Builder)
      .color(color.orNull)
      .period(period.orNull)
      .stat(stat.orNull)
      .label(label.orNull)
      .build()
}
