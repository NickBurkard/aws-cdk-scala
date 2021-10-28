package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object H265FilterSettingsProperty {

  def apply(
    temporalFilterSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.TemporalFilterSettingsProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.H265FilterSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.H265FilterSettingsProperty.Builder)
      .temporalFilterSettings(temporalFilterSettings.orNull)
      .build()
}
