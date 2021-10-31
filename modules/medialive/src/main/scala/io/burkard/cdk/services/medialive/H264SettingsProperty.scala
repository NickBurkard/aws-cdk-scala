package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object H264SettingsProperty {

  def apply(
    bitrate: Option[Number] = None,
    bufFillPct: Option[Number] = None,
    temporalAq: Option[String] = None,
    parNumerator: Option[Number] = None,
    softness: Option[Number] = None,
    lookAheadRateControl: Option[String] = None,
    maxBitrate: Option[Number] = None,
    framerateNumerator: Option[Number] = None,
    qvbrQualityLevel: Option[Number] = None,
    timecodeInsertion: Option[String] = None,
    gopNumBFrames: Option[Number] = None,
    fixedAfd: Option[String] = None,
    forceFieldPictures: Option[String] = None,
    parControl: Option[String] = None,
    flickerAq: Option[String] = None,
    numRefFrames: Option[Number] = None,
    scanType: Option[String] = None,
    framerateDenominator: Option[Number] = None,
    gopBReference: Option[String] = None,
    gopSize: Option[Number] = None,
    rateControlMode: Option[String] = None,
    syntax: Option[String] = None,
    spatialAq: Option[String] = None,
    profile: Option[String] = None,
    adaptiveQuantization: Option[String] = None,
    afdSignaling: Option[String] = None,
    filterSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.H264FilterSettingsProperty] = None,
    parDenominator: Option[Number] = None,
    sceneChangeDetect: Option[String] = None,
    colorMetadata: Option[String] = None,
    bufSize: Option[Number] = None,
    qualityLevel: Option[String] = None,
    gopSizeUnits: Option[String] = None,
    minIInterval: Option[Number] = None,
    slices: Option[Number] = None,
    colorSpaceSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.H264ColorSpaceSettingsProperty] = None,
    entropyEncoding: Option[String] = None,
    framerateControl: Option[String] = None,
    subgopLength: Option[String] = None,
    level: Option[String] = None,
    gopClosedCadence: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.H264SettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.H264SettingsProperty.Builder)
      .bitrate(bitrate.orNull)
      .bufFillPct(bufFillPct.orNull)
      .temporalAq(temporalAq.orNull)
      .parNumerator(parNumerator.orNull)
      .softness(softness.orNull)
      .lookAheadRateControl(lookAheadRateControl.orNull)
      .maxBitrate(maxBitrate.orNull)
      .framerateNumerator(framerateNumerator.orNull)
      .qvbrQualityLevel(qvbrQualityLevel.orNull)
      .timecodeInsertion(timecodeInsertion.orNull)
      .gopNumBFrames(gopNumBFrames.orNull)
      .fixedAfd(fixedAfd.orNull)
      .forceFieldPictures(forceFieldPictures.orNull)
      .parControl(parControl.orNull)
      .flickerAq(flickerAq.orNull)
      .numRefFrames(numRefFrames.orNull)
      .scanType(scanType.orNull)
      .framerateDenominator(framerateDenominator.orNull)
      .gopBReference(gopBReference.orNull)
      .gopSize(gopSize.orNull)
      .rateControlMode(rateControlMode.orNull)
      .syntax(syntax.orNull)
      .spatialAq(spatialAq.orNull)
      .profile(profile.orNull)
      .adaptiveQuantization(adaptiveQuantization.orNull)
      .afdSignaling(afdSignaling.orNull)
      .filterSettings(filterSettings.orNull)
      .parDenominator(parDenominator.orNull)
      .sceneChangeDetect(sceneChangeDetect.orNull)
      .colorMetadata(colorMetadata.orNull)
      .bufSize(bufSize.orNull)
      .qualityLevel(qualityLevel.orNull)
      .gopSizeUnits(gopSizeUnits.orNull)
      .minIInterval(minIInterval.orNull)
      .slices(slices.orNull)
      .colorSpaceSettings(colorSpaceSettings.orNull)
      .entropyEncoding(entropyEncoding.orNull)
      .framerateControl(framerateControl.orNull)
      .subgopLength(subgopLength.orNull)
      .level(level.orNull)
      .gopClosedCadence(gopClosedCadence.orNull)
      .build()
}
