package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UdpContainerSettingsProperty {

  def apply(
    m2TsSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.M2tsSettingsProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.UdpContainerSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.UdpContainerSettingsProperty.Builder)
      .m2TsSettings(m2TsSettings.orNull)
      .build()
}
