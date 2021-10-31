package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Ac3SettingsProperty {

  def apply(
    bitrate: Option[Number] = None,
    codingMode: Option[String] = None,
    metadataControl: Option[String] = None,
    bitstreamMode: Option[String] = None,
    dialnorm: Option[Number] = None,
    lfeFilter: Option[String] = None,
    drcProfile: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.Ac3SettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.Ac3SettingsProperty.Builder)
      .bitrate(bitrate.orNull)
      .codingMode(codingMode.orNull)
      .metadataControl(metadataControl.orNull)
      .bitstreamMode(bitstreamMode.orNull)
      .dialnorm(dialnorm.orNull)
      .lfeFilter(lfeFilter.orNull)
      .drcProfile(drcProfile.orNull)
      .build()
}
