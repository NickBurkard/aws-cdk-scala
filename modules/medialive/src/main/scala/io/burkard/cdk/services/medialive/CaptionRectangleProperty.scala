package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CaptionRectangleProperty {

  def apply(
    leftOffset: Option[Number] = None,
    height: Option[Number] = None,
    topOffset: Option[Number] = None,
    width: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.CaptionRectangleProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.CaptionRectangleProperty.Builder)
      .leftOffset(leftOffset.orNull)
      .height(height.orNull)
      .topOffset(topOffset.orNull)
      .width(width.orNull)
      .build()
}
