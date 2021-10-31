package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AudioOnlyHlsSettingsProperty {

  def apply(
    audioGroupId: Option[String] = None,
    audioTrackType: Option[String] = None,
    audioOnlyImage: Option[software.amazon.awscdk.services.medialive.CfnChannel.InputLocationProperty] = None,
    segmentType: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.AudioOnlyHlsSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.AudioOnlyHlsSettingsProperty.Builder)
      .audioGroupId(audioGroupId.orNull)
      .audioTrackType(audioTrackType.orNull)
      .audioOnlyImage(audioOnlyImage.orNull)
      .segmentType(segmentType.orNull)
      .build()
}
