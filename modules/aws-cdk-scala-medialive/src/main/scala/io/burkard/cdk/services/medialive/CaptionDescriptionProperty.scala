package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CaptionDescriptionProperty {

  def apply(
    name: Option[String] = None,
    languageDescription: Option[String] = None,
    languageCode: Option[String] = None,
    destinationSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.CaptionDestinationSettingsProperty] = None,
    captionSelectorName: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.CaptionDescriptionProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.CaptionDescriptionProperty.Builder)
      .name(name.orNull)
      .languageDescription(languageDescription.orNull)
      .languageCode(languageCode.orNull)
      .destinationSettings(destinationSettings.orNull)
      .captionSelectorName(captionSelectorName.orNull)
      .build()
}
