package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NetworkInputSettingsProperty {

  def apply(
    hlsInputSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.HlsInputSettingsProperty] = None,
    serverValidation: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.NetworkInputSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.NetworkInputSettingsProperty.Builder)
      .hlsInputSettings(hlsInputSettings.orNull)
      .serverValidation(serverValidation.orNull)
      .build()
}
