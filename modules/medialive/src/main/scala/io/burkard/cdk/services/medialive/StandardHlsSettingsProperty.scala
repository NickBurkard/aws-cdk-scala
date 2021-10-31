package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StandardHlsSettingsProperty {

  def apply(
    audioRenditionSets: Option[String] = None,
    m3U8Settings: Option[software.amazon.awscdk.services.medialive.CfnChannel.M3u8SettingsProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.StandardHlsSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.StandardHlsSettingsProperty.Builder)
      .audioRenditionSets(audioRenditionSets.orNull)
      .m3U8Settings(m3U8Settings.orNull)
      .build()
}
