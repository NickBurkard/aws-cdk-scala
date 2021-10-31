package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AudioCodecSettingsProperty {

  def apply(
    aacSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.AacSettingsProperty] = None,
    eac3Settings: Option[software.amazon.awscdk.services.medialive.CfnChannel.Eac3SettingsProperty] = None,
    wavSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.WavSettingsProperty] = None,
    passThroughSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.PassThroughSettingsProperty] = None,
    mp2Settings: Option[software.amazon.awscdk.services.medialive.CfnChannel.Mp2SettingsProperty] = None,
    ac3Settings: Option[software.amazon.awscdk.services.medialive.CfnChannel.Ac3SettingsProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.AudioCodecSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.AudioCodecSettingsProperty.Builder)
      .aacSettings(aacSettings.orNull)
      .eac3Settings(eac3Settings.orNull)
      .wavSettings(wavSettings.orNull)
      .passThroughSettings(passThroughSettings.orNull)
      .mp2Settings(mp2Settings.orNull)
      .ac3Settings(ac3Settings.orNull)
      .build()
}
