package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OutputGroupSettingsProperty {

  def apply(
    multiplexGroupSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.MultiplexGroupSettingsProperty] = None,
    frameCaptureGroupSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureGroupSettingsProperty] = None,
    mediaPackageGroupSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageGroupSettingsProperty] = None,
    archiveGroupSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.ArchiveGroupSettingsProperty] = None,
    hlsGroupSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.HlsGroupSettingsProperty] = None,
    rtmpGroupSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.RtmpGroupSettingsProperty] = None,
    udpGroupSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.UdpGroupSettingsProperty] = None,
    msSmoothGroupSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothGroupSettingsProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.OutputGroupSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.OutputGroupSettingsProperty.Builder)
      .multiplexGroupSettings(multiplexGroupSettings.orNull)
      .frameCaptureGroupSettings(frameCaptureGroupSettings.orNull)
      .mediaPackageGroupSettings(mediaPackageGroupSettings.orNull)
      .archiveGroupSettings(archiveGroupSettings.orNull)
      .hlsGroupSettings(hlsGroupSettings.orNull)
      .rtmpGroupSettings(rtmpGroupSettings.orNull)
      .udpGroupSettings(udpGroupSettings.orNull)
      .msSmoothGroupSettings(msSmoothGroupSettings.orNull)
      .build()
}
