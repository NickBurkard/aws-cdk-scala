package io.burkard.cdk.services.appstream

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationSettingsProperty {

  def apply(
    enabled: Boolean,
    settingsGroup: Option[String] = None
  ): software.amazon.awscdk.services.appstream.CfnStack.ApplicationSettingsProperty =
    (new software.amazon.awscdk.services.appstream.CfnStack.ApplicationSettingsProperty.Builder)
      .enabled(enabled)
      .settingsGroup(settingsGroup.orNull)
      .build()
}
