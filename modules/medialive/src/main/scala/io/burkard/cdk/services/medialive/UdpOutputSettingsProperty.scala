package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UdpOutputSettingsProperty {

  def apply(
    containerSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.UdpContainerSettingsProperty] = None,
    fecOutputSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.FecOutputSettingsProperty] = None,
    destination: Option[software.amazon.awscdk.services.medialive.CfnChannel.OutputLocationRefProperty] = None,
    bufferMsec: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.UdpOutputSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.UdpOutputSettingsProperty.Builder)
      .containerSettings(containerSettings.orNull)
      .fecOutputSettings(fecOutputSettings.orNull)
      .destination(destination.orNull)
      .bufferMsec(bufferMsec.orNull)
      .build()
}
