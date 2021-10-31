package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
