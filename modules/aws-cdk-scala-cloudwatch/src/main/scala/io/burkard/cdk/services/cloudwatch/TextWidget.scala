package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TextWidget {

  def apply(
    height: Option[Number] = None,
    width: Option[Number] = None,
    markdown: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.TextWidget =
    software.amazon.awscdk.services.cloudwatch.TextWidget.Builder
      .create()
      .height(height.orNull)
      .width(width.orNull)
      .markdown(markdown.orNull)
      .build()
}
