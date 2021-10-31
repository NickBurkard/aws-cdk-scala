package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Eac3SettingsProperty {

  def apply(
    drcRf: Option[String] = None,
    lfeControl: Option[String] = None,
    attenuationControl: Option[String] = None,
    surroundMode: Option[String] = None,
    dcFilter: Option[String] = None,
    phaseControl: Option[String] = None,
    passthroughControl: Option[String] = None,
    loRoSurroundMixLevel: Option[Number] = None,
    loRoCenterMixLevel: Option[Number] = None,
    stereoDownmix: Option[String] = None,
    bitrate: Option[Number] = None,
    codingMode: Option[String] = None,
    metadataControl: Option[String] = None,
    bitstreamMode: Option[String] = None,
    dialnorm: Option[Number] = None,
    drcLine: Option[String] = None,
    surroundExMode: Option[String] = None,
    ltRtSurroundMixLevel: Option[Number] = None,
    ltRtCenterMixLevel: Option[Number] = None,
    lfeFilter: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.Eac3SettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.Eac3SettingsProperty.Builder)
      .drcRf(drcRf.orNull)
      .lfeControl(lfeControl.orNull)
      .attenuationControl(attenuationControl.orNull)
      .surroundMode(surroundMode.orNull)
      .dcFilter(dcFilter.orNull)
      .phaseControl(phaseControl.orNull)
      .passthroughControl(passthroughControl.orNull)
      .loRoSurroundMixLevel(loRoSurroundMixLevel.orNull)
      .loRoCenterMixLevel(loRoCenterMixLevel.orNull)
      .stereoDownmix(stereoDownmix.orNull)
      .bitrate(bitrate.orNull)
      .codingMode(codingMode.orNull)
      .metadataControl(metadataControl.orNull)
      .bitstreamMode(bitstreamMode.orNull)
      .dialnorm(dialnorm.orNull)
      .drcLine(drcLine.orNull)
      .surroundExMode(surroundExMode.orNull)
      .ltRtSurroundMixLevel(ltRtSurroundMixLevel.orNull)
      .ltRtCenterMixLevel(ltRtCenterMixLevel.orNull)
      .lfeFilter(lfeFilter.orNull)
      .build()
}
