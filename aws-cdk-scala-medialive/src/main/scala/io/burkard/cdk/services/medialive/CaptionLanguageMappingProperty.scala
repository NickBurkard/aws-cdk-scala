package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CaptionLanguageMappingProperty {

  def apply(
    captionChannel: Option[Number] = None,
    languageDescription: Option[String] = None,
    languageCode: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.CaptionLanguageMappingProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.CaptionLanguageMappingProperty.Builder)
      .captionChannel(captionChannel.orNull)
      .languageDescription(languageDescription.orNull)
      .languageCode(languageCode.orNull)
      .build()
}
