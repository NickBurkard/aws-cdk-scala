package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VideoSelectorProperty {

  def apply(
    selectorSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorSettingsProperty] = None,
    colorSpaceUsage: Option[String] = None,
    colorSpaceSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorColorSpaceSettingsProperty] = None,
    colorSpace: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProperty.Builder)
      .selectorSettings(selectorSettings.orNull)
      .colorSpaceUsage(colorSpaceUsage.orNull)
      .colorSpaceSettings(colorSpaceSettings.orNull)
      .colorSpace(colorSpace.orNull)
      .build()
}
