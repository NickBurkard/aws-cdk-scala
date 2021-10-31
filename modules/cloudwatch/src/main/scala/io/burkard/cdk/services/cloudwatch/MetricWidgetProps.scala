package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricWidgetProps {

  def apply(
    height: Option[Number] = None,
    region: Option[String] = None,
    title: Option[String] = None,
    width: Option[Number] = None
  ): software.amazon.awscdk.services.cloudwatch.MetricWidgetProps =
    (new software.amazon.awscdk.services.cloudwatch.MetricWidgetProps.Builder)
      .height(height.orNull)
      .region(region.orNull)
      .title(title.orNull)
      .width(width.orNull)
      .build()
}
