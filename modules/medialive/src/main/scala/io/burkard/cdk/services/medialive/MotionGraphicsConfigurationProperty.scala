package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MotionGraphicsConfigurationProperty {

  def apply(
    motionGraphicsSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsSettingsProperty] = None,
    motionGraphicsInsertion: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsConfigurationProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsConfigurationProperty.Builder)
      .motionGraphicsSettings(motionGraphicsSettings.orNull)
      .motionGraphicsInsertion(motionGraphicsInsertion.orNull)
      .build()
}
