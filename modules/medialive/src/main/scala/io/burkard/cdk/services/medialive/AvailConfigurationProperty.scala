package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AvailConfigurationProperty {

  def apply(
    availSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.AvailSettingsProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.AvailConfigurationProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.AvailConfigurationProperty.Builder)
      .availSettings(availSettings.orNull)
      .build()
}
