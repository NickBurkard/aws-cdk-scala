package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
