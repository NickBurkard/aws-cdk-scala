package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HlsOutputSettingsProperty {

  def apply(
    hlsSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.HlsSettingsProperty] = None,
    h265PackagingType: Option[String] = None,
    segmentModifier: Option[String] = None,
    nameModifier: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.HlsOutputSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.HlsOutputSettingsProperty.Builder)
      .hlsSettings(hlsSettings.orNull)
      .h265PackagingType(h265PackagingType.orNull)
      .segmentModifier(segmentModifier.orNull)
      .nameModifier(nameModifier.orNull)
      .build()
}
