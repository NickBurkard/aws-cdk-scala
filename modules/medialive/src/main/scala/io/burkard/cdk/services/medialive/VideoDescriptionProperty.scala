package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VideoDescriptionProperty {

  def apply(
    name: Option[String] = None,
    codecSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.VideoCodecSettingsProperty] = None,
    height: Option[Number] = None,
    sharpness: Option[Number] = None,
    respondToAfd: Option[String] = None,
    scalingBehavior: Option[String] = None,
    width: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.VideoDescriptionProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.VideoDescriptionProperty.Builder)
      .name(name.orNull)
      .codecSettings(codecSettings.orNull)
      .height(height.orNull)
      .sharpness(sharpness.orNull)
      .respondToAfd(respondToAfd.orNull)
      .scalingBehavior(scalingBehavior.orNull)
      .width(width.orNull)
      .build()
}
