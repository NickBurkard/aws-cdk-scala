package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OutputSettingsProperty {

  def apply(
    multiplexOutputSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.MultiplexOutputSettingsProperty] = None,
    frameCaptureOutputSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureOutputSettingsProperty] = None,
    udpOutputSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.UdpOutputSettingsProperty] = None,
    archiveOutputSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.ArchiveOutputSettingsProperty] = None,
    msSmoothOutputSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothOutputSettingsProperty] = None,
    hlsOutputSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.HlsOutputSettingsProperty] = None,
    rtmpOutputSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.RtmpOutputSettingsProperty] = None,
    mediaPackageOutputSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageOutputSettingsProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.OutputSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.OutputSettingsProperty.Builder)
      .multiplexOutputSettings(multiplexOutputSettings.orNull)
      .frameCaptureOutputSettings(frameCaptureOutputSettings.orNull)
      .udpOutputSettings(udpOutputSettings.orNull)
      .archiveOutputSettings(archiveOutputSettings.orNull)
      .msSmoothOutputSettings(msSmoothOutputSettings.orNull)
      .hlsOutputSettings(hlsOutputSettings.orNull)
      .rtmpOutputSettings(rtmpOutputSettings.orNull)
      .mediaPackageOutputSettings(mediaPackageOutputSettings.orNull)
      .build()
}
