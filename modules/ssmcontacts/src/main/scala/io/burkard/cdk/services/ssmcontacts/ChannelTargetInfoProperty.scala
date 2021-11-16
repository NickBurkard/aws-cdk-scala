package io.burkard.cdk.services.ssmcontacts

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ChannelTargetInfoProperty {

  def apply(
    retryIntervalInMinutes: Number,
    channelId: String
  ): software.amazon.awscdk.services.ssmcontacts.CfnContact.ChannelTargetInfoProperty =
    (new software.amazon.awscdk.services.ssmcontacts.CfnContact.ChannelTargetInfoProperty.Builder)
      .retryIntervalInMinutes(retryIntervalInMinutes)
      .channelId(channelId)
      .build()
}
