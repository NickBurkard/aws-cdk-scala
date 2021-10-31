package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object M2tsSettingsProperty {

  def apply(
    pcrPeriod: Option[Number] = None,
    nielsenId3Behavior: Option[String] = None,
    transportStreamId: Option[Number] = None,
    ebif: Option[String] = None,
    nullPacketBitrate: Option[Number] = None,
    audioStreamType: Option[String] = None,
    klvDataPids: Option[String] = None,
    etvSignalPid: Option[String] = None,
    pmtPid: Option[String] = None,
    esRateInPes: Option[String] = None,
    bitrate: Option[Number] = None,
    pcrPid: Option[String] = None,
    ccDescriptor: Option[String] = None,
    timedMetadataPid: Option[String] = None,
    ecmPid: Option[String] = None,
    timedMetadataBehavior: Option[String] = None,
    scte35Control: Option[String] = None,
    audioPids: Option[String] = None,
    dvbTeletextPid: Option[String] = None,
    aribCaptionsPid: Option[String] = None,
    patInterval: Option[Number] = None,
    pmtInterval: Option[Number] = None,
    segmentationStyle: Option[String] = None,
    audioBufferModel: Option[String] = None,
    ebpAudioInterval: Option[String] = None,
    audioFramesPerPes: Option[Number] = None,
    klv: Option[String] = None,
    rateMode: Option[String] = None,
    scte35Pid: Option[String] = None,
    segmentationTime: Option[Number] = None,
    dvbTdtSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.DvbTdtSettingsProperty] = None,
    segmentationMarkers: Option[String] = None,
    etvPlatformPid: Option[String] = None,
    fragmentTime: Option[Number] = None,
    dvbSdtSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.DvbSdtSettingsProperty] = None,
    ebpLookaheadMs: Option[Number] = None,
    ebpPlacement: Option[String] = None,
    aribCaptionsPidControl: Option[String] = None,
    programNum: Option[Number] = None,
    videoPid: Option[String] = None,
    dvbSubPids: Option[String] = None,
    absentInputAudioBehavior: Option[String] = None,
    dvbNitSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.DvbNitSettingsProperty] = None,
    bufferModel: Option[String] = None,
    scte27Pids: Option[String] = None,
    arib: Option[String] = None,
    pcrControl: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.M2tsSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.M2tsSettingsProperty.Builder)
      .pcrPeriod(pcrPeriod.orNull)
      .nielsenId3Behavior(nielsenId3Behavior.orNull)
      .transportStreamId(transportStreamId.orNull)
      .ebif(ebif.orNull)
      .nullPacketBitrate(nullPacketBitrate.orNull)
      .audioStreamType(audioStreamType.orNull)
      .klvDataPids(klvDataPids.orNull)
      .etvSignalPid(etvSignalPid.orNull)
      .pmtPid(pmtPid.orNull)
      .esRateInPes(esRateInPes.orNull)
      .bitrate(bitrate.orNull)
      .pcrPid(pcrPid.orNull)
      .ccDescriptor(ccDescriptor.orNull)
      .timedMetadataPid(timedMetadataPid.orNull)
      .ecmPid(ecmPid.orNull)
      .timedMetadataBehavior(timedMetadataBehavior.orNull)
      .scte35Control(scte35Control.orNull)
      .audioPids(audioPids.orNull)
      .dvbTeletextPid(dvbTeletextPid.orNull)
      .aribCaptionsPid(aribCaptionsPid.orNull)
      .patInterval(patInterval.orNull)
      .pmtInterval(pmtInterval.orNull)
      .segmentationStyle(segmentationStyle.orNull)
      .audioBufferModel(audioBufferModel.orNull)
      .ebpAudioInterval(ebpAudioInterval.orNull)
      .audioFramesPerPes(audioFramesPerPes.orNull)
      .klv(klv.orNull)
      .rateMode(rateMode.orNull)
      .scte35Pid(scte35Pid.orNull)
      .segmentationTime(segmentationTime.orNull)
      .dvbTdtSettings(dvbTdtSettings.orNull)
      .segmentationMarkers(segmentationMarkers.orNull)
      .etvPlatformPid(etvPlatformPid.orNull)
      .fragmentTime(fragmentTime.orNull)
      .dvbSdtSettings(dvbSdtSettings.orNull)
      .ebpLookaheadMs(ebpLookaheadMs.orNull)
      .ebpPlacement(ebpPlacement.orNull)
      .aribCaptionsPidControl(aribCaptionsPidControl.orNull)
      .programNum(programNum.orNull)
      .videoPid(videoPid.orNull)
      .dvbSubPids(dvbSubPids.orNull)
      .absentInputAudioBehavior(absentInputAudioBehavior.orNull)
      .dvbNitSettings(dvbNitSettings.orNull)
      .bufferModel(bufferModel.orNull)
      .scte27Pids(scte27Pids.orNull)
      .arib(arib.orNull)
      .pcrControl(pcrControl.orNull)
      .build()
}
