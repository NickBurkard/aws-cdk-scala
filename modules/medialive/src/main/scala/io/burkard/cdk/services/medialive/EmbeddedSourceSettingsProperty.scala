package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EmbeddedSourceSettingsProperty {

  def apply(
    scte20Detection: Option[String] = None,
    source608ChannelNumber: Option[Number] = None,
    source608TrackNumber: Option[Number] = None,
    convert608To708: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedSourceSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedSourceSettingsProperty.Builder)
      .scte20Detection(scte20Detection.orNull)
      .source608ChannelNumber(source608ChannelNumber.orNull)
      .source608TrackNumber(source608TrackNumber.orNull)
      .convert608To708(convert608To708.orNull)
      .build()
}
