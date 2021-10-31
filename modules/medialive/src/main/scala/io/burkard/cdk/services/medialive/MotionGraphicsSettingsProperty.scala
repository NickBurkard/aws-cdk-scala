package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MotionGraphicsSettingsProperty {

  def apply(
    htmlMotionGraphicsSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.HtmlMotionGraphicsSettingsProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsSettingsProperty.Builder)
      .htmlMotionGraphicsSettings(htmlMotionGraphicsSettings.orNull)
      .build()
}
