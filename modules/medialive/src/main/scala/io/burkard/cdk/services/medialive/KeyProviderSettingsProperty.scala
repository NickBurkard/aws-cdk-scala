package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KeyProviderSettingsProperty {

  def apply(
    staticKeySettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.StaticKeySettingsProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.KeyProviderSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.KeyProviderSettingsProperty.Builder)
      .staticKeySettings(staticKeySettings.orNull)
      .build()
}
