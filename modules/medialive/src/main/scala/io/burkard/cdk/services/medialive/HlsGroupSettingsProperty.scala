package io.burkard.cdk.services.medialive

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HlsGroupSettingsProperty {

  def apply(
    redundantManifest: Option[String] = None,
    manifestDurationFormat: Option[String] = None,
    captionLanguageMappings: Option[List[_]] = None,
    captionLanguageSetting: Option[String] = None,
    timedMetadataId3Period: Option[Number] = None,
    baseUrlContent1: Option[String] = None,
    encryptionType: Option[String] = None,
    streamInfResolution: Option[String] = None,
    segmentationMode: Option[String] = None,
    keepSegments: Option[Number] = None,
    mode: Option[String] = None,
    codecSpecification: Option[String] = None,
    ivInManifest: Option[String] = None,
    destination: Option[software.amazon.awscdk.services.medialive.CfnChannel.OutputLocationRefProperty] = None,
    hlsCdnSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.HlsCdnSettingsProperty] = None,
    baseUrlManifest: Option[String] = None,
    keyFormatVersions: Option[String] = None,
    constantIv: Option[String] = None,
    minSegmentLength: Option[Number] = None,
    segmentsPerSubdirectory: Option[Number] = None,
    programDateTime: Option[String] = None,
    adMarkers: Option[List[String]] = None,
    discontinuityTags: Option[String] = None,
    tsFileMode: Option[String] = None,
    keyFormat: Option[String] = None,
    timestampDeltaMilliseconds: Option[Number] = None,
    hlsId3SegmentTagging: Option[String] = None,
    inputLossAction: Option[String] = None,
    baseUrlContent: Option[String] = None,
    incompleteSegmentBehavior: Option[String] = None,
    iFrameOnlyPlaylists: Option[String] = None,
    manifestCompression: Option[String] = None,
    outputSelection: Option[String] = None,
    indexNSegments: Option[Number] = None,
    keyProviderSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.KeyProviderSettingsProperty] = None,
    ivSource: Option[String] = None,
    baseUrlManifest1: Option[String] = None,
    clientCache: Option[String] = None,
    timedMetadataId3Frame: Option[String] = None,
    segmentLength: Option[Number] = None,
    directoryStructure: Option[String] = None,
    programDateTimePeriod: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.HlsGroupSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.HlsGroupSettingsProperty.Builder)
      .redundantManifest(redundantManifest.orNull)
      .manifestDurationFormat(manifestDurationFormat.orNull)
      .captionLanguageMappings(captionLanguageMappings.map(_.asJava).orNull)
      .captionLanguageSetting(captionLanguageSetting.orNull)
      .timedMetadataId3Period(timedMetadataId3Period.orNull)
      .baseUrlContent1(baseUrlContent1.orNull)
      .encryptionType(encryptionType.orNull)
      .streamInfResolution(streamInfResolution.orNull)
      .segmentationMode(segmentationMode.orNull)
      .keepSegments(keepSegments.orNull)
      .mode(mode.orNull)
      .codecSpecification(codecSpecification.orNull)
      .ivInManifest(ivInManifest.orNull)
      .destination(destination.orNull)
      .hlsCdnSettings(hlsCdnSettings.orNull)
      .baseUrlManifest(baseUrlManifest.orNull)
      .keyFormatVersions(keyFormatVersions.orNull)
      .constantIv(constantIv.orNull)
      .minSegmentLength(minSegmentLength.orNull)
      .segmentsPerSubdirectory(segmentsPerSubdirectory.orNull)
      .programDateTime(programDateTime.orNull)
      .adMarkers(adMarkers.map(_.asJava).orNull)
      .discontinuityTags(discontinuityTags.orNull)
      .tsFileMode(tsFileMode.orNull)
      .keyFormat(keyFormat.orNull)
      .timestampDeltaMilliseconds(timestampDeltaMilliseconds.orNull)
      .hlsId3SegmentTagging(hlsId3SegmentTagging.orNull)
      .inputLossAction(inputLossAction.orNull)
      .baseUrlContent(baseUrlContent.orNull)
      .incompleteSegmentBehavior(incompleteSegmentBehavior.orNull)
      .iFrameOnlyPlaylists(iFrameOnlyPlaylists.orNull)
      .manifestCompression(manifestCompression.orNull)
      .outputSelection(outputSelection.orNull)
      .indexNSegments(indexNSegments.orNull)
      .keyProviderSettings(keyProviderSettings.orNull)
      .ivSource(ivSource.orNull)
      .baseUrlManifest1(baseUrlManifest1.orNull)
      .clientCache(clientCache.orNull)
      .timedMetadataId3Frame(timedMetadataId3Frame.orNull)
      .segmentLength(segmentLength.orNull)
      .directoryStructure(directoryStructure.orNull)
      .programDateTimePeriod(programDateTimePeriod.orNull)
      .build()
}
