package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VideoSelectorSettingsProperty {

  def apply(
    videoSelectorProgramId: Option[software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProgramIdProperty] = None,
    videoSelectorPid: Option[software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorPidProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorSettingsProperty.Builder)
      .videoSelectorProgramId(videoSelectorProgramId.orNull)
      .videoSelectorPid(videoSelectorPid.orNull)
      .build()
}
