package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TextWidget {

  def apply(
    markdown: String,
    height: Option[Number] = None,
    width: Option[Number] = None
  ): software.amazon.awscdk.services.cloudwatch.TextWidget =
    software.amazon.awscdk.services.cloudwatch.TextWidget.Builder
      .create()
      .markdown(markdown)
      .height(height.orNull)
      .width(width.orNull)
      .build()
}
