package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TemporalFilterSettingsProperty {

  def apply(
    postFilterSharpening: Option[String] = None,
    strength: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.TemporalFilterSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.TemporalFilterSettingsProperty.Builder)
      .postFilterSharpening(postFilterSharpening.orNull)
      .strength(strength.orNull)
      .build()
}
