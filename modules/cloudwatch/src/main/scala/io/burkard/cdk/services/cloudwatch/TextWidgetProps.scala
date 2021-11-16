package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TextWidgetProps {

  def apply(
    markdown: String,
    height: Option[Number] = None,
    width: Option[Number] = None
  ): software.amazon.awscdk.services.cloudwatch.TextWidgetProps =
    (new software.amazon.awscdk.services.cloudwatch.TextWidgetProps.Builder)
      .markdown(markdown)
      .height(height.orNull)
      .width(width.orNull)
      .build()
}
