package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AudioLanguageSelectionProperty {

  def apply(
    languageCode: Option[String] = None,
    languageSelectionPolicy: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.AudioLanguageSelectionProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.AudioLanguageSelectionProperty.Builder)
      .languageCode(languageCode.orNull)
      .languageSelectionPolicy(languageSelectionPolicy.orNull)
      .build()
}
