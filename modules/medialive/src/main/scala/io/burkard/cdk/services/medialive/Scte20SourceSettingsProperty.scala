package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Scte20SourceSettingsProperty {

  def apply(
    source608ChannelNumber: Option[Number] = None,
    convert608To708: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.Scte20SourceSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.Scte20SourceSettingsProperty.Builder)
      .source608ChannelNumber(source608ChannelNumber.orNull)
      .convert608To708(convert608To708.orNull)
      .build()
}
