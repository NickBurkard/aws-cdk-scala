package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object H265SettingsProperty {

  def apply(
    bitrate: Option[Number] = None,
    tier: Option[String] = None,
    fixedAfd: Option[String] = None,
    flickerAq: Option[String] = None,
    scanType: Option[String] = None,
    framerateDenominator: Option[Number] = None,
    gopSizeUnits: Option[String] = None,
    parNumerator: Option[Number] = None,
    alternativeTransferFunction: Option[String] = None,
    lookAheadRateControl: Option[String] = None,
    maxBitrate: Option[Number] = None,
    framerateNumerator: Option[Number] = None,
    qvbrQualityLevel: Option[Number] = None,
    timecodeInsertion: Option[String] = None,
    gopSize: Option[Number] = None,
    rateControlMode: Option[String] = None,
    profile: Option[String] = None,
    adaptiveQuantization: Option[String] = None,
    afdSignaling: Option[String] = None,
    filterSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.H265FilterSettingsProperty] = None,
    parDenominator: Option[Number] = None,
    sceneChangeDetect: Option[String] = None,
    colorMetadata: Option[String] = None,
    bufSize: Option[Number] = None,
    minIInterval: Option[Number] = None,
    slices: Option[Number] = None,
    colorSpaceSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.H265ColorSpaceSettingsProperty] = None,
    level: Option[String] = None,
    gopClosedCadence: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.H265SettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.H265SettingsProperty.Builder)
      .bitrate(bitrate.orNull)
      .tier(tier.orNull)
      .fixedAfd(fixedAfd.orNull)
      .flickerAq(flickerAq.orNull)
      .scanType(scanType.orNull)
      .framerateDenominator(framerateDenominator.orNull)
      .gopSizeUnits(gopSizeUnits.orNull)
      .parNumerator(parNumerator.orNull)
      .alternativeTransferFunction(alternativeTransferFunction.orNull)
      .lookAheadRateControl(lookAheadRateControl.orNull)
      .maxBitrate(maxBitrate.orNull)
      .framerateNumerator(framerateNumerator.orNull)
      .qvbrQualityLevel(qvbrQualityLevel.orNull)
      .timecodeInsertion(timecodeInsertion.orNull)
      .gopSize(gopSize.orNull)
      .rateControlMode(rateControlMode.orNull)
      .profile(profile.orNull)
      .adaptiveQuantization(adaptiveQuantization.orNull)
      .afdSignaling(afdSignaling.orNull)
      .filterSettings(filterSettings.orNull)
      .parDenominator(parDenominator.orNull)
      .sceneChangeDetect(sceneChangeDetect.orNull)
      .colorMetadata(colorMetadata.orNull)
      .bufSize(bufSize.orNull)
      .minIInterval(minIInterval.orNull)
      .slices(slices.orNull)
      .colorSpaceSettings(colorSpaceSettings.orNull)
      .level(level.orNull)
      .gopClosedCadence(gopClosedCadence.orNull)
      .build()
}
