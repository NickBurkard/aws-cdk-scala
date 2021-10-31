package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InputDeviceSettingsProperty {

  def apply(
    id: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnInput.InputDeviceSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnInput.InputDeviceSettingsProperty.Builder)
      .id(id.orNull)
      .build()
}
