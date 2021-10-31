package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Fmp4HlsSettingsProperty {

  def apply(
    nielsenId3Behavior: Option[String] = None,
    timedMetadataBehavior: Option[String] = None,
    audioRenditionSets: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.Fmp4HlsSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.Fmp4HlsSettingsProperty.Builder)
      .nielsenId3Behavior(nielsenId3Behavior.orNull)
      .timedMetadataBehavior(timedMetadataBehavior.orNull)
      .audioRenditionSets(audioRenditionSets.orNull)
      .build()
}
