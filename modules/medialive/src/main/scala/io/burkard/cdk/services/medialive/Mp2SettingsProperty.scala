package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Mp2SettingsProperty {

  def apply(
    sampleRate: Option[Number] = None,
    bitrate: Option[Number] = None,
    codingMode: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.Mp2SettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.Mp2SettingsProperty.Builder)
      .sampleRate(sampleRate.orNull)
      .bitrate(bitrate.orNull)
      .codingMode(codingMode.orNull)
      .build()
}
