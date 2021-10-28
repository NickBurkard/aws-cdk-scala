package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CaptionSelectorProperty {

  def apply(
    name: Option[String] = None,
    selectorSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.CaptionSelectorSettingsProperty] = None,
    languageCode: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.CaptionSelectorProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.CaptionSelectorProperty.Builder)
      .name(name.orNull)
      .selectorSettings(selectorSettings.orNull)
      .languageCode(languageCode.orNull)
      .build()
}
