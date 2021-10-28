package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InputDeviceSettingsProperty {

  def apply(
    id: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnInput.InputDeviceSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnInput.InputDeviceSettingsProperty.Builder)
      .id(id.orNull)
      .build()
}
