package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
