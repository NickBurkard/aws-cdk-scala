package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object M3u8SettingsProperty {

  def apply(
    pmtPid: Option[String] = None,
    pcrPeriod: Option[Number] = None,
    pcrPid: Option[String] = None,
    nielsenId3Behavior: Option[String] = None,
    audioPids: Option[String] = None,
    transportStreamId: Option[Number] = None,
    audioFramesPerPes: Option[Number] = None,
    scte35Pid: Option[String] = None,
    scte35Behavior: Option[String] = None,
    pcrControl: Option[String] = None,
    timedMetadataPid: Option[String] = None,
    ecmPid: Option[String] = None,
    timedMetadataBehavior: Option[String] = None,
    patInterval: Option[Number] = None,
    pmtInterval: Option[Number] = None,
    programNum: Option[Number] = None,
    videoPid: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.M3u8SettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.M3u8SettingsProperty.Builder)
      .pmtPid(pmtPid.orNull)
      .pcrPeriod(pcrPeriod.orNull)
      .pcrPid(pcrPid.orNull)
      .nielsenId3Behavior(nielsenId3Behavior.orNull)
      .audioPids(audioPids.orNull)
      .transportStreamId(transportStreamId.orNull)
      .audioFramesPerPes(audioFramesPerPes.orNull)
      .scte35Pid(scte35Pid.orNull)
      .scte35Behavior(scte35Behavior.orNull)
      .pcrControl(pcrControl.orNull)
      .timedMetadataPid(timedMetadataPid.orNull)
      .ecmPid(ecmPid.orNull)
      .timedMetadataBehavior(timedMetadataBehavior.orNull)
      .patInterval(patInterval.orNull)
      .pmtInterval(pmtInterval.orNull)
      .programNum(programNum.orNull)
      .videoPid(videoPid.orNull)
      .build()
}
