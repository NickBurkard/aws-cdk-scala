package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TextWidgetProps {

  def apply(
    height: Option[Number] = None,
    width: Option[Number] = None,
    markdown: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.TextWidgetProps =
    (new software.amazon.awscdk.services.cloudwatch.TextWidgetProps.Builder)
      .height(height.orNull)
      .width(width.orNull)
      .markdown(markdown.orNull)
      .build()
}
