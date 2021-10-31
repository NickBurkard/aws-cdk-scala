package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InputChannelLevelProperty {

  def apply(
    gain: Option[Number] = None,
    inputChannel: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.InputChannelLevelProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.InputChannelLevelProperty.Builder)
      .gain(gain.orNull)
      .inputChannel(inputChannel.orNull)
      .build()
}
