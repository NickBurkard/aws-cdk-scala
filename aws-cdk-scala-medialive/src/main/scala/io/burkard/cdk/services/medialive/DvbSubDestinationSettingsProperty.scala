package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DvbSubDestinationSettingsProperty {

  def apply(
    xPosition: Option[Number] = None,
    backgroundColor: Option[String] = None,
    shadowOpacity: Option[Number] = None,
    fontColor: Option[String] = None,
    backgroundOpacity: Option[Number] = None,
    shadowYOffset: Option[Number] = None,
    font: Option[software.amazon.awscdk.services.medialive.CfnChannel.InputLocationProperty] = None,
    alignment: Option[String] = None,
    teletextGridControl: Option[String] = None,
    yPosition: Option[Number] = None,
    fontResolution: Option[Number] = None,
    shadowXOffset: Option[Number] = None,
    fontOpacity: Option[Number] = None,
    shadowColor: Option[String] = None,
    fontSize: Option[String] = None,
    outlineSize: Option[Number] = None,
    outlineColor: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.DvbSubDestinationSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.DvbSubDestinationSettingsProperty.Builder)
      .xPosition(xPosition.orNull)
      .backgroundColor(backgroundColor.orNull)
      .shadowOpacity(shadowOpacity.orNull)
      .fontColor(fontColor.orNull)
      .backgroundOpacity(backgroundOpacity.orNull)
      .shadowYOffset(shadowYOffset.orNull)
      .font(font.orNull)
      .alignment(alignment.orNull)
      .teletextGridControl(teletextGridControl.orNull)
      .yPosition(yPosition.orNull)
      .fontResolution(fontResolution.orNull)
      .shadowXOffset(shadowXOffset.orNull)
      .fontOpacity(fontOpacity.orNull)
      .shadowColor(shadowColor.orNull)
      .fontSize(fontSize.orNull)
      .outlineSize(outlineSize.orNull)
      .outlineColor(outlineColor.orNull)
      .build()
}
