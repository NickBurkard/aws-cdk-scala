package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Mpeg2SettingsProperty {

  def apply(
    displayAspectRatio: Option[String] = None,
    scanType: Option[String] = None,
    framerateDenominator: Option[Number] = None,
    gopSize: Option[Number] = None,
    filterSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2FilterSettingsProperty] = None,
    colorMetadata: Option[String] = None,
    gopSizeUnits: Option[String] = None,
    framerateNumerator: Option[Number] = None,
    timecodeInsertion: Option[String] = None,
    gopNumBFrames: Option[Number] = None,
    fixedAfd: Option[String] = None,
    adaptiveQuantization: Option[String] = None,
    afdSignaling: Option[String] = None,
    subgopLength: Option[String] = None,
    gopClosedCadence: Option[Number] = None,
    colorSpace: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2SettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2SettingsProperty.Builder)
      .displayAspectRatio(displayAspectRatio.orNull)
      .scanType(scanType.orNull)
      .framerateDenominator(framerateDenominator.orNull)
      .gopSize(gopSize.orNull)
      .filterSettings(filterSettings.orNull)
      .colorMetadata(colorMetadata.orNull)
      .gopSizeUnits(gopSizeUnits.orNull)
      .framerateNumerator(framerateNumerator.orNull)
      .timecodeInsertion(timecodeInsertion.orNull)
      .gopNumBFrames(gopNumBFrames.orNull)
      .fixedAfd(fixedAfd.orNull)
      .adaptiveQuantization(adaptiveQuantization.orNull)
      .afdSignaling(afdSignaling.orNull)
      .subgopLength(subgopLength.orNull)
      .gopClosedCadence(gopClosedCadence.orNull)
      .colorSpace(colorSpace.orNull)
      .build()
}
