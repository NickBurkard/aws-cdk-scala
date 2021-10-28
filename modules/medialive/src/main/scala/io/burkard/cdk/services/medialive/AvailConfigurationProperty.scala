package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AvailConfigurationProperty {

  def apply(
    availSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.AvailSettingsProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.AvailConfigurationProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.AvailConfigurationProperty.Builder)
      .availSettings(availSettings.orNull)
      .build()
}
