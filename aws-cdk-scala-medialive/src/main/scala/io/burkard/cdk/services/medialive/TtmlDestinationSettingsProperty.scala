package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TtmlDestinationSettingsProperty {

  def apply(
    styleControl: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.TtmlDestinationSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.TtmlDestinationSettingsProperty.Builder)
      .styleControl(styleControl.orNull)
      .build()
}
