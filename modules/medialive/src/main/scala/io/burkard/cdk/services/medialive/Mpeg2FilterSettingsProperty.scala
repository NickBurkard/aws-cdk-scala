package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Mpeg2FilterSettingsProperty {

  def apply(
    temporalFilterSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.TemporalFilterSettingsProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2FilterSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2FilterSettingsProperty.Builder)
      .temporalFilterSettings(temporalFilterSettings.orNull)
      .build()
}
