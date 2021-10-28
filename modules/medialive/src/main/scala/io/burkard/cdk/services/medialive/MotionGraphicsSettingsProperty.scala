package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MotionGraphicsSettingsProperty {

  def apply(
    htmlMotionGraphicsSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.HtmlMotionGraphicsSettingsProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsSettingsProperty.Builder)
      .htmlMotionGraphicsSettings(htmlMotionGraphicsSettings.orNull)
      .build()
}
